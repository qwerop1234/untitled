import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class b4948 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        ArrayList<Boolean> list = new ArrayList<>(123456*2+1);
        int cnt = 0;

        list.add(false);
        list.add(false);
        for(int i = 2; i< 123456*2+1; i++){
            list.add(i,true);
        }
        for(int i = 2; i*i<123456*2+1; i++){
            if(list.get(i)){
                for(int j = i*i; j<123456*2+1; j+=i){
                    list.set(j,false);
                }
            }
        }



        while (true){
            int a = Integer.parseInt(br.readLine());
            if(a==0){
                System.out.print(sb);
                break;
            }else{
                for(int i = a+1; i<=2*a; i++){
                    if(list.get(i)){
                        cnt++;
                    }
                }
                sb.append(cnt).append("\n");
                cnt = 0;
            }

        }




    }
}
