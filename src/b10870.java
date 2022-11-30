import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class b10870 {
    static int answer = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(br.readLine());


        System.out.println(solutionb10870(a));

    }

    private static int solutionb10870(int a) {



        if(a==0) return 0;
        if(a==1) return 1;
        return solutionb10870(a-1)+solutionb10870(a-2);



    }
}
