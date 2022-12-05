import java.util.ArrayList;
import java.util.Collections;

public class solution12939 {
    public String solution(String s) {
        String answer = "";

        String[] s1=s.split(" ");
        ArrayList<Integer> s2 = new ArrayList<>();

        for(int i = 0; i<s1.length;i++){
            s2.add(Integer.parseInt(s1[i]));
        }
        Collections.sort(s2);

        answer = answer + s2.get(0) + " " + s2.get(s2.size()-1);

        return answer;
    }
}
