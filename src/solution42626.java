import java.util.Arrays;
import java.util.PriorityQueue;

public class solution42626 {
    public static int solution(int[] scoville, int K) {
        PriorityQueue<Integer> sco = new PriorityQueue<>();

        Arrays.sort(scoville);

        for(int x : scoville)sco.add(x);

        int cnt = 0;

        while(sco.peek()<K){
            sco.add(sco.poll()+sco.poll()*2);
            cnt++;
            if(sco.size()==1&&sco.peek()<K){
                return -1;
            }
        }




        return cnt;
    }
}
