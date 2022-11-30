import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class b16938 {
    static int N;
    static int L;
    static int R;
    static int X;
    static int[] arr;
    static int[] answer;
    static boolean[] visit;
    static int[] ans;
    static int cnt = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        L = Integer.parseInt(st.nextToken());
        R = Integer.parseInt(st.nextToken());
        X = Integer.parseInt(st.nextToken());
        arr = new int[N];
        visit = new boolean[N];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr);

        for (int i = 1; i <= N; i++) {
            answer = new int[i];
            dfs(i, 0,0);

        }

        System.out.println(cnt);


    }

    private static void dfs(int temp, int depth, int temp1) {


        if (temp == depth) {
            int count = 0;


            Arrays.sort(answer);

            if(answer[answer.length-1]-answer[0]<X){
                return;
            }

            for (int x : answer) {
                count += x;
            }

            if (count >= L && count <= R) {
                cnt++;

            }


            return;
        }


        for (int i = temp1; i < N; i++) {
            if (!visit[i]) {
                visit[i] = true;
                answer[depth] = arr[i];
                dfs(temp, depth + 1, i);
                visit[i] = false;
            }

        }


    }
}
