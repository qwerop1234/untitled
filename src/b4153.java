import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class b4153 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();

        while(true){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());

            if(a==0&&b==0&&c==0){
                break;
            }

            if(a*a+b*b==c*c||a*a+c*c==b*b||b*b+c*c==a*a){
                sb.append("right").append("\n");
            }else{
                sb.append("wrong").append("\n");
            }
        }

        System.out.println(sb);



    }
}
