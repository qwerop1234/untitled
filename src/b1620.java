import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class b1620 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        HashMap<String, String> hm = new HashMap<>();
        StringBuffer sb = new StringBuffer();

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        for(int i = 0; i<a; i++){
            String s = br.readLine();
            hm.put(s, Integer.toString(i+1));
            hm.put(Integer.toString(i+1),s);
        }

        for(int i = 0; i<b; i++){
            sb.append(hm.get(br.readLine())).append("\n");
        }
        System.out.println(sb);



    }
}
