import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;
import java.util.TreeSet;

public class b19699 {
    static int N;
    static int M;
    static int[] H;
    static boolean[] prime;
    static int[] cal;
    static StringBuilder sb = new StringBuilder();
    static boolean[] visit;
    static TreeSet<Integer> ts = new TreeSet<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        H = new int[N];
        cal = new int[M];
        visit = new boolean[N];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            H[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(H);

        int Max = 0;

        for (int i = H.length - 1; i >= N-M; i--) {
            Max += H[i];
        }

        prime = new boolean[Max + 1];
        Arrays.fill(prime, true);

        prime[0] = false;
        prime[1] = false;
        prime[2] = true;

        for (int i = 2; i * i <= Max; i++) {
            for (int j = i * i; j <= Max; j += i) {
                prime[j] = false;
            }
        }


        dfs(0,0);

        if(ts.isEmpty()){
            System.out.println(-1);
        }else{
            for(int x : ts){
                sb.append(x).append(" ");
            }

            System.out.println(sb);
        }



    }

    private static void dfs(int idx,int depth) {

        int cnt = 0;

        if (depth == M) {
            for (int i = 0; i < M; i++) {
                cnt += cal[i];
            }
            if (prime[cnt]) {
                ts.add(cnt);
            }

            return;
        }

        for(int i = idx; i<N; i++){
            if(!visit[i]){
                visit[i] = true;
                cal[depth] = H[i];
                dfs(i+1,depth+1);
                visit[i] = false;
            }
        }
    }
}
