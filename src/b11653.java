import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class b11653 {
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        int a = Integer.parseInt(br.readLine());
        int s = a;

        if(a==1){
            System.out.println();
        }else{
            for(int i = 2; i<=s; i++){
                while (a%i==0){
                    a = a/i;
                    sb.append(i).append("\n");
                }
                if(a==1){
                    break;
                }
            }
            System.out.print(sb);
        }
    }
}
