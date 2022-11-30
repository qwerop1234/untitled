import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class b4344 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Double> list1 = new ArrayList<>();

        int first = Integer.parseInt(br.readLine());

        for(int i = 0; i<first; i++){
            StringTokenizer s = new StringTokenizer(br.readLine());
            int second1 = Integer.parseInt(s.nextToken());
            int cnt = 0;
            int answer = 0;

            for(int j = 0; j<second1; j++){
                list.add(Integer.parseInt(s.nextToken()));
            }
            for(int j = 0; j<list.size(); j++){
                cnt += list.get(j);
            }
            int temp = cnt/second1;
            for(int j = 0; j<list.size(); j++){
                if(temp<list.get(j)){
                    answer++;
                }
            }

            double k = (double) Math.round(answer*100*10000/second1) / (double) 10000.0;
            list1.add(k);
            k = 0;
            list.clear();

        }
        if(list1.size()==first){
            for(int i = 0; i<list1.size(); i++){
                System.out.println(String.format("%.3f",list1.get(i))+"%");
            }
        }
    }
}
