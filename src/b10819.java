import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class b10819 {

    static int N;
    static int[] arr;
    static boolean[] visit;
    static int[] answer;
    static int max = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());
        arr = new int[N];
        visit = new boolean[N];
        answer = new int[N];

        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        dfs(0);

        System.out.println(max);

    }

    private static void dfs(int depth) {

        if (depth == N) {

            int cnt = 0;
            for (int i = 0; i < N - 1; i++) {
                cnt += Math.abs(answer[i] - answer[i + 1]);
            }


            max = Math.max(cnt, max);
            return;

        }

        for (int i = 0; i < N; i++) {
            if (!visit[i]) {
                visit[i] = true;
                answer[depth] = arr[i];
                dfs(depth + 1);
                visit[i] = false;
            }
        }

    }
}
