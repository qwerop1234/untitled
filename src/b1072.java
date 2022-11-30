import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class b1072 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        long a = Integer.parseInt(st.nextToken());
        long b = Integer.parseInt(st.nextToken());



        long answer = cal(a,b);

        System.out.println(answer);



    }

    private static long cal(double a, double b) {

        long start = 0;
        long end = Integer.MAX_VALUE;






        long c = (long) (b * 100 / a);
        if(c>=99){
            return -1;
        }


        while (start < end) {
            long mid = (start + end) / 2;
            long all = (long) (a + mid);
            long win = (long) (b + mid);
            long cal = win*100 / all;
            if (cal > c) {
                end =  mid;
            } else if(cal< c+1){
                start = mid + 1;
            }
        }

        return start;
    }
}
