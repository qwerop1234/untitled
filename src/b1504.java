import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class b1504 {
    static int N;
    static int E;
    static ArrayList<Node>[] list;
    static int A;
    static int B;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        E = Integer.parseInt(st.nextToken());

        list = new ArrayList[N+1];


        for(int i = 1; i<=N; i++){
            list[i] = new ArrayList<>();
        }

        for(int i = 0; i<E; i++){
            st = new StringTokenizer(br.readLine());
            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());
            int distance = Integer.parseInt(st.nextToken());
            list[start].add(new Node(end,distance));
            list[end].add(new Node(start,distance));

        }

        st = new StringTokenizer(br.readLine());

        A = Integer.parseInt(st.nextToken());
        B = Integer.parseInt(st.nextToken());

        int[] distA = stra(A);
        int[] distB = stra(B);


        int answer = distA[1]+distA[B]+distB[N];
        answer = Math.min(answer, distB[1]+distB[A]+distA[N]);

        if(answer>=200_000_000){
            System.out.println(-1);
        }else{
            System.out.println(answer);
        }



    }

    private static int[] stra(int a) {
        PriorityQueue<Node> pq = new PriorityQueue<>();
        pq.add(new Node(a,0));
        int[] dist = new int[N+1];
        Arrays.fill(dist,200_000_000);
        dist[a] = 0;

        while (!pq.isEmpty()){
            Node n = pq.poll();

            for(Node node : list[n.end]){
                if(dist[node.end]>dist[n.end]+node.distance){
                    dist[node.end] = dist[n.end]+node.distance;
                    pq.add(new Node(node.end,dist[n.end]));
                }
            }

        }

        return dist;
    }

    private static class Node implements Comparable<Node>{

        int end;
        int distance;
        Node(int end, int distance){
            this.end = end;
            this.distance = distance;
        }

        @Override
        public int compareTo(Node o) {
            return distance-o.distance;
        }
    }
}
