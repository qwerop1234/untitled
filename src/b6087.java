import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class b6087 {

    static int N;
    static int M;
    static char[][] map;

    static int[] dx = {1,0,-1,0};
    static int[] dy = {0,1,0,-1};
    static ArrayList<int[]> list = new ArrayList<>();
    static int[][][] dp;
    static boolean[][] visit;


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        M = Integer.parseInt(st.nextToken());
        N = Integer.parseInt(st.nextToken());

        map = new char[N][M];
        dp = new int[N][M][4];

        for(int i = 0; i<N; i++){
            String s = br.readLine();
            for(int j = 0; j<M; j++){
                map[i][j] = s.charAt(j);
                if(map[i][j]=='C'){
                    list.add(new int[]{i,j});
                }
            }
        }

        for(int i = 0; i < N; i++){
            for(int j = 0; j< M; j++){
                Arrays.fill(dp[i][j], N*M);
            }
        }

        stra(list.get(0)[0], list.get(0)[1]);

        int answer = Math.min(dp[list.get(1)[0]][list.get(1)[1]][3],Math.min(dp[list.get(1)[0]][list.get(1)[1]][2],Math.min(dp[list.get(1)[0]][list.get(1)[1]][1],dp[list.get(1)[0]][list.get(1)[1]][0])));

        System.out.println(answer);

    }

    private static void stra(int y, int x) {
        PriorityQueue<Node> pq = new PriorityQueue<Node>();
        pq.add(new Node(y,x,-1,-1));

        Arrays.fill(dp[y][x], 0);

        while(!pq.isEmpty()){
            Node n = pq.poll();
            int X = n.x;
            int Y = n.y;
            int DIR = n.dir;

            for(int i = 0; i<4; i++){
                int X1 = X+dx[i];
                int Y1 = Y+dy[i];

                if(DIR!=-1&&Math.abs(DIR-i)==2){
                    continue;
                }

                if(X1>=0&&Y1>=0&&X1<M&&Y1<N){
                    if(map[Y1][X1]=='*') continue;

                    if(DIR==i&&dp[Y1][X1][i]>n.count){
                        pq.add(new Node(Y1,X1,n.count,DIR));
                        dp[Y1][X1][i] = n.count;
                    }else if(DIR!=i&&dp[Y1][X1][i]>n.count+1){
                        pq.add(new Node(Y1,X1,n.count+1,i));
                        dp[Y1][X1][i] = n.count+1;
                    }
                }
            }

        }


    }


    private static class Node implements Comparable<Node>{
        int y;
        int x;
        int count;
        int dir;
        Node(int y,int x,int count,int dir){
            this.y =y;
            this.x =x;
            this.count = count;
            this.dir = dir;
        }

        @Override
        public int compareTo(Node o) {
            return count - o.count;
        }
    }
}
