import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class b2776 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();

        int a = Integer.parseInt(br.readLine());

        for(int i = 0; i<a; i++){
            int b = Integer.parseInt(br.readLine());
            StringTokenizer st = new StringTokenizer(br.readLine());
            int[] one = new int[b];
            for(int j = 0; j<b; j++){
                one[j]=Integer.parseInt(st.nextToken());
            }
            Arrays.sort(one);

            int c = Integer.parseInt(br.readLine());
            st = new StringTokenizer(br.readLine());
            int[] two = new int[c];
            for(int j = 0; j<c; j++){
                two[j]=Integer.parseInt(st.nextToken());
            }



            for(int j = 0; j<two.length; j++){
                int start = 0;
                int end = one.length-1;
                int mid = 0;

                while(end>start){
                    mid = (start+end)/2;
                    if(one[mid]>=two[j]){
                        end = mid;
                    }else if(one[mid]<two[j]){
                        start = mid+1;
                    }
                }
                if(one[start]==two[j]){
                    sb.append(1).append("\n");
                }else{
                    sb.append(0).append("\n");
                }

            }

        }
        System.out.println(sb);
    }
}
