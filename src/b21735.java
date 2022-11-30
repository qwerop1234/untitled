
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class b21735 {
    static int N;
    static int M;
    static int[] snow;
    static int[] answer;
    static int max = 0;


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        snow = new int[N+1];
        answer = new int[M+1];
        snow[0] = 1;

        st = new StringTokenizer(br.readLine());
        for(int i = 1; i<=N; i++){
            snow[i] = Integer.parseInt(st.nextToken());
        }

        dfs(0,0,1);

        System.out.println(max);

    }

    private static void dfs(int depth, int temp, int cnt) {

        answer[depth] = snow[temp];

        if(depth==M||temp==N){
            if(cnt>max){
                max = cnt;
            }
            return;
        }

        if(temp<N){

            dfs(depth+1,temp+1,cnt+snow[temp+1]);
        }


        if(temp<N-1){

            dfs(depth+1,temp+2,cnt/2+snow[temp+2]);
        }


    }
}
