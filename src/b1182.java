import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class b1182 {
    static int N;
    static int M;
    static int[] arr;
    static boolean[] visit;
    static int score;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        arr = new int[N];
        visit = new boolean[N];

        st = new StringTokenizer(br.readLine());

        for(int i = 0; i<N; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }


        dfs(0,0);
        if(M==0){
            score--;
        }

        System.out.println(score);
    }

    private static void dfs(int depth, int cnt) {
        if(depth==N){
            if(cnt==M){
                score++;
            }
            return;
        }

        dfs(depth+1,cnt);
        dfs(depth+1,cnt+arr[depth]);

    }
}
