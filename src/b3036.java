import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class b3036 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());

        BigInteger b = BigInteger.valueOf(Long.parseLong(st.nextToken()));

        for(int i = 0; i<a-1; i++){
            BigInteger c = BigInteger.valueOf(Long.parseLong(st.nextToken()));

            BigInteger d = b.gcd(c);

            System.out.println(b.divide(d)+"/"+c.divide(d));
        }

    }
}
