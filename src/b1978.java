import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class b1978 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int cnt = 0;

        int a = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 0; i<a; i++){
            int b = Integer.parseInt(st.nextToken());
            if(b==1){
                continue;
            }else{
                cnt += solution(b);
            }
        }
        System.out.println(cnt);
    }

    private static int solution(int b) {
        int answer = 0;
        int temp = 0;
        for(int i = 1; i<=Math.sqrt(b); i++){
            if(b%i==0){
                temp++;
            }
        }
        if(temp==1){
            answer = 1;
        }

        return answer;
    }
}
