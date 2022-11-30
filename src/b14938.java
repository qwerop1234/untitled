import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class b14938 {

    static int N;
    static int M;
    static int R;
    static int[] arr;
    static ArrayList<Node>[] list;
    static boolean[] visit;
    static int[] dist;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        R = Integer.parseInt(st.nextToken());

        arr = new int[N+1];
        list = new ArrayList[N+1];


        st = new StringTokenizer(br.readLine());

        for(int i = 1; i<=N; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        for(int i = 1; i<=N; i++){
            list[i] = new ArrayList<>();
        }


        for(int i = 0; i<R; i++){
            st = new StringTokenizer(br.readLine());
            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());
            int dis = Integer.parseInt(st.nextToken());

            list[start].add(new Node(end,dis));
            list[end].add(new Node(start,dis));

        }

        int answer = 0;

        for(int i = 1; i<=N; i++){
            visit = new boolean[N+1];
            dist = new int[N+1];
            Arrays.fill(dist,100_001);
            answer = Math.max(answer,bfs(i));

        }

        System.out.println(answer);




    }

    private static int bfs(int start) {
        PriorityQueue<Node> pq = new PriorityQueue<>();
        pq.add(new Node(start,0));
        dist[start] = 0;


        while(!pq.isEmpty()){
            Node now = pq.poll();



            for(Node next : list[now.end]){
                if(dist[next.end] > dist[now.end]+next.dist){
                    dist[next.end] = dist[now.end]+next.dist;
                    pq.add(new Node(next.end,dist[next.end]));
                }
            }

        }

        int answer = 0;
        for(int i = 1; i<=N; i++){
            if(dist[i]<=M){
                answer += arr[i];
            }
        }

        return answer;

    }

    private static class Node implements Comparable<Node>{
        int end;
        int dist;

        Node(int end, int dist){
            this.end = end;
            this.dist = dist;
        }

        @Override
        public int compareTo(Node o) {
            return dist-o.dist;
        }
    }
}
