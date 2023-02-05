import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class b7576 {

    static int[] R = {1,0,-1,0};
    static int[] C = {0,1,0,-1};
    static int[][] map;
    static boolean[][] visit;
    static int N = 0;
    static int M = 0;
    static int answer = 0;
    static int tomato = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        map = new int[M][N];
        visit = new boolean[M][N];
        int y = 0;
        int x = 0;

        for(int i = 0; i<M; i++){
            st = new StringTokenizer(br.readLine());
            for(int j = 0; j<N; j++){
                int a = Integer.parseInt(st.nextToken());
                map[i][j] = a;
                if(a==1){
                    tomato++;
                }
                if(map[i][j]==1){
                    y = i;
                    x = j;
                }
            }
        }

        bfs(y,x);

        for(int i = 0; i<M; i++){
            for(int j = 0; j<N; j++){
                if(!visit[i][j]){
                    answer = -1;
                    break;
                }
            }
        }

        System.out.println(answer);

    }

    private static void bfs(int y, int x) {

        Queue<Node> q = new LinkedList<>();
        q.add(new Node(y,x));

        int count = tomato;

        while(q.size()!=0){
            Node n = q.poll();

            if(count==N*M){
                return;
            }

            for(int i = 0; i<4; i++){
                int x1 = n.x+C[i];
                int y1 = n.y+R[i];
                if(y1>=0&&y1<M&&x1>=0&&x1<N&&!visit[y1][x1]){
                    q.add(new Node(y1,x1));
                    visit[y1][x1] = true;
                    count++;
                }

            }

            answer++;
        }
    }

    private static class Node {
        int y;
        int x;

        Node(int y, int x){
            this.y = y;
            this.x = x;
        }

    }

}
