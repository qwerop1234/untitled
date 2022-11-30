
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class b15649 {
    static int N;
    static int M;
    static boolean[] visit;
    static int[] answer;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        visit = new boolean[N+1];
        answer = new int[M+1];

        bfs(0);

        System.out.println(sb);

    }

    private static void bfs(int temp) {

        if(temp==M){
            for(int i = 0; i<M; i++){
                sb.append(answer[i]).append(" ");
            }
            sb.append("\n");
            return;
        }


        for(int i = 1; i<=N; i++){
            if(visit[i]){
                continue;
            }
            visit[i] = true;
            answer[temp] = i;
            bfs(temp+1);
            visit[i] = false;
        }

    }
}
