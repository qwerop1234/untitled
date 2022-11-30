import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class b2775 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        int [][] s = new int [16][16];
        for(int i = 0; i<15; i++){
            for(int j = 0; j<15; j++){
                s[0][j]=j;
                s[i][0]=0;
                if(i>0&&j>0){
                    s[i][j]=s[i-1][j]+s[i][j-1];
                }
            }
        }


        for(int i = 0; i<a; i++){
            int b = Integer.parseInt(br.readLine());
            int c = Integer.parseInt(br.readLine());
            sb.append(s[b][c]).append('\n');


        }
        System.out.println(sb);


    }
}
