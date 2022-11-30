import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class b1916 {
    static int N;
    static int M;
    static ArrayList<Node>[] list;
    static int A;
    static int B;
    static int[] answer;


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());
        M = Integer.parseInt(br.readLine());

        list = new ArrayList[N+1];


        for(int i = 1; i<=N; i++){
            list[i] = new ArrayList<>();
        }

        for(int i = 0; i<M; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());
            int distance = Integer.parseInt(st.nextToken());

            list[start].add(new Node(end,distance));

        }

        StringTokenizer st = new StringTokenizer(br.readLine());

        A = Integer.parseInt(st.nextToken());
        B = Integer.parseInt(st.nextToken());
        answer = new int[N+1];
        Arrays.fill(answer,Integer.MAX_VALUE);

        stra(A);

        System.out.println(answer[B]);

    }

    private static void stra(int a) {

        PriorityQueue<Node> pq = new PriorityQueue<>();
        boolean[] visit = new boolean[N+1];
        pq.add(new Node(a,0));
        answer[a] = 0;

        while(!pq.isEmpty()){
            Node n = pq.poll();
            if(visit[n.end]){
                continue;
            }
            visit[n.end] = true;

            for(Node node : list[n.end]){
                if (answer[node.end] > answer[n.end] + node.dist) {
                    answer[node.end] = answer[n.end] + node.dist;
                    pq.add(new Node(node.end, answer[node.end]));
                }
            }


        }



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
