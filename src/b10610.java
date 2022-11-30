import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;

public class b10610 {
    static String S;


    static long[] arr;
    static long temp = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        S = br.readLine();
        arr = new long[S.length()];

        boolean a = false;
        double b = 0;

        for(int i = 0; i<S.length(); i++){
            arr[i] = Long.parseLong(String.valueOf(S.charAt(i)));
            if(arr[i]==0){
                a = true;
            }
            b += arr[i];
        }

        if(b%3!=0){
            System.out.println(-1);
            System.exit(0);
        }

        if(!a){
            System.out.println(-1);
            System.exit(0);
        }

        Arrays.sort(arr);
        StringBuilder sb = new StringBuilder();

        for(int i = S.length()-1; i>=0; i--){
            sb.append(arr[i]);
        }

        System.out.println(sb);



    }
}
