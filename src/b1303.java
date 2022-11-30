import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class b1303 {
    static int N;
    static int M;
    static int[] R = {0, 0, -1, 1};
    static int[] C = {1, -1, 0, 0};
    static boolean[][] visit;
    static int B;
    static int W;
    static int cnt;
    static char[][] map;


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        visit = new boolean[101][101];
        map = new char[101][101];

        for (int i = 0; i < M; i++)
            map[i] = br.readLine().toCharArray();

        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                if (!visit[i][j]) {
                    cnt = 0;
                    dfs(i, j);
                    if (map[i][j] == 'W')
                        W += cnt * cnt;
                    else if(map[i][j]=='B')
                        B += cnt * cnt;
                }
            }
        }
        System.out.println(W + " " + B);
    }

    private static void dfs(int i, int j) {
        visit[i][j] = true;
        cnt++;

        for(int a = 0; a<4; a++){
            int nexti = R[a]+i;
            int nextj = C[a]+j;

            if(nexti<0||nextj<0||nexti>=M||nextj>=N){
                continue;
            }
            if(visit[nexti][nextj]){
                continue;
            }

            if(map[i][j]==map[nexti][nextj]){
                visit[nexti][nextj] = true;
                dfs(nexti,nextj);
            }
        }


    }
}
