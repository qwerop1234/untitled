import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

public class b2665 {

    static int N;
    static int[][] map;
    static boolean[][] visit;
    static int Min = Integer.MAX_VALUE;
    static int[] dx = {0,0,1,-1};
    static int[] dy = {1,-1,0,0};


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        map = new int[N][N];
        visit = new boolean[N][N];

        for(int i = 0; i<N; i++){
            String s = br.readLine();
            for(int j = 0; j<N; j++){
                map[i][j] = s.charAt(j)-'0';
            }
        }

        int answer = bfs();

        System.out.println(answer);
    }

    private static int bfs() {
        PriorityQueue<Node> pq = new PriorityQueue<Node>();
        pq.add(new Node(0,0,0));
        visit[0][0] = true;

        while(!pq.isEmpty()){
            Node n = pq.poll();
            int Y = n.y;
            int X = n.x;

            if(Y==N-1&&X==N-1){
                return Math.min(Min,n.cnt);
            }


            for(int i = 0; i<4; i++){
                int Y1 = Y+dy[i];
                int X1 = X+dx[i];
                if(Y1>=0&&X1>=0&&Y1<N&&X1<N){
                    if(!visit[Y1][X1]){
                        visit[Y1][X1] = true;
                        if(map[Y1][X1]==1){
                            pq.add(new Node(Y1,X1,n.cnt));
                        }else if(map[Y1][X1]==0){
                            pq.add(new Node(Y1,X1,n.cnt+1));
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
        int cnt;
        Node(int y,int x,int cnt){
            this.y = y;
            this.x = x;
            this.cnt = cnt;
        }

        @Override
        public int compareTo(Node o) {
            return cnt-o.cnt;
        }
    }
}
