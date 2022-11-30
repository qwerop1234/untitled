import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class b1085 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());
        int d = Integer.parseInt(st.nextToken());

        int cnt1;
        int cnt2;

        if(a>c/2){
            cnt1 = c-a;
        }else{
            cnt1 = a;
        }
        if(b>d/2){
            cnt2 = d-b;
        }else{
            cnt2 = b;
        }
        if(cnt1>cnt2){
            System.out.println(cnt2);
        }else{
            System.out.println(cnt1);
        }

    }
}
