import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class b12101 {
    static int N;
    static int M;
    static int[] a = {1, 2, 3};
    static int[] answer;
    static int[] r_answer;
    static ArrayList<String> list = new ArrayList<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        answer = new int[N];
        r_answer = new int[N];


        dfs(0, 0);

        if(list.size()<M){
            System.out.println(-1);
            return;
        }

        Collections.sort(list);

        System.out.println(list.get(M - 1));
    }

    private static void dfs(int depth, int cnt) {



        if (cnt == N) {
            StringBuilder sb = new StringBuilder();

            for (int i = 0; i < depth; i++) {
                sb.append(answer[i]).append("+");

            }


            sb = sb.deleteCharAt(sb.length() - 1);
            list.add(sb.toString());
            return;
        }

        if (depth >= N){
            return;
        }

        for (int j = 0; j < 3; j++) {
            answer[depth] = a[j];
            dfs(depth + 1, cnt + a[j]);
        }


    }
}
