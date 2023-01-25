import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class b1463 {

    static int cnt = Integer.MAX_VALUE;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int x = Integer.parseInt(br.readLine());

        dfs(x,0);

        System.out.println(cnt);

    }

    private static void dfs(int x, int y) {

        if(y>cnt){
            return;
        }

        if(x==1){
            if(cnt>y){
                cnt = y;
                return;
            }
        }else{

            if(x%3==0){
                dfs(x/3, y+1);
            }

            if(x%2==0){
                dfs(x/2, y+1);
            }

            dfs(x-1,y+1);

        }

    }
}
