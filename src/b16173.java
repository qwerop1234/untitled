import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class b16173 {

    static int N;
    static int[][] map;
    static boolean answer;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        map = new int[N][N];

        for(int i = 0; i<N; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j<N; j++){
                map[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        dfs(0,0,map[0][0]);

        if(answer){
            System.out.println("HaruHaru");
        }else{
            System.out.println("Hing");
        }


    }

    private static void dfs(int y, int x, int i) {

        if(i==0){
            return;
        }

        if(y==N-1&&x==N-1){
            answer = true;
        }else if(N>y+i&&!answer) {
            dfs(y+i,x,map[y+i][x]);
        }else if(N>x+i&&!answer){
            dfs(y,x+i,map[y][x+i]);
        }

    }

}
