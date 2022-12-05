import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class solution42586 {
    public static int[] solution(int[] progresses, int[] speeds) {


        ArrayList<Integer> list = new ArrayList<>();
        Queue<Integer> Q = new LinkedList<>();
        ArrayList<Integer> answer = new ArrayList<>();

        for(int x : progresses)list.add(100-x);

        for(int i = 0; i< speeds.length; i++){
            if(list.get(i)%speeds[i]==0){
                Q.add(list.get(i)/speeds[i]);
            }else{
                Q.add(list.get(i)/speeds[i]+1);
            }
        }


        int cnt = 1;
        int temp = Q.poll();
        int s = Q.size();
        while(!Q.isEmpty()){
            if(temp>=Q.peek()){
                cnt++;
                Q.poll();
            }else{
                temp=Q.poll();
                answer.add(cnt);
                cnt = 1;
            }
        }

        answer.add(cnt);

        int[] a = new int[answer.size()];
        for(int i = 0; i<answer.size(); i++){
            a[i] = answer.get(i);
        }

        return a;
    }
}
