import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class b5972 {

    static int N;
    static int M;
    static int[] arr;
    static ArrayList<Node>[] list;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        arr = new int[N+1];

        Arrays.fill(arr,Integer.MAX_VALUE);
        list = new ArrayList[N+1];
        for(int i = 0; i<=N; i++){
            list[i] = new ArrayList<>();
        }

        for(int i = 0; i<M; i++){
            st = new StringTokenizer(br.readLine());
            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());
            int distance = Integer.parseInt(st.nextToken());
            list[start].add(new Node(end,distance));
            list[end].add(new Node(start,distance));
        }


        int answer = stra(N);

        System.out.println(answer);



    }

    private static int stra(int end) {
        PriorityQueue<Node> pq = new PriorityQueue<>();
        pq.add(new Node(1,0));
        arr[1] = 0;
        while(!pq.isEmpty()){
            Node now = pq.poll();
            for(Node next : list[now.end]){
                if(arr[next.end]>arr[now.end]+ next.distance){
                    arr[next.end] = arr[now.end]+ next.distance;
                    pq.add(next);
                }
            }
        }

        return arr[end];
    }

    private static class Node implements Comparable<Node>{
        int end;
        int distance;
        Node(int end, int width){
            this.end = end;
            this.distance = width;
        }

        @Override
        public int compareTo(Node o) {
            return distance-o.distance;
        }
    }
}
