import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class b2164 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        Queue<Integer> q = new LinkedList<>();

        for(int i = 1; i<=a; i++){
            q.add(i);
        }
        while(q.size()!=1){
            q.poll();
            int b = q.poll();
            q.add(b);
        }
        System.out.println(q.poll());
    }

}
