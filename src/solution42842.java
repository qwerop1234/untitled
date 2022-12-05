import java.util.ArrayList;

public class solution42842 {
    public static int[] solution(int brown, int yellow) {
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();


        int[] answer = {};

        int sum = brown + yellow;

        for(int i  = 1; i<=sum; i++){
            if(sum%i==0){
                list.add(i);
            }
        }

        if(list.size()%2!=0){
            answer = new int[]{(int) Math.sqrt(sum),(int)Math.sqrt(sum)};
            return answer;
        }
        if(list.size()%2==0){
            for(int i = 0; i<list.size()/2; i++){
                list1.add(list.get(i));
            }
            for(int i = list.size()-1; i>=list.size()/2; i--){
                list2.add(list.get(i));
            }
        }
        for(int i = 0; i<list1.size(); i++){
            if((list2.get(i)-2)*(list1.get(i)-2)==yellow){
                answer = new int[]{list2.get(i), list1.get(i)};
                return answer;
            }
        }

        return answer;

    }
}
