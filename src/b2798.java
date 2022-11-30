import java.io.*;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class b2798 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        ArrayList<Integer> list = new ArrayList<>();
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());

        for(int i = 0; i<a; i++){
            list.add(Integer.parseInt(st.nextToken()));
        }

        int cnt = 0;

        for(int i = 0; i<list.size();i++){
            if(i==list.size()-1){
                break;
            }
            for(int j = i+1; j<list.size(); j++){
                if(j==list.size()-1){
                    break;
                }
                for(int k = j+1; k<list.size(); k++){
                    if(list.get(i)+list.get(j)+list.get(k)<=b&&cnt<list.get(i)+list.get(j)+list.get(k)){
                        cnt=list.get(i)+list.get(j)+list.get(k);
                    }
                }
            }
        }
        System.out.println(cnt);


    }
}
