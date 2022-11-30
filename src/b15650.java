import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

public class b15650 {
    static int N;
    static int M;
    static boolean[] visit;
    static int[] answer;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        visit = new boolean[N+1];
        answer = new int[M];

        tracking(1,0);

        System.out.println(sb);

    }

    private static void tracking(int start, int depth) {

        if(depth==M){
            for(int x : answer){
                sb.append(x).append(" ");
            }
            sb.append("\n");
            return;
        }

        for(int i = start; i<=N; i++){
            answer[depth] = i;
            tracking(i+1,depth+1);
        }

    }
}
