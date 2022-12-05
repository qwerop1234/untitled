import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class solution12933 {
    public long solution(long n) {
        long answer = 0;
        String temp = "";
        ArrayList<Integer> list = new ArrayList<>();

        temp = String.valueOf(n);
        for(int i = 0; i<temp.length();i++){
            list.add((int) temp.charAt(i)-'0');
            Collections.sort(list,Collections.reverseOrder());
        }
        temp = "";

        for(int i = 0; i<list.size();i++){
            temp = temp + String.valueOf(list.get(i));
        }

        answer = Long.parseLong(temp);



        return answer;
    }
}
