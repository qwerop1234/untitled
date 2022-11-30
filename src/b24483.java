
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class b24483 {
    static int N;
    static int M;
    static int R;
    static boolean[] visit;
    static ArrayList<Integer>[] list;
    static long[] answer;
    static long[] t;
    static int idx = 1;
    static int cnt = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        R = Integer.parseInt(st.nextToken());

        visit = new boolean[N+1];
        list = new ArrayList[N+1];
        answer = new long[N+1];
        t = new long[N+1];

        for(int i = 1; i<=N; i++){
            list[i] = new ArrayList<>();
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
            answer[i] = -1;
        }

        dfs(R,cnt);

        long answer1 = 0;

        for(int i = 1; i<=N; i++){
            if(answer[i]<=0||t[i]==0){
                continue;
            }
            answer1 += t[i]*answer[i];

        }

        System.out.println(answer1);
    }

    private static void dfs(int r, int cnt) {
        visit[r] = true;
        answer[r] = cnt++;
        t[r] = idx++;
        for(int next : list[r]){
            if(visit[next]){
                continue;
            }
            dfs(next, cnt);
        }
    }
}
