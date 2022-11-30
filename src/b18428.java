import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class b18428 {
    static int N;
    static String[][] map;
    static boolean[][] visit;
    static boolean check = false;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());

        map = new String[N][N];
        visit = new boolean[N][N];

        for(int i = 0; i<N; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int j = 0; j<N; j++){
                map[i][j] = st.nextToken();
            }
        }

        for(int i = 0; i<N; i++){
            for(int j = 0; j<N; j++){
                if(map[i][j].equals("X")){
                    visit[i][j] = true;
                }
            }
        }

        dfs(0);

        if(check){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }


    }

    private static void dfs(int depth) {

        if(check){
            return;
        }

        if(depth==3){
            for(int i = 0; i<N; i++){
                for(int j = 0; j<N; j++){
                    if(map[i][j].equals("S")){
                        int y = i;
                        int x = j;
                        for(int k = y; k>=0; k--){
                            if(map[k][j].equals("O")){
                                break;
                            }

                            if(map[k][j].equals("T")){
                                return;
                            }
                        }
                        for(int k = y; k<N; k++){
                            if(map[k][j].equals("O")){
                                break;
                            }

                            if(map[k][j].equals("T")){
                                return;
                            }
                        }
                        for(int k = x; k>=0; k--){
                            if(map[i][k].equals("O")){
                                break;
                            }

                            if(map[i][k].equals("T")){
                                return;
                            }
                        }
                        for(int k = x; k<N; k++){
                            if(map[i][k].equals("O")){
                                break;
                            }

                            if(map[i][k].equals("T")){
                                return;
                            }
                        }
                    }
                }
            }
            check = true;

            return;
        }

        for(int i = 0; i<N; i++){
            for(int j = 0; j<N; j++){
                if(visit[i][j]){
                    visit[i][j] = false;
                    map[i][j] = "O";
                    dfs(depth+1);
                    map[i][j] = "X";
                    visit[i][j] = true;
                }
            }
        }



    }
}
