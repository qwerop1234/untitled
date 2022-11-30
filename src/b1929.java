import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class b1929 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int temp = 0;


        for(int i = a; i<=b; i++){
            if(i==1){
                continue;
            }
            for(int j = 1; j<=Math.sqrt(i); j++){
                if(i%j==0){
                    temp++;
                }
                if(temp>=2){
                    break;
                }
            }
            if(temp==1){
                sb.append(i).append("\n");
            }
            temp = 0;
        }
        System.out.println(sb);
    }
}
