import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.StringTokenizer;
import java.util.Vector;

public class b18352 {
    static int N;
    static int M;
    static int K;
    static int X;
    static int[] dis;
    static ArrayList<Integer> list = new ArrayList<>();
    static Vector<Integer>[] V;
    static StringBuilder sb = new StringBuilder();



    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());
        X = Integer.parseInt(st.nextToken());

        dis = new int[N+1];
        V = new Vector[N+1];

        for(int i = 0; i<=N; i++){
            V[i] = new Vector<>();
        }

        for(int i = 0; i<=N; i++){
            dis[i] = Integer.MAX_VALUE;
        }



        for(int i = 0; i<M; i++){
            st = new StringTokenizer(br.readLine());
            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());

            V[start].add(end);

        }

        dis[X] = 0;

        stra();

        for(int i = 1; i<=N; i++){
            if(dis[i]==K){
                list.add(i);
            }
        }

        if(list.size()==0){
            System.out.println(-1);
            System.exit(0);
        }else{
            for(int x : list){
                sb.append(x).append("\n");
            }
            System.out.println(sb);
        }




    }

    private static void stra() {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.add(X);

        while(!pq.isEmpty()){
            int n = pq.poll();
            for(int x : V[n]){
                if(dis[x]>dis[n]+1){
                    dis[x] = dis[n] + 1;
                    pq.add(x);
                }
            }
        }
    }
}
