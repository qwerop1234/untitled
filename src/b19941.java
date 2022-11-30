import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;


public class b19941 {
    static int N;
    static int K;
    static char[] arr;
    static int answer;
    static boolean[] visit;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());

        arr = new char[N];
        visit = new boolean[N];

        String S = br.readLine();
        Queue<Integer> q = new LinkedList<>();

        for(int i = 0; i<N; i++){
            arr[i] = S.charAt(i);
            if(arr[i]=='P'){
                q.add(i);
                visit[i] = true;
            }


        }

        while(!q.isEmpty()){

            boolean t = false;

            int temp = q.poll();
            for(int i = K; i>=1; i--){
                if(temp-i>=0&&arr[temp-i]=='H'&&visit[temp-i]==false){
                    visit[temp-i] = true;
                    answer++;
                    t = true;
                    break;
                }
            }
            for(int i = 1; i<=K; i++){
                if(t){
                    break;
                }
                if(temp+i<N&&arr[temp+i]=='H'&&visit[temp+i]==false){
                    visit[temp+i] = true;
                    answer++;
                    break;
                }
            }
        }

        System.out.println(answer);


    }
}
