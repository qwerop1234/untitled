import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class b1654 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        ArrayList<Integer> list = new ArrayList<>();

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        int[] arr = new int[a];

        long max = 0;

        for (int i = 0; i < a; i++) {
            arr[i] = Integer.parseInt(br.readLine());
            if(max < arr[i]) {
                max = arr[i];
            }
        }

        long start = 0;
        long cnt = 0;
        max++;

        while(start<max){
            long mid = (start + max)/2;
            for(int i = 0; i< a; i++){
                cnt += arr[i]/mid;
            }
            if(cnt<b){
                max = mid;
            }else {
                start = mid+1;
            }
            cnt = 0;
        }
        System.out.println(start-1);
    }
}
