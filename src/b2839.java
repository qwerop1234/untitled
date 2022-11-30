import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class b2839 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(br.readLine());

        System.out.println(solution(a));

    }

    private static int solution(int a) {

        int answer = 0;

        if (a==4 || a==7) {
            answer = -1;
        }
        else if (a%5==0) {
            answer = a / 5;
        }
        else if (a%5==1 || a%5==3) {
            answer = a / 5 + 1;
        }
        else if (a%5==2 || a%5==4) {
            answer = a / 5 + 2;
        }


        return answer;
    }
}
