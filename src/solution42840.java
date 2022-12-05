import java.util.ArrayList;
import java.util.Collections;

public class solution42840 {
    public static int[] solution(int[] answers) {

        int[] s1 = {1,2,3,4,5};
        int[] s2 = {2,1,2,3,2,4,2,5};
        int[] s3 = {3,3,1,1,2,2,4,4,5,5};
        ArrayList<Integer> list = new ArrayList<>();
        int[] temp = new int[3];




        for(int i = 0; i<answers.length;i++){
            if(answers[i]==s1[i%5]){
                temp[0]++;
            }
            if(answers[i]==s2[i%8]){
                temp[1]++;
            }
            if(answers[i]==s3[i%10]){
                temp[2]++;
            }
        }
        int max = 0;
        for(int x : temp){
            if(x>max){
                max = x;
            }
        }
        for(int i = 0; i< temp.length;i++){
            if(temp[i]==max){
                list.add(i);
            }
        }
        int[] answer = new int [list.size()];
        Collections.sort(list);
        for(int i = 0; i<list.size();i++){
            answer[i] = list.get(i)+1;
        }

        return answer;
    }
}
