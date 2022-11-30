import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class b2675 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int temp = Integer.parseInt(br.readLine());

        for(int i = 0; i<temp; i++){




            int a = 0;
            String s = "";
            String answer = "";
            StringTokenizer st = new StringTokenizer(br.readLine());

            a = Integer.parseInt(st.nextToken());
            s = st.nextToken();

            for(int k = 0; k<s.length(); k++){
                for(int j = 0; j<a; j++){
                    answer += s.charAt(k);
                }
            }
            System.out.println(answer);

        }

    }
}
