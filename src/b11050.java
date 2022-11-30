import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class b11050 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        int a = 1;
        int b = 1;

        for(int i = n; i>n-k; i--){
            a *=i;
        }

        for(int j =1; j<=k; j++){
            b *=j;
        }

        System.out.println(a/b);

    }
}
