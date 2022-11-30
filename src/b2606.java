import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class b2606 {
    static int M;
    static int N;
    static ArrayList<Integer>[] list;
    static boolean[] visit;
    static int cnt = 0;


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        M = Integer.parseInt(br.readLine());

        visit = new boolean[N+1];
        list = new ArrayList[N+1];

        for(int i = 0; i<N+1; i++)list[i] = new ArrayList<>();

        for(int i = 0; i<M; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());
            list[start].add(end);
            list[end].add(start);
        }

        visit[1] = true;
        dfs(1);
        System.out.println(cnt-1);

    }

    private static void dfs(int i) {
        cnt++;
        for(int next : list[i]){
            if(visit[next])continue;
            visit[next]=true;
            dfs(next);
        }
    }
}
