import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.PriorityQueue;

public class b2151 {
    static int N;
    static char[][] map;
    static ArrayList<int[]> door = new ArrayList();
    static int[] dx = {1,0,-1,0};
    static int[] dy = {0,1,0,-1};
    static int[][][] min;
    static final int INF = 50*50 + 1;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        map = new char[N][N];
        min = new int[N][N][4];

        for(int i = 0; i<N; i++){
            String s = br.readLine();
            for(int j = 0; j<N; j++){
                map[i][j] = s.charAt(j);
                if(map[i][j]=='#'){
                    door.add(new int[]{i,j});
                }
                for(int k = 0; k<4; k++){
                    min[i][j][k] = INF;
                }

            }
        }

        min[door.get(0)[0]][door.get(0)[1]][0] = -1;
        min[door.get(0)[0]][door.get(0)[1]][1] = -1;
        min[door.get(0)[0]][door.get(0)[1]][2] = -1;
        min[door.get(0)[0]][door.get(0)[1]][3] = -1;


        int answer = stra(door.get(0)[0], door.get(0)[1]);
        int[] result = min[door.get(1)[0]][door.get(1)[1]];

        int ret = INF;
        for (int x : result) {
            if(x != INF){
                ret = Math.min(ret, x);
            }
        }

        System.out.println(ret);


    }

    private static int stra(int y, int x) {

        PriorityQueue<Node> pq = new PriorityQueue<Node>();
        pq.add(new Node(y,x,0,0));
        pq.add(new Node(y,x,0,1));
        pq.add(new Node(y,x,0,2));
        pq.add(new Node(y,x,0,3));


        while(!pq.isEmpty()){
            Node n = pq.poll();
            int X = n.x;
            int Y = n.y;
            int C = n.cnt;
            int Dir = n.dir;


            if(map[Y][X]!='!'){
                int Y1 = Y + dy[Dir];
                int X1 = X + dx[Dir];
                if(Y1<0||Y1>=N||X1<0||X1>=N){
                    continue;
                }

                if(min[Y1][X1][Dir]<C){
                    continue;
                }

                if(map[Y1][X1]=='*'){
                    continue;
                }

                if(map[Y1][X1]=='#'){
                    min[Y1][X1][Dir] = C;
                    continue;
                }

                pq.add(new Node(Y1,X1,C,Dir));
                min[Y1][X1][Dir] = Math.min(min[Y1][X1][Dir],C);


            }else{
                for(int i = 0; i<4; i++){

                    int Y1 = Y+dy[i];
                    int X1 = X+dx[i];

                    if(Y1<0||Y1>=N||X1<0||X1>=N){
                        continue;
                    }

                    if(min[Y1][X1][i]<C){
                        continue;
                    }

                    if(map[Y1][X1]=='*'){
                        continue;
                    }

                    if(Dir-i==0){
                        pq.add(new Node(Y1,X1,C,i));
                        min[Y1][X1][i] = Math.min(min[Y1][X1][i],C);
                        if(map[Y1][X1]=='#'){
                            continue;
                        }
                    }

                    if(Dir-i==1||Dir-i==-3){
                        pq.add(new Node(Y1,X1,C+1,i));
                        min[Y1][X1][i] = Math.min(min[Y1][X1][i],C+1);
                        if(map[Y1][X1]=='#'){
                            continue;
                        }
                    }

                    if(Math.abs(Dir-i)==2){
                        continue;
                    }

                    if(Dir-i==-1||Dir-i==3){
                        pq.add(new Node(Y1,X1,C+1,i));
                        min[Y1][X1][i] = Math.min(min[Y1][X1][i],C+1);
                        if(map[Y1][X1]=='#'){
                            continue;
                        }
                    }

                }


            }


        }

        return 200;
    }



    private static class Node implements Comparable<Node>{

        int y;
        int x;
        int cnt;
        int dir;

        Node(int y,int x,int cnt,int dir){
            this.y = y;
            this.x = x;
            this.cnt = cnt;
            this.dir = dir;
        }

        @Override
        public int compareTo(Node o) {
            return cnt-o.cnt;
        }
    }
}
