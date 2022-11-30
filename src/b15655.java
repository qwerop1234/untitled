import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class b15655 {
    static int N;
    static int M;
    static int[] answer;
    static StringBuilder sb = new StringBuilder();
    static boolean[] visit;
    static int[] arr;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        arr = new int[N];
        st = new StringTokenizer(br.readLine());

        for(int i = 0; i<N; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr);


        answer = new int[M];
        visit = new boolean[N+1];

        dfs(0,0);

        System.out.println(sb);
    }

    private static void dfs(int depth, int start) {

        if(depth==M){
            for(int x : answer){
                sb.append(x).append(" ");
            }
            sb.append("\n");
            return;
        }

        for(int i = start; i<N; i++){

            answer[depth]=arr[i];
            dfs(depth+1,i+1);

        }

    }
}
