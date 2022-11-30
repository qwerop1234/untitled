import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class b2217 {
    static int k;
    static int[] arr;
    static int Max = 0;


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        k = Integer.parseInt(br.readLine());
        arr = new int[k];

        for(int i = 0; i<k; i++){
            arr[i] = Integer.parseInt(br.readLine());
        }
        Arrays.sort(arr);


        int cnt = 1;
        int min = 0;

        for(int i = 0; i<k; i++){
            min = arr[k-1-i];
            if(Max<min*cnt){
                Max = min*cnt;
            }
            cnt++;
        }

        System.out.println(Max);


    }
}
