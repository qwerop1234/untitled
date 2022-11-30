import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class b2231 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s = br.readLine();
        int a = Integer.parseInt(s);

        int temp = 0;

        for(int i = a-(s.length()*9); i<a; i++){
            int sum = 0;
            int cnt = i;
            while(cnt!=0){
                sum+=cnt%10;
                cnt = cnt/10;
            }

            if(sum+i==a){
                temp = i;
                break;
            }
        }
        System.out.println(temp);

    }
}
