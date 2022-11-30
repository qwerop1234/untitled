import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;

public class b1427 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String s = br.readLine();
        Integer[] list = new Integer[s.length()];

        for(int i = 0; i<s.length(); i++){
            list[i]=Integer.parseInt(String.valueOf(s.charAt(i)-'0'));
        }
        Arrays.sort(list, Collections.reverseOrder());
        for(int i = 0; i< list.length; i++){
            sb.append(list[i]);
        }
        System.out.println(sb);
    }
}
