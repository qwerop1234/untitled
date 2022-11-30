import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.util.StringTokenizer;


public class b13549 {
    static int N;
    static int K;
    static boolean[] visit;
    static int min = Integer.MAX_VALUE;


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());
        visit = new boolean[100_001];
        int m = bfs();
        System.out.println(m);




    }

    private static int bfs() {
        PriorityQueue<Node> pq = new PriorityQueue<Node>();
        pq.add(new Node(N,0));

        while(!pq.isEmpty()){
            Node n = pq.poll();
            visit[n.point] = true;
            if(n.point==K){
                return n.time;
            }
            if(n.point*2<=100_000&& !visit[n.point * 2]){
                pq.add(new Node(n.point*2,n.time));
            }
            if(n.point+1<=100_000&& !visit[n.point + 1]){
                pq.add(new Node(n.point+1,n.time+1));
            }
            if(n.point-1>=0&& !visit[n.point - 1]){
                pq.add(new Node(n.point-1,n.time+1));
            }
        }

        return -1;
    }

    private static class Node implements Comparable<Node>{
        int point;
        int time;
        Node(int point, int time){
            this.point = point;
            this.time = time;
        }

        @Override
        public int compareTo(Node o) {
            return time-o.time;
        }
    }
}
