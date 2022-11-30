import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class b1018 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int cnt = Integer.MAX_VALUE;
        int cntb = 0;
        int cntw = 0;

        char[][] board = new char[a][b];
        for(int i = 0; i<a; i++){
            String s = br.readLine();
            for(int j = 0; j<b; j++){
                board[i][j]=s.charAt(j);
            }
        }




        char[][] board1 = new char[a][b];
        char[][] board2 = new char[a][b];
        for(int i = 0; i<a; i++){
            for(int j = 0; j<b; j++){
                if(i%2==0&&j%2==0){
                    board1[i][j]='B';
                    board2[i][j]='W';
                }else if(i%2!=0&&j%2!=0){
                    board1[i][j]='B';
                    board2[i][j]='W';
                }else{
                    board1[i][j]='W';
                    board2[i][j]='B';
                }
            }
        }


        char[][] boardc = new char[8][8];

        for(int i = 0; i<a-7; i++){
            for(int j = 0; j<b-7; j++){
                for(int k = i; k<i+8; k++){
                    for(int l = j; l<j+8; l++){
                        boardc[k-i][l-j]=board[k][l];
                    }
                }
                for(int x = 0; x<8; x++){
                    for(int y = 0; y<8; y++){
                        if(boardc[x][y]!=board1[x][y]){
                            cntb++;
                        }else if(boardc[x][y]!=board2[x][y]){
                            cntw++;
                        }
                    }
                }
                if(cntb>=cntw&&cnt>cntw){
                    cnt = cntw;
                }else if(cntw>cntb&&cnt>cntb){
                    cnt = cntb;
                }
                cntw = 0;
                cntb = 0;
            }
        }


        System.out.println(cnt);
    }
}
