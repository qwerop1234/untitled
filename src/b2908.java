import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class b2908 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        String a = st.nextToken();
        String b = st.nextToken();


        String answer1 = "";
        String answer2 = "";

        for(int i = a.length()-1; i>=0; i--){
            answer1 += a.charAt(i);
        }

        for(int i = b.length()-1; i>=0; i--){
            answer2 += b.charAt(i);
        }
        int a1 = Integer.parseInt(answer1);
        int b1 = Integer.parseInt(answer2);

        if(a1>b1){
            System.out.println(a1);
        }else{
            System.out.println(b1);
        }
    }
}
