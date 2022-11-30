import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class b24447 {
    static int N;
    static int M;
    static int R;
    static long[] depth;
    static long[] sequence;
    static boolean[] visit;
    static ArrayList<Integer>[] list;




    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        R = Integer.parseInt(st.nextToken());

        depth = new long[N+1];
        sequence = new long[N+1];
        visit = new boolean[N+1];
        list = new ArrayList[N+1];

        for(int i = 1; i<=N; i++){
            list[i] = new ArrayList<>();
        }

        for(int i = 1; i<=M; i++){
            st = new StringTokenizer(br.readLine());
            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());
            list[start].add(end);
            list[end].add(start);
        }

        for(int i = 1; i<=N; i++){
            Collections.sort(list[i]);
        }

        dfs(R);

        long answer = 0;

        for(int i = 1; i<=N; i++){
            answer += depth[i]*sequence[i];
        }

        System.out.println(answer);
    }

    private static void dfs(int r) {
        Queue<Long> q = new LinkedList<>();
        visit[r] = true;

        long d = 1;
        long s = 1;

        q.add((long) r);
        while (!q.isEmpty()){

            int size = q.size();
            while(size-->0){
                long a = q.poll();
                sequence[(int) a] = s;
                s++;
                for(long next : list[(int) a]){
                    if(visit[(int) next]){
                        continue;
                    }
                    visit[(int) next] = true;
                    depth[(int) next] = d;

                    q.add(next);


                }
            }
            d++;
        }

    }
}
