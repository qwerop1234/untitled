import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class b14720 {
    static int N;
    static int[] map;
    static int cnt = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());

        map = new int[N];

        StringTokenizer st = new StringTokenizer(br.readLine());

        for(int i = 0; i<N; i++){
            map[i] = Integer.parseInt(st.nextToken());
        }

        int start = 0;

        for(int i = 0; i<N; i++){
            if(map[i]==0){
                start = i;
                cnt++;
                break;
            }
        }

        for(int i = start+1; i<N; i++){
            if(map[start]-map[i]==-1){
                cnt++;
                start = i;
                continue;
            }

            if(map[start]-map[i]==2){
                cnt++;
                start = i;
                continue;
            }

        }

        System.out.println(cnt);

    }
}
