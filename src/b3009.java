import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class b3009 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        HashMap<Integer, Integer> hm1 = new HashMap<>();
        HashMap<Integer, Integer> hm2 = new HashMap<>();
        StringBuffer sb = new StringBuffer();


        for(int i = 0; i<3; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            hm1.put(a,hm1.getOrDefault(a,0)+1);
            hm2.put(b,hm2.getOrDefault(b,0)+1);
        }

        for(int x : hm1.keySet()){
            if(hm1.get(x)!=2){
                sb.append(x).append(" ");
            }
        }

        for(int x : hm2.keySet()){
            if(hm2.get(x)!=2){
                sb.append(x).append(" ");
            }
        }

        System.out.println(sb);
    }
}
