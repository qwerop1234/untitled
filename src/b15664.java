import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.StringTokenizer;

public class b15664 {
    static int N;
    static int M;
    static int[] answer;
    static int[] arr;
    static StringBuilder sb = new StringBuilder();
    static LinkedHashSet<String> link = new LinkedHashSet<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        answer = new int[M];
        arr = new int[N];

        st = new StringTokenizer(br.readLine());

        for(int i = 0; i<N; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr);

        dfs(0,0);

        for(String x : link){
            sb.append(x).append("\n");
        }

        System.out.println(sb);
    }

    private static void dfs(int depth, int start) {



        if(depth==M){
            for(int x : answer){
                sb.append(x).append(" ");
            }
            link.add(sb.toString());
            sb = new StringBuilder();
            return;
        }

        for(int i = start; i<N; i++){

            answer[depth] = arr[i];

            dfs(depth+1,i+1);
        }



    }
}
