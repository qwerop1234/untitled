import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class b11720 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a= Integer.parseInt(br.readLine());
        String s = br.readLine();

        int sum = 0;

        for(int i = 0; i<s.length(); i++){
            sum += s.charAt(i)-'0';
        }


        System.out.println(sum);
    }
}
