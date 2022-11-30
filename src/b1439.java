import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class b1439 {

    static String N;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = br.readLine();

        int zero = 1;

        for(int i = 1; i<N.length(); i++){
            if(N.charAt(i-1)!=N.charAt(i)){
                zero++;
            }
        }

        System.out.println(zero/2);



    }
}
