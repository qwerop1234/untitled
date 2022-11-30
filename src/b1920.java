import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

public class b1920 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();

        int a = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int [] array1 = new int[a];

        for(int i = 0; i<a; i++){
            array1[i]=Integer.parseInt(st.nextToken());
        }
        Arrays.sort(array1);

        int b = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        int [] array2 = new int[b];

        for(int i = 0; i<b; i++){
            array2[i] = Integer.parseInt(st.nextToken());
        }

        int start = 0;
        int end = array1.length-1;
        int mid = 0;
        for(int i = 0; i<b; i++){
            while(end>start){
                mid = (end+start)/2;
                if(array1[mid]>array2[i]){
                    end = mid-1;
                }else if(array1[mid]<array2[i]){
                    start = mid+1;
                }else{
                    break;
                }
            }
            mid = (end+start)/2;
            if(array1[mid]==array2[i]){
                sb.append(1).append("\n");
            }else{
                sb.append(0).append("\n");
            }
            start = 0;
            end = array1.length-1;
        }
        System.out.println(sb);
    }
}
