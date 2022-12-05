import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Stack;

public class solution42885 {
    public static int solution(int[] people, int limit) {
        ArrayList<Integer> list = new ArrayList<>();

        int answer = 0;

        for(int i = 0; i< people.length; i++){
            list.add(people[i]);
        }
        Collections.sort(list);



        int min = 0;
        int max = list.size()-1;

        for(int i = 0; i<list.size();i++){
            if(list.get(min)+list.get(max)<=limit){
                answer = answer + 1;
                min = min + 1;
                max = max - 1;
            }else{
                answer = answer + 1;
                max = max - 1;
            }
            if(max==min){
                answer = answer + 1;
                break;
            }
            if(min>max){
                break;
            }
        }




        return answer;
    }
}
