import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class b1193 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(br.readLine());

        int temp = 0;
        int cnt = 0;

        while(temp<a){
            cnt++;
            temp = temp + cnt;
        }
        if(cnt%2==0){
            System.out.println(cnt-(temp-a)+"/"+(cnt+1-(cnt-(temp-a))));
        }else{
            System.out.println(temp-a+1+"/"+(cnt-(temp-a)));
        }
    }
}
