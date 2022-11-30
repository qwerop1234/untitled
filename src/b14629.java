import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class b14629 {

    static long N;
    static int M;
    static boolean[] visit;
    static int[] arr;
    static long Min = Long.MAX_VALUE;
    static long answer;


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Long.parseLong(br.readLine());
        M = (int) (Math.log10(N)+1);
        arr = new int[M];
        visit = new boolean[10];


        dfs(0);


        System.out.println(answer);
    }

    private static void dfs(int depth) {
        if(depth==M){

            long a = 0;

            for(int i = 0; i<arr.length; i++){
                a += arr[i]*Math.pow(10,arr.length-1-i);
            }

            if(Min==Math.abs(N-a)){
                if(answer>a){
                    answer = a;
                }
            }

            if(Min>Math.abs(N-a)){
                Min = Math.abs(N-a);
                answer = a;
            }

            return;
        }

        if(depth==10){

            long a = 0;
            for(int i = 0; i<10; i++){
                a += arr[i]*Math.pow(10,10-1-i);
            }
            if(Min>Math.abs(N-a)){
                Min = Math.abs(N-a);
                answer = a;
            }

            return;

        }


        for(int i = 0; i<10; i++){
            if(!visit[i]){
                visit[i] = true;
                arr[depth] = i;
                dfs(depth+1);
                visit[i] = false;
            }
        }


    }
}
