import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class b2581 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());

        int temp = 0;
        ArrayList<Integer> list = new ArrayList<>();
        int answer = 0;

        for(int i = a; i<=b; i++){
            if(i==1){
                continue;
            }else{
                for(int j = 1; j<=Math.sqrt(i); j++){
                    if(i%j==0){
                        temp++;
                    }
                    if(temp>=2){
                        break;
                    }
                }
                if(temp==1){
                    list.add(i);
                }
            }
            temp = 0;
        }
        for(int x : list){
            answer += x;
        }
        if(list.size()>0){
            System.out.println(answer);
            System.out.println(list.get(0));
        }else{
            System.out.println(-1);
        }

    }

}
