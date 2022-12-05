import java.util.ArrayList;
import java.util.Comparator;

public class solution12917 {
    public String solution(String s) {
        String answer = "";
        ArrayList<Character> list = new ArrayList<>();

        for(int i = 0; i<s.length();i++){
            list.add(i,s.charAt(i));
        }
        list.sort(Comparator.reverseOrder());
        for(int i = 0; i<list.size();i++){
            answer += list.get(i);
        }

        return answer;
    }
}
