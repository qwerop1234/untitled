import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;

public class b10815 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        boolean[] card = new boolean[20000001];
        ArrayList<Integer> list = new ArrayList<>();
        StringBuffer sb = new StringBuffer();

        Arrays.fill(card,false);

        StringTokenizer st = new StringTokenizer(br.readLine());

        for(int i = 0; i<a; i++){
            card[Integer.parseInt(st.nextToken())+10000000]=true;
        }

        int b = Integer.parseInt(br.readLine());
        StringTokenizer st1 = new StringTokenizer(br.readLine());
        for(int i = 0; i<b; i++){
            list.add(Integer.parseInt(st1.nextToken()));
        }
        int start = 0;
        int end = 20000001;
        for(int i = 0; i<b; i++){

            int mid = (start+end)/2;
            int cnt = list.get(i)+10000000;
            while(true){
                if(mid>cnt){
                    end=mid;
                    mid = (start+end)/2;
                }else if(mid<cnt){
                    start=mid;
                    mid = (start+end)/2;
                }else{
                    break;
                }

            }
            if(card[mid]){
                sb.append(1).append(" ");
            }else{
                sb.append(0).append(" ");
            }
            start = 0;
            end = 20000001;
        }

        System.out.println(sb);
    }
}
