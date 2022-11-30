import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class b2178 {

    static int N;
    static int M;
    static int[][] map;
    static int[] C = {-1,1,0,0};
    static int[] R = {0,0,1,-1};
    static boolean[][] visit;
    static int cnt = -1;



    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        map = new int[N][M];
        visit = new boolean[N][M];

        for(int i = 0; i<N; i++){
            String s = br.readLine();
            for(int j = 0; j<M; j++){
                map[i][j] = s.charAt(j)-'0';
            }
        }


        bfs(0,0);

        System.out.println(map[N-1][M-1]);

    }

    private static void bfs(int y, int x) {
        visit[y][x] = true;
        Queue<int[]> q = new LinkedList<>();
        q.add(new int[] {x,y});
        while(!q.isEmpty()){
            int now[] = q.poll();
            int nowX = now[0];
            int nowY = now[1];

            for(int i = 0; i<4; i++){
                int nextX = nowX+C[i];
                int nextY = nowY+R[i];

                if(nextX<0||nextY<0||nextX>=M||nextY>=N){
                    continue;
                }
                if(visit[nextY][nextX]){
                    continue;
                }
                if(map[nextY][nextX]==0){
                    continue;
                }

                q.add(new int[]{nextX,nextY});
                map[nextY][nextX] = map[nowY][nowX] + 1;
                visit[nextY][nextX] = true;
            }
        }






    }
}
