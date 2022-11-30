import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.StringTokenizer;
import java.util.TreeSet;

public class b15663 {
    static int N;
    static int M;
    static int[] answer;
    static int[] temp;
    static StringBuilder sb = new StringBuilder();
    static TreeSet<String> tree = new TreeSet<>();
    static boolean[] visit;
    static LinkedHashSet<String> link = new LinkedHashSet<>();


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        answer = new int[M];
        temp = new int[N];
        visit = new boolean[N];

        st = new StringTokenizer(br.readLine());

        for(int i = 0; i<N; i++){
            temp[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(temp);

        dfs(0);
        for(String x : link){
            sb.append(x).append("\n");
        }
        System.out.println(sb);
    }

    private static void dfs(int depth) {

        if(depth==M){
            for(int x : answer){
                sb.append(x).append(" ");
            }
            link.add(sb.toString());
            sb = new StringBuilder();
            return;
        }

        for(int i = 0; i<N; i++){
            if(visit[i]){
                continue;
            }
            visit[i] = true;
            answer[depth] = temp[i];
            dfs(depth+1);
            visit[i] = false;
        }

    }
}
