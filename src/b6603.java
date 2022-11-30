import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class b6603 {
    static int N;
    static StringBuilder sb = new StringBuilder();
    static int[] answer;
    static boolean[] visit;
    static int[] arr;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            N = Integer.parseInt(st.nextToken());
            if(N==0){
                System.out.println(sb);
                break;
            }
            answer = new int[6];
            visit = new boolean[N];
            arr = new int[N];
            for (int i = 0; i < N; i++) {
                arr[i] = Integer.parseInt(st.nextToken());
            }
            dfs(0, 0);
            sb.append("\n");
        }

    }

    private static void dfs(int start, int depth) {
        if (depth == 6) {
            for(int i = 0; i<N; i++){
                if(visit[i]){
                    sb.append(arr[i]).append(" ");
                }
            }

            sb.append("\n");
            return;
        }
        for (int i = start; i < N; i++) {

            visit[i] = true;
            dfs(i + 1, depth + 1);
            visit[i] = false;


        }
    }
}
