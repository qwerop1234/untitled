import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class b9020 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int a = Integer.parseInt(br.readLine());

        boolean[] cp = new boolean[10000];
        Arrays.fill(cp, true);
        cp[0] = false;
        cp[1] = false;

        for(int i = 0; i*i<cp.length; i++){
            if(cp[i]){
                for(int j = i*i; j<cp.length; j+=i){
                    cp[j]=false;
                }
            }
        }




        for(int i = 0; i<a; i++){
            int b = Integer.parseInt(br.readLine());

            int first = b/2;
            int second = b/2;

            while(true){
                if(cp[first]&&cp[second]){
                    break;
                }
                first--;
                second++;
            }

            sb.append(first).append(" ").append(second).append("\n");
        }



        System.out.println(sb);
    }
}
