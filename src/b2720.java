import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class b2720 {
    static int N;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());


        while(N!=0){
            N--;
            int M = Integer.parseInt(br.readLine());
            int[] answer = new int[4];

            int a = 0;
            int b = 0;
            int c = 0;
            int d = 0;

            while(M/25!=0){
                M = M-25;
                a++;
            }

            answer[0] = a;

            while(M/10!=0){
                M = M-10;
                b++;
            }

            answer[1] = b;

            while(M/5!=0){
                M = M-5;
                c++;
            }

            answer[2] = c;

            while(M!=0){
                M--;
                d++;
            }

            answer[3] = d;

            for(int i = 0; i<4; i++){
                sb.append(answer[i]).append(" ");
            }
            sb.append("\n");

        }


        System.out.println(sb);

    }
}
