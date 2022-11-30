import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class b9663 {
    static int N;
    static int[][] map;
    static boolean[][] visit;
    static int cnt;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        visit = new boolean[N][N];
        map = new int[N][N];

        dfs(0);

        System.out.println(cnt);
    }

    private static void dfs(int depth) {
        if(depth==N){
            cnt++;
            return;
        }

        for(int i = 0; i<N; i++){
            if(!visit[depth][i]){
                visit[depth][i]=true;
                map[depth][i]=1;

                check(depth,i);
                dfs(depth+1);

                map[depth][i] = 0;
                a();

                for(int j = 0; j<N; j++){
                    for(int k = 0; k<N; k++){
                        if(map[j][k]==1){
                            check(j,k);
                        }
                    }
                }
            }


        }



    }

    private static void a() {
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                visit[i][j] = false;
            }
        }
    }

    private static void check(int depth, int i) {
        for(int j = depth; j<N; j++){
            visit[j][i] = true;
        }

        int row = depth;
        int column = i;

        while(0<=column&column<N&0<=row&row<N){
            visit[row++][column--] = true;
        }

        row = depth;
        column = i;

        while((0<=row&row<N&(0<=column&column<N))){
            visit[row++][column++] = true;
        }
    }
}
