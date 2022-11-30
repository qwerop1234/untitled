import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class b10974 {
    static int N;
    static int[] answer;
    static int[] arr;
    static boolean[] visit;
    static StringBuilder sb = new StringBuilder();


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());
        answer = new int[N];
        arr = new int[N];
        visit = new boolean[N];

        for(int i = 0; i<N; i++){
            arr[i] = i+1;
        }


        dfs(0);

        System.out.println(sb);

    }

    private static void dfs(int depth) {

        if(depth==N){
            for(int x : answer){
                sb.append(x).append(" ");
            }
            sb.append("\n");
            return;
        }

        for(int i = 0; i<N; i++){
            if(!visit[i]){
                visit[i] = true;
                answer[depth] = arr[i];
                dfs(depth+1);
                visit[i] = false;
            }


        }
    }
}
