import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class b2468 {

    static int N;
    static int[][] map;
    static boolean[][] visit;
    static int[] dx = {1,-1,0,0};
    static int[] dy = {0,0,1,-1};


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        map = new int[N][N];

        TreeSet<Integer> treeSet = new TreeSet<>();

        for(int i = 0; i<N; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int j = 0; j<N; j++){
                map[i][j] = Integer.parseInt(st.nextToken());
                treeSet.add(map[i][j]);
            }
        }
        int big = treeSet.last();

        TreeSet<Integer> answer = new TreeSet<>();


        for(int h = 0; h<=big; h++){
            visit = new boolean[N][N];
            int cnt = 0;
            for(int i = 0; i<N; i++){
                for(int j = 0; j<N; j++){
                    if(map[i][j]>h&&!visit[i][j]){
                        cnt +=dfs(i,j,h);
                    }
                }
            }
            answer.add(cnt);
        }


        System.out.println(answer.last());

    }

    private static int dfs(int y, int x, int k) {
        visit[y][x] = true;

        Queue<int[]> q = new LinkedList<>();
        q.add(new int[]{y,x});

        while(!q.isEmpty()){

            int[] a = q.poll();
            int X = a[1];
            int Y = a[0];

            for(int i = 0; i<4; i++){
                int nextX = X+dx[i];
                int nextY = Y+dy[i];
                if(nextX<0||nextY<0||nextX>=N||nextY>=N){
                    continue;
                }
                if(visit[nextY][nextX]){
                    continue;
                }
                if(map[nextY][nextX]<=k){
                    continue;
                }
                visit[nextY][nextX] = true;

                q.add(new int[]{nextY,nextX});

            }

        }

        return 1;

    }
}
