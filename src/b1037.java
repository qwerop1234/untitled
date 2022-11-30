import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class b1037 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ArrayDeque<Integer> dq = new ArrayDeque<>();
        int a = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        ArrayList<Integer> list = new ArrayList<>();
        for(int i  = 0; i<a; i++){
            list.add(Integer.parseInt(st.nextToken()));
        }
        Collections.sort(list);
        dq.addAll(list);

        System.out.println(dq.getFirst()* dq.getLast());
    }
}
