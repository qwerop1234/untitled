import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class b1260 {
    static int N, M;
    static int start;
    static ArrayList<Integer>[] list;
    static boolean[] visit;
    static StringBuffer sb = new StringBuffer();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        start = Integer.parseInt(st.nextToken());

        visit = new boolean[N+1];
        list = new ArrayList[N+1];
        for(int i = 0; i < N+1; i++) list[i] = new ArrayList<>();

        for(int i = 0; i < M; i++){
            st = new StringTokenizer(br.readLine());

            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());

            list[start].add(end);
            list[end].add(start);
        }

        for(int i = 1; i<=N; i++){
            Collections.sort(list[i]);
        }


        dfs(start);
        System.out.println();
        bfs(start);
        System.out.println(sb);
    }

    private static void bfs(int start) {
        visit = new boolean[N+1];
        visit[start] = true;
        Queue<Integer> q = new LinkedList<>();
        q.add(start);
        while(!q.isEmpty()){
            int a = q.poll();
            sb.append(a).append(" ");
            for(int x : list[a]){
                if(!visit[x]){
                    q.add(x);
                    visit[x] = true;
                }
            }
        }
    }


    private static void dfs(int idx) {

        visit[idx] = true;
        System.out.print(idx + " ");
        for(int next : list[idx]){
            if(visit[next]) continue;
            visit[next] = true;
            dfs(next);
        }
    }
}
