import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public class b2751 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();
        ArrayList<Integer> list = new ArrayList<>();

        int a = Integer.parseInt(br.readLine());

        for(int i = 0; i<a; i++){
            int b = Integer.parseInt(br.readLine());
            list.add(b);
        }
        Collections.sort(list);
        for(int i = 0; i< list.size(); i++){
            sb.append(list.get(i)).append("\n");
        }
        System.out.println(sb);

    }
}
