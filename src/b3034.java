import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class b3034 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuffer sb = new StringBuffer();

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());

        for(int i = 0; i<a; i++){
            int d = Integer.parseInt(br.readLine());
            if(b*b+c*c>=d*d){
                sb.append("DA").append("\n");
            }else{
                sb.append("NE").append("\n");
            }
        }
        System.out.println(sb);
    }
}
