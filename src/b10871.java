import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class b10871 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        ArrayList<Integer> list = new ArrayList<>();

        int first = Integer.parseInt(st.nextToken());
        int second = Integer.parseInt(st.nextToken());
        StringTokenizer st1 = new StringTokenizer(br.readLine());

        for(int i = 0; i<first; i++){
            int a = Integer.parseInt(st1.nextToken());
            if(second>a){
                list.add(a);
            }

        }

        for(int i = 0; i<list.size(); i++){
            System.out.print(list.get(i) + " ");
        }

    }
}
