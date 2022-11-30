import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class b13305 {

    static int N;
    static long[] road;
    static long[] city;



    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());

        road = new long[N-1];
        city = new long[N];

        StringTokenizer st = new StringTokenizer(br.readLine());

        for(int i = 0; i<road.length; i++){
            road[i] = Long.parseLong(st.nextToken());
        }

        st = new StringTokenizer(br.readLine());


        long min = 0;
        long answer = 0;

        for(int i = 0; i<city.length; i++){
            city[i] = Long.parseLong(st.nextToken());
            min = city[0];

        }

        for(int i = 0; i< city.length; i++){
            if(min>city[i]){
                min = city[i];
            }else{
                city[i] = min;
            }

        }

        for(int i = 0; i<N-1; i++){
            answer += city[i]*road[i];
        }

        System.out.println(answer);










    }
}
