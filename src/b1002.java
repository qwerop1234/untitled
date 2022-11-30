import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class b1002 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();

        int a = Integer.parseInt(br.readLine());

        for(int i = 0; i<a; i++){
            StringTokenizer st =new StringTokenizer(br.readLine());
            int x1 = Integer.parseInt(st.nextToken());
            int y1 = Integer.parseInt(st.nextToken());
            int r1 = Integer.parseInt(st.nextToken());
            int x2 = Integer.parseInt(st.nextToken());
            int y2 = Integer.parseInt(st.nextToken());
            int r2 = Integer.parseInt(st.nextToken());

            int x = Math.abs(x1-x2);
            int y = Math.abs(y1-y2);

            if(x==0&&y==0&&r1==r2){
                sb.append(-1).append("\n");
                continue;
            }

            int d = x*x+y*y;

            if(d>(r1+r2)*(r1+r2)){
                sb.append(0).append("\n");
            }else if(d<(r1-r2)*(r1-r2)){
                sb.append(0).append("\n");
            }else if(d<(r2-r1)*(r2-r1)){
                sb.append(1).append("\n");
            }else if(d==(r2-r1)*(r2-r1)){
                sb.append(1).append("\n");
            }else if(d==(r2+r1)*(r2+r1)){
                sb.append(1).append("\n");
            }else{
                sb.append(2).append("\n");
            }


        }
        System.out.println(sb);
    }
}
