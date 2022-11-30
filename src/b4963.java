import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class b4963 {
    static int W;
    static int H;
    static int[][] map;
    static boolean[][] visit;
    static int cnt;
    static int[] dx = {0, 0, 1, -1, 1, 1, -1, -1};
    static int[] dy = {1, -1, 0, 0, 1, -1, 1, -1};


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            W = Integer.parseInt(st.nextToken());
            H = Integer.parseInt(st.nextToken());
            if (W == 0 && H == 0) {
                System.exit(0);
            }
            map = new int[H][W];
            visit = new boolean[H][W];

            for (int i = 0; i < H; i++) {
                st = new StringTokenizer(br.readLine());
                for (int j = 0; j < W; j++) {
                    map[i][j] = Integer.parseInt(st.nextToken());
                }
            }


            for (int i = 0; i < H; i++) {
                for (int j = 0; j < W; j++) {
                    if(map[i][j]==1&&!visit[i][j]){
                        bfs(i, j);
                        cnt++;
                    }


                }
            }
            System.out.println(cnt);
            cnt = 0;
        }



    }


    private static void bfs(int y, int x) {
        Queue<int[]> q = new LinkedList<>();

        q.add(new int[]{y, x});
        visit[y][x] = true;

        while (!q.isEmpty()) {

            int[] s = q.poll();
            int Y = s[0];
            int X = s[1];

            for (int i = 0; i < 8; i++) {
                int nextY = Y + dy[i];
                int nextX = X + dx[i];

                if (nextX < 0 || nextY < 0 || nextX >= W || nextY >= H) {
                    continue;
                }
                if (visit[nextY][nextX]) {
                    continue;
                }
                if(map[nextY][nextX]==0){
                    continue;
                }
                visit[nextY][nextX] = true;

                q.add(new int[]{nextY, nextX});
            }
        }

    }
}
