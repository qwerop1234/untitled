import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class b11425 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        HashMap<String, Integer> hm = new HashMap<>();

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int cnt = 0;

        for(int i = 0; i<a; i++){
            String s = br.readLine();
            hm.put(s,hm.getOrDefault(s,0)+1);
        }

        for(int i = 0; i<b; i++){
            String s = br.readLine();
            if(hm.containsKey(s)){
                cnt++;
            }
        }

        System.out.println(cnt);

    }
}
