import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class b1546 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> list = new ArrayList<>();
        double b = 0;
        double c = 0;

        int a = Integer.parseInt(br.readLine());

        StringTokenizer s = new StringTokenizer(br.readLine());

        int max = 0;
        for(int i = 0; i<a; i++){
            list.add(Integer.parseInt(s.nextToken()));
            if(list.get(i)>max){
                max = list.get(i);
            }
            b += list.get(i);
        }
        c = b*100/max/a;


        System.out.println(c);
    }
}
