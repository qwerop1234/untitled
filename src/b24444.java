import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class b24444 {
    static int N;
    static int M;
    static int R;
    static boolean[] visit;
    static ArrayList<Integer>[] list;
    static int[] answer;
    static int cnt = 0;


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        R = Integer.parseInt(st.nextToken());

        list = new ArrayList[N+1];
        visit = new boolean[N+1];
        answer = new int[N+1];


        for(int i = 1; i<=N; i++){
            list[i] = new ArrayList<>();
            answer[i] = 0;
        }

        for(int i = 1; i<=M; i++){
            st = new StringTokenizer(br.readLine());
            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());
            list[start].add(end);
            list[end].add(start);
        }

        for(int i = 1; i<=N; i++){
            Collections.sort(list[i]);
        }
        bfs(R);

        StringBuffer sb = new StringBuffer();

        for(int i = 1; i<=N; i++){
            sb.append(answer[i]).append("\n");
        }

        System.out.println(sb);

    }

    private static void bfs(int r) {
        Queue<Integer> q = new LinkedList<>();
        q.add(r);

        visit[r] = true;

        while(!q.isEmpty()){
            int a = q.poll();
            answer[a] = ++cnt;
            for(int next : list[a]){
                if(visit[next]){
                    continue;
                }
                visit[next] = true;
                q.add(next);
            }

        }

    }
}
