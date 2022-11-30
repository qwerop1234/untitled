import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class b18290 {
    static int N;
    static int M;
    static int K;
    static int[][] map;
    static boolean[][] visit;
    static int cnt = Integer.MIN_VALUE;
    static point[] answer;
    static int[] R = {1, -1, 0, 0};
    static int[] C = {0, 0, 1, -1};


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());
        visit = new boolean[N][M];

        map = new int[N][M];
        answer = new point[K];

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < M; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());

            }
        }

        dfs(0,0,0);



        System.out.println(cnt);

    }

    private static void dfs(int y, int x, int depth) {


        if (depth == K) {
            int s = 0;
            boolean t = true;

            for (int i = 0; i < K; i++) {
                for (int j = i + 1; j < K; j++) {

                    for (int k = 0; k < 4; k++) {

                        if (answer[i].y + C[k] == answer[j].y && answer[i].x + R[k] == answer[j].x) {
                            t = false;
                            break;
                        }
                    }
                }
            }


            if (t) {
                for (point a : answer) {
                    s += map[a.y][a.x];
                }

                if (s > cnt) {
                    cnt = s;
                }
            }

            return;
        }

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if(!visit[i][j]){
                    answer[depth] = new point(i, j);
                    visit[i][j] = true;
                    dfs(i, j, depth + 1);
                    visit[i][j] = false;
                }

            }
        }
    }

    private static class point {
        int y;
        int x;

        point(int y, int x) {
            this.y = y;
            this.x = x;
        }
    }
}
