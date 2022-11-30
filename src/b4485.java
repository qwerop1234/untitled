import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class b4485 {
    static StringBuilder sb = new StringBuilder();
    static int N;
    static int[][] map;
    static int[][] min;
    static int[] C = {1,-1,0,0};
    static int[] R = {0,0,1,-1};
    static int count;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));



        while (true) {
            N = Integer.parseInt(br.readLine());
            if(N == 0) break;

            map = new int[N][N];
            min = new int[N][N];

            for(int i = 0; i<N; i++){
                StringTokenizer st = new StringTokenizer(br.readLine());
                for(int j = 0; j<N; j++){
                    map[i][j] = Integer.parseInt(st.nextToken());
                }
            }

            for(int i = 0; i<N; i++){
                Arrays.fill(min[i],Integer.MAX_VALUE);
            }

            min[0][0] = map[0][0];

            bfs(0,0);

            sb.append("Problem ").append(count+1).append(": ").append(min[N-1][N-1]).append("\n");


            count++;


        }
        System.out.println(sb);


    }

    private static void bfs(int y, int x) {
        Queue<int[]> q = new LinkedList<>();
        q.add(new int[]{y,x});



        while(!q.isEmpty()){
            int[] a = q.poll();
            int Y = a[0];
            int X = a[1];

            for(int i = 0; i<4; i++){
                int Y1 = Y+R[i];
                int X1 = X+C[i];
                if(Y1>=0&&X1>=0&&Y1<N&&X1<N){
                    if(min[Y1][X1]>map[Y1][X1]+min[Y][X]){
                        q.add(new int[]{Y1,X1});
                        min[Y1][X1] = map[Y1][X1]+min[Y][X];
                    }

                }
            }
        }


    }
}
