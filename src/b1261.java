import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.StringTokenizer;

public class b1261 {
    static int N;
    static int M;
    static int[][] map;
    static boolean[][] visit;
    static int Min = Integer.MAX_VALUE;
    static int[] dx = {1,-1,0,0};
    static int[] dy = {0,0,1,-1};


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        map = new int[M][N];
        for(int i = 0; i<M; i++){
            String s = br.readLine();
            for(int j = 0; j<N; j++){
                map[i][j] = s.charAt(j)-'0';
            }
        }

        visit = new boolean[M][N];
        visit[0][0] = true;

        int answer = bfs();

        System.out.println(answer);

    }

    private static int bfs() {

        PriorityQueue<Node> pq = new PriorityQueue<>();
        pq.add(new Node(0,0,0));

        while(!pq.isEmpty()){
            Node n = pq.poll();
            int Y = n.y;
            int X = n.x;

            if(Y==M-1&&X==N-1){
                return n.count;
            }
            for(int i = 0; i<4; i++){
                int Y1 = Y+dy[i];
                int X1 = X+dx[i];
                if(X1>=0&&Y1>=0&&X1<N&&Y1<M){
                    if(!visit[Y1][X1]){
                        if(map[Y1][X1]==1){
                            visit[Y1][X1] = true;
                            pq.add(new Node(Y1,X1, n.count+1));
                        }else if(map[Y1][X1]==0){
                            visit[Y1][X1] = true;
                            pq.add(new Node(Y1,X1, n.count));
                        }
                    }
                }

            }


        }




        return -1;

    }


    private static class Node implements Comparable<Node>{
        int y;
        int x;
        int count;
        Node(int y, int x, int count){
            this.y = y;
            this.x = x;
            this.count = count;
        }

        @Override
        public int compareTo(Node o) {
            return count-o.count;
        }
    }
}
