import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class b14487 {
    static int N;
    static int[] map;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());
        map = new int[N];

        StringTokenizer st = new StringTokenizer(br.readLine());

        for(int i = 0; i<N; i++){
            map[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(map);

        int cnt = 0;

        for(int i = 0; i<N-1; i++){
            cnt += map[i];
        }

        System.out.println(cnt);


    }
}
