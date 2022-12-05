import java.util.LinkedList;
import java.util.Objects;
import java.util.Queue;

public class solution92335 {
    public static int solution(int n, int k) {
        Queue<String> q = new LinkedList<>();

        String s = Integer.toString(n, k);
        s += "0";
        String s1 = "";
        int answer = 0;


        for(int i = 0; i<s.length(); i++){
            if(s.charAt(i)=='0'){
                if(q.isEmpty()){
                    continue;
                }
                int b = q.size();
                for(int j = 0; j<b; j++){
                    s1 += q.poll();
                }
                if(Objects.equals(s1,"1")){
                    s1 = "";
                }else{
                    Long a = Long.parseLong(s1);
                    Boolean t = false;
                    for(int j = 2; j<=Math.sqrt(a);j++){
                        if(a%j==0){
                            t = true;
                            break;
                        }
                    }
                    if(!t){
                        answer++;
                    }
                    s1 = "";
                }


            }else{
                q.add(String.valueOf(s.charAt(i)));
            }


        }







        return answer;
    }
}
