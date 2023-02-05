import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.StringTokenizer;


public class b1753 {

    static int V;
    static int E;
    static int K;
    static ArrayList<Node>[] list;
    static int[] dist;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        V = Integer.parseInt(st.nextToken());
        E = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(br.readLine());

        list = new ArrayList[V+1];
        dist = new int[V + 1];
        Arrays.fill(dist,Integer.MAX_VALUE);

        for (int i = 1; i <= V; i++) {
            list[i] = new ArrayList<>();
        }

        for (int i = 0; i < E; i++) {
            st = new StringTokenizer(br.readLine());
            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());
            int dist = Integer.parseInt(st.nextToken());

            list[start].add(new Node(end, dist));
        }

        stra(K);

        for (int i = 1; i <= V; i++) {
            if (dist[i] == Integer.MAX_VALUE) {
                sb.append("INF").append("\n");
            } else {
                sb.append(dist[i]).append("\n");
            }
        }

        System.out.println(sb);

    }

    private static void stra(int start) {
        PriorityQueue<Node> q = new PriorityQueue<>();
        boolean[] visit = new boolean[V + 1];
        q.add(new Node(start, 0));
        dist[start] = 0;

        while (!q.isEmpty()) {
            Node n = q.poll();
            if (visit[n.end]) {
                continue;
            }

            visit[n.end] = true;

            for (Node node : list[n.end]) {
                if (dist[node.end] > dist[n.end] + node.dist) {
                    dist[node.end] = dist[n.end] + node.dist;
                    q.add(new Node(node.end, dist[node.end]));
                }
            }
        }


    }

    private static class Node implements Comparable<Node> {
        int end;
        int dist;

        Node(int end, int dist) {
            this.end = end;
            this.dist = dist;
        }

        @Override
        public int compareTo(Node o) {
            return dist - o.dist;

        }
    }
}
