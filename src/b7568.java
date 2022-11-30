import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class b7568 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();

        int a = Integer.parseInt(br.readLine());

        int [][] per = new int[a][2];

        int cnt = 1;

        for(int i = 0; i<a; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());
            per [i][0] = b;
            per [i][1] = c;
        }

        for(int i = 0; i<a; i++){
            for(int j = 0; j<a; j++){
                if(i==j){
                    continue;
                }
                if(per[i][0]<per[j][0]&&per[i][1]<per[j][1]){
                    cnt++;
                }
            }
            sb.append(cnt).append(" ");
            cnt=1;
        }
        System.out.println(sb);

    }
}
