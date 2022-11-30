import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

public class b11478 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();

        HashSet<String> set = new HashSet<>();
        for(int i = 0; i<=s.length(); i++){
            for(int j = i+1; j<=s.length(); j++){
                if(!set.contains(s.substring(i,j))){
                    set.add(s.substring(i,j));
                }
            }
        }
        StringBuffer sb = new StringBuffer();
        sb.append(set.size());

        System.out.println(sb);



    }
}
