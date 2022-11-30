import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class b10282 {

    static int T;
    static ArrayList<Node>[] list;
    static int[] dist;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        T = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();


        while(T -->0){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken());
            int D = Integer.parseInt(st.nextToken());
            int C = Integer.parseInt(st.nextToken());



            dist = new int[10001];
            list = new ArrayList[N+1];
            for(int i = 1; i<=N; i++){
                list[i] = new ArrayList<>();
            }


            for(int i = 0; i<D; i++){
                st = new StringTokenizer(br.readLine());
                int end = Integer.parseInt(st.nextToken());
                int start = Integer.parseInt(st.nextToken());
                int time = Integer.parseInt(st.nextToken());
                list[start].add(new Node(end,time));
            }

            Arrays.fill(dist,100_000_000);

            bfs(C);

            int cnt = 0;
            int result = 0;

            for(int i = 1; i<=N; i++){
                if(dist[i]!=100_000_000){
                    cnt++;
                    result = Math.max(result,dist[i]);
                }
            }

            sb.append(cnt).append(" ").append(result).append("\n");

        }

        System.out.println(sb);


    }

    private static void bfs(int c) {
        PriorityQueue<Node> pq = new PriorityQueue<>();
        pq.add(new Node(c,0));
        dist[c] = 0;

        while(!pq.isEmpty()){
            Node now = pq.poll();

            for(Node next : list[now.end]){
                int n = next.end;
                int next_dist = next.time + now.time;
                if(dist[n]>next_dist){
                    dist[n] = next_dist;
                    pq.add(new Node(n,next_dist));
                }else{
                    continue;
                }

            }

        }


    }


    private static class Node implements Comparable<Node>{
        int end;
        int time;
        Node(int end, int time){
            this.end = end;
            this.time = time;
        }

        @Override
        public int compareTo(Node o) {
            return time-o.time;
        }
    }
}
