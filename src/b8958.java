import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class b8958 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> list = new ArrayList<>();

        int a = Integer.parseInt(br.readLine());
        int answer = 0;


        for(int i = 0; i<a; i++){
            String s = br.readLine();
            int cnt = 0;
            for(int j = 0; j<s.length(); j++){
                if(s.charAt(j)=='O'){
                    cnt++;
                    if(j==s.length()-1){
                        for(int k = 1; k<=cnt; k++){
                            answer += k;
                        }
                    }
                }else if(s.charAt(j)=='X'){
                    for(int k = 1; k<=cnt; k++){
                        answer += k;
                    }
                    cnt = 0;
                }
            }
            list.add(answer);
            answer = 0;
        }
        for(int i = 0; i<list.size(); i++){
            System.out.println(list.get(i));
        }

    }
}
