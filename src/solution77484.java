import java.util.ArrayList;
import java.util.Collections;

public class solution77484 {
    public static int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = new int[2];

        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> list1 = new ArrayList<>();

        int zero = 0;

        for(int x : lottos){
            if(x!=0){
                list.add(x);
            }else{
                zero++;
            }
        }
        for(int x : win_nums)list1.add(x);

        Collections.sort(list);
        Collections.sort(list1);

        int cnt = 0;

        for(int i = 0; i<list.size(); i++){
            for(int j = i; j<list1.size(); j++){
                if(list.get(i)==list1.get(j)){
                    cnt++;
                }
            }
        }


        answer[1] = 7-cnt;
        answer[0] = 7-cnt-zero;
        if(answer[0]>=6){
            answer[0]=6;
        }

        if(answer[1]>=6){
            answer[1]=6;
        }

        return answer;
    }
}
