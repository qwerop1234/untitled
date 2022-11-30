import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class b2417 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        long a = Long.parseLong(br.readLine());

//        long a = (long) Math.pow(2, 63);
//
//        System.out.println((long)Math.ceil(Math.sqrt(a)));

        long answer = Long.MAX_VALUE;
        long start = 0;
        long end = (long) Math.pow(2, 32)-1;

        while(end>=start){
            long mid = (start + end) / 2;
            long value = (long) Math.pow(mid, 2);



            if(value >= a){

                answer = Math.min(answer, mid);
                end = mid - 1;
            }
            else
                start = mid + 1;

        }
        System.out.println(answer);
    }
}
