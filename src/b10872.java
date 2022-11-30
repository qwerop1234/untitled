import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class b10872 {

    static int answer = 1;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(br.readLine());


        System.out.println(solutionb10872(a));

    }

    private static int solutionb10872(int a) {



        if(a>1){
            answer *= a;
            a--;
            solutionb10872(a);
        }else{
            return answer;
        }

        return answer;
    }
}
