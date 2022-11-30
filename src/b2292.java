import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class b2292 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(br.readLine());
        int cnt = 1;
        int answer = 1;

        while(answer<a){
            answer += cnt*6;
            cnt++;
        }
        System.out.println(cnt);
    }
}
