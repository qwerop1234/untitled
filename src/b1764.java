import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.StringTokenizer;

public class b1764 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        HashMap<String, Integer> hm1 = new HashMap<>();
        ArrayList<String> list = new ArrayList<>();
        StringBuffer sb = new StringBuffer();

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        for(int i = 0; i<a; i++){
            String s = br.readLine();
            hm1.put(s, hm1.getOrDefault(s,0)+1);
        }

        int cnt = 0;

        for(int i = 0; i<b; i++){
            String s = br.readLine();
            if(hm1.containsKey(s)){
                list.add(s);
                cnt++;
            }
        }
        Collections.sort(list);
        for(int i = 0; i< list.size(); i++){
            sb.append(list.get(i)).append("\n");
        }
        System.out.println(cnt);
        System.out.println(sb);


    }
}
