import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class b1325 {

    static int N;
    static int M;
    static List<Integer>[] list;
    static int[] answer = new int[10000];



    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        answer = new int[N+1];

        for(int i = 1; i<=N; i++){
            list[i] = new ArrayList<>();
            answer[i] = Integer.MIN_VALUE;
        }

        for(int i = 1; i<=M; i++){
            br = new BufferedReader(new InputStreamReader(System.in));
            st = new StringTokenizer(br.readLine());
            list[Integer.parseInt(st.nextToken())].add(Integer.parseInt(st.nextToken()));
        }






    }

}
