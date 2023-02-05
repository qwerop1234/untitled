import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class b1388 {

    static int N = 0;
    static int M = 0;


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        String map[] = new String[N];
        int cnt = N*M;

        for(int i = 0; i<N; i++){
            map[i] = br.readLine();
        }

        for(int i = 0; i<N-1; i++){
            for(int j = 0; j<M-1; j++){
                if(map[i].charAt(j)=='-'&&map[i].charAt(j+1)=='-'){
                    cnt--;
                }else if(map[i].charAt(j)=='|'&&map[i+1].charAt(j)=='|'){
                    cnt--;
                }
            }
        }

        for(int j = 0; j<M-1; j++){
            if(map[N-1].charAt(j)=='-'&&map[N-1].charAt(j+1)=='-'){
                cnt--;
            }
        }

        for(int i = 0; i<N-1; i++){
            if(map[i].charAt(M-1)=='|'&&map[i+1].charAt(M-1)=='|'){
                cnt--;
            }
        }



        System.out.println(cnt);



    }
}
