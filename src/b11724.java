
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class b11724 {
    static int M;
    static int N;
    static ArrayList<Integer>[] list;
    static boolean visit[];
    static int cnt;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        M = Integer.parseInt(st.nextToken());
        N = Integer.parseInt(st.nextToken());
        list = new ArrayList[M + 1];
        visit = new boolean[M + 1];

        for (int i = 0; i < M + 1; i++) {
            list[i] = new ArrayList<>();
        }

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());
            list[start].add(end);
            list[end].add(start);
        }

        for (int i = 1; i <= M; i++) {
            if (visit[i]) continue;
            visit[i] = true;
            dfs(i);
            cnt++;

        }

        System.out.println(cnt);
    }

    private static void dfs(int i) {

        int size = list[i].size();
        for (int j = 0; j < size; j++) {
            int value = list[i].get(j);
            if (!visit[value]) {
                visit[value] = true;
                dfs(value);
            }
        }

    }

}
