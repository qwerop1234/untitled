import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class b10162 {

    static int N;



    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());

        if(N%10!=0){
            System.out.println(-1);
            return;
        }

        int a = 0;
        int b = 0;
        int c = 0;

        while(N-300>=0){
            N = N-300;
            a++;
        }

        while(N-60>=0){
            N = N-60;
            b++;
        }

        while(N-10>=0){
            N = N-10;
            c++;
        }

        StringBuilder sb = new StringBuilder();
        sb.append(a).append(" ").append(b).append(" ").append(c);

        System.out.println(sb);

    }
}
