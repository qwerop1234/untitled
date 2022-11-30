import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class b2847 {
    static int N;
    static int[] arr;
    static int answer;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());

        arr = new int[N];

        for(int i = 0; i<N; i++){
            arr[i] = Integer.parseInt(br.readLine());
        }

        for(int i = N-1; i>=1; i--){
            dfs(arr[i],arr[i-1],i);
        }

        System.out.println(answer);
    }

    private static void dfs(int i, int j,int cnt) {

        if(j>=i){
            answer++;
            j--;
            dfs(i,j,cnt);
        }else{
            arr[cnt] = i;
            arr[cnt-1] = j;
        }
    }
}
