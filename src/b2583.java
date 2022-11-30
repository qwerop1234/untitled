import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class b2583 {

    static int N;
    static int M;
    static int K;

    static boolean[][] visit;
    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, 1, -1};
    static ArrayList<Integer> list = new ArrayList<>();


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());
        visit = new boolean[N][M];


        for (int i = 0; i < K; i++) {
            st = new StringTokenizer(br.readLine());

            int x1 = Integer.parseInt(st.nextToken());
            int y1 = Integer.parseInt(st.nextToken());
            int x2 = Integer.parseInt(st.nextToken());
            int y2 = Integer.parseInt(st.nextToken());

            for (int j = x1; j < x2; j++) {
                for (int k = y1; k < y2; k++) {
                    visit[k][j] = true;
                }
            }
        }

        int cnt = 0;

        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                if (!visit[j][i]) {
                    bfs(j, i);
                    cnt++;
                }
            }
        }

        System.out.println(cnt);
        Collections.sort(list);
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }


    }

    private static void bfs(int Y, int X) {
        Queue<int[]> q = new LinkedList<>();
        q.add(new int[]{Y, X});
        int cnt2 = 1;
        visit[Y][X] = true;

        while (!q.isEmpty()) {

            int[] a = q.poll();
            int y = a[0];
            int x = a[1];

            for (int i = 0; i < 4; i++) {
                int nextX = dx[i] + x;
                int nextY = dy[i] + y;
                if(nextX<0||nextY<0||nextX>=M||nextY>=N){
                    continue;
                }
                if (!visit[nextY][nextX]) {
                    q.add(new int[]{nextY, nextX});
                    cnt2++;
                    visit[nextY][nextX] = true;
                }

            }


        }
        list.add(cnt2);


    }
}
