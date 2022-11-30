import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class b11866 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        Queue<Integer> q = new LinkedList<>();
        StringBuffer sb = new StringBuffer();

        sb.append("<");

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        for(int i = 1; i<=a; i++){
            q.add(i);
        }
        int cnt = 1;

        while(!(q.size() ==1)){
            if(b>cnt){
                int c = q.poll();
                cnt++;
                q.add(c);
            }else if(b==cnt){
                int c = q.poll();
                cnt = 1;
                sb.append(c).append(", ");
            }
        }
        sb.append(q.poll()).append(">");
        System.out.println(sb);
    }
}
