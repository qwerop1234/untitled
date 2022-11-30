import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class b24479 {
    static int N;
    static int M;
    static int R;
    static ArrayList<Integer>[] list;
    static boolean[] visit;
    static int[] answer;
    static int idx = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int R = Integer.parseInt(st.nextToken());

        visit = new boolean[N+1];
        list = new ArrayList[N+1];
        answer = new int[N+1];
        for(int i = 1; i<=N; i++){
            list[i] = new ArrayList<>();
        }

        for(int i = 0; i<M; i++){
            st = new StringTokenizer(br.readLine());
            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());
            list[start].add(end);
            list[end].add(start);
        }
        for(int i = 1; i<=N; i++){
            Collections.sort(list[i]);
        }

        dfs(R);
        StringBuffer sb= new StringBuffer();
        for(int i = 1; i< answer.length; i++){
            sb.append(answer[i]).append("\n");
        }
        System.out.println(sb);

    }

    private static void dfs(int r) {
        answer[r] = ++idx;
        visit[r] = true;
        for(int next : list[r]){
            if(visit[next]){
                continue;
            }
            dfs(next);
        }
    }
}
