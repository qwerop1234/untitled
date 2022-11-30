import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class b17396 {

    static int N;
    static int M;
    static boolean[] visit;
    static long[] arr;
    static ArrayList<Node>[] list;


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        visit = new boolean[N];
        list = new ArrayList[N];
        arr = new long[N];

        for(int i = 0; i<N; i++){
            list[i] = new ArrayList<>();
        }

        for(int i = 0; i<N; i++){
            if(Integer.parseInt(st.nextToken())==0){
                visit[i] = true;
            }else{
                visit[i] = false;
            }
            arr[i] = Long.MAX_VALUE;
        }

        visit[N-1] = true;


        for(int i = 0; i<M; i++){
            st = new StringTokenizer(br.readLine());
            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());
            int distance = Integer.parseInt(st.nextToken());
            list[start].add(new Node(end, distance));
            list[end].add(new Node(start,distance));

        }

        stra();


        if(arr[N-1] == Long.MAX_VALUE) {
            System.out.println("-1");
        }else{
            System.out.println(arr[N-1]);
        }





    }

    private static void stra() {
        PriorityQueue<Node> pq = new PriorityQueue<>();
        boolean[] visited = new boolean[N];
        pq.add(new Node(0,0));
        arr[0] = 0;
        while(!pq.isEmpty()){
            Node now = pq.poll();

            if(visited[now.end]) continue;
            visited[now.end] = true;

            for(Node next : list[now.end]){
                if(!visit[next.end]){
                    continue;
                }

                if(arr[next.end]>arr[now.end]+next.distance){
                    arr[next.end] = arr[now.end]+next.distance;
                    pq.add(new Node(next.end,arr[next.end]));
                }
            }

        }

    }

    private static class Node implements Comparable<Node>{
        int end;
        long distance;

        Node(int end, long distance){
            this.end = end;
            this.distance = distance;
        }

        @Override
        public int compareTo(Node o) {
            return (int) (distance-o.distance);
        }
    }
}
