import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class b2609 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        String A = st.nextToken();
        String B = st.nextToken();

        BigInteger a = new BigInteger(A);
        BigInteger b = new BigInteger(B);

        System.out.println(a.gcd(b));
        System.out.println(a.multiply(b).divide(a.gcd(b)));

    }
}
