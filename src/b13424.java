import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class b13424 {

    static int T;
    static int N;
    static int M;
    static int K;
    static int[] arr;
    static ArrayList<Node>[] list;
    static int[] Max;
    static int Min;
    static StringBuilder sb = new StringBuilder();


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        T = Integer.parseInt(br.readLine());


        while(T-->0){
            Min = Integer.MAX_VALUE;


            StringTokenizer st = new StringTokenizer(br.readLine());
            N = Integer.parseInt(st.nextToken());
            M = Integer.parseInt(st.nextToken());


            list = new ArrayList[N+1];


            for(int i = 1; i<=N; i++){
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

            K = Integer.parseInt(br.readLine());
            arr = new int[K];
            st = new StringTokenizer(br.readLine());

            for(int i = 0; i<K; i++){
                arr[i] = Integer.parseInt(st.nextToken());
            }

            int[] answer0 = new int[N+1];

            for(int i = 1; i<=N; i++){
                answer0[i] = stra(i);
            }

            int answer = 0;

            for(int i = 1; i<=N; i++){
                if(answer0[i]==-1){
                    continue;
                }else{
                    answer = answer0[i];
                }
            }

            sb.append(answer).append("\n");

        }

        System.out.println(sb);



    }

    private static int stra(int point) {
        Max = new int[N+1];
        for(int i = 1; i<=N; i++){
            Max[i] = Integer.MAX_VALUE;
        }
        Max[point] = 0;

        PriorityQueue<Node> pq = new PriorityQueue<>();
        pq.add(new Node(point,0));
        while(!pq.isEmpty()){
            Node now = pq.poll();
            for(Node next : list[now.end]){
                if(Max[next.end]>Max[now.end]+next.distance){
                    Max[next.end] = Max[now.end]+next.distance;
                    pq.add(new Node(next.end,Max[next.end]));
                }
            }
        }

        int temp = 0;
        int answer = -1;


        for(int x : arr){
            temp += Max[x];
        }
        if(Min>temp){
            Min = temp;
            answer = point;
        }


        return answer;

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
