import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class b18870 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();
        HashMap<Integer, Integer> hm = new HashMap<>();

        int a = Integer.parseInt(br.readLine());
        int [] arr = new int[a];
        int [] rearr = new int[a];

        StringTokenizer st = new StringTokenizer(br.readLine());

        for(int i = 0; i<a; i++){
            arr[i]=rearr[i]=Integer.parseInt(st.nextToken());
        }

        Arrays.sort(rearr);
        int cnt = 0;

        for(int i = 0; i<a; i++){
            if(!hm.containsKey(rearr[i])){
                hm.put(rearr[i],cnt);
                cnt++;
            }
        }
        for(int key : arr){
            sb.append(hm.get(key)).append(" ");
        }



        System.out.println(sb);


    }
}
