import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class b2667 {
    static int N;
    static int[][] map;
    static boolean[][] visit;
    static int cnt;
    static int[] C = {1,-1,0,0};
    static int[] R = {0,0,1,-1};
    static int[] answer;


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        map = new int[N][N];
        visit = new boolean[N][N];
        answer = new int[N*N];

        for(int i = 0; i<N; i++){
            String s = br.readLine();
            for(int j = 0; j<N; j++){
                map[i][j] = s.charAt(j)-'0';
            }
        }

        ArrayList<Integer> resultList = new ArrayList<>();

        for(int i = 0; i<N; i++){
            for(int j = 0; j<N; j++){
                if(map[i][j]==1&&!visit[i][j]){
                    resultList.add(bfs(i,j));
//                    cnt++;
                }

            }
        }

        System.out.println(resultList.size());
        Collections.sort(resultList);


        for(int x : resultList){
            System.out.println(x);
        }

    }

    private static int bfs(int y, int x) {
        int ret = 0;
        Queue<int[]> q = new LinkedList<>();
        visit[y][x] = true;
        q.add(new int[]{y, x});
        while(!q.isEmpty()){
            int[] s = q.poll();

            int X = s[1];
            int Y = s[0];


            for(int i = 0; i<4; i++){
                int nextY = Y+R[i];
                int nextX = X+C[i];

                if(nextX<0||nextY<0||nextX>=N||nextY>=N){
                    continue;
                }
                if(map[nextY][nextX]==0){
                    continue;
                }
                if(visit[nextY][nextX]){
                    continue;
                }
                q.add(new int[]{nextY, nextX});
                visit[nextY][nextX] = true;
            }
            ret++;
        }

        return ret;
    }
}
