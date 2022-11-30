import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class b2805 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        int [] array = new int[a];

        for(int i = 0; i<a; i++){
            array[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(array);

        int start = 0;
        int end = array[array.length-1];
        int mid = 0;
        long cnt = 0;

        while(start<end){
            mid = (start+end)/2;
            for(int i = 0; i<a; i++){
                if(array[i]-mid>=0){
                    cnt += array[i]-mid;
                }
            }
            if(cnt<b){
                end = mid;
            }else{
                start = mid+1;
            }
            cnt = 0;
        }
        System.out.println(start-1);
    }
}
