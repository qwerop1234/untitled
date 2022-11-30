import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class b18429 {
    static int[] N;
    static int K;
    static boolean[] visit;
    static int cnt = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = new int [Integer.parseInt(st.nextToken())];
        K = Integer.parseInt(st.nextToken());
        visit = new boolean[N.length];

        st = new StringTokenizer(br.readLine());

        for(int i = 0; i<N.length; i++){
            N[i] = Integer.parseInt(st.nextToken());
        }

        dfs(0,500);

        System.out.println(cnt);

    }

    private static void dfs(int depth, int weight) {

        if(weight<500){
            return;
        }


        if(depth==N.length){
            cnt++;
            return;
        }

        for(int i = 0; i<N.length; i++){
            if(!visit[i]){
                visit[i] = true;
                dfs(depth+1, weight-K+N[i]);
                visit[i] = false;
            }
        }

    }
}
