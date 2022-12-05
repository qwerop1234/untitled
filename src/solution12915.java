import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class solution12915 {
    public String[] solution(String[] strings, int n) {
        String[] answer = new String[strings.length];
        ArrayList<String> list = new ArrayList<>();

        for(int i = 0; i<strings.length;i++){
            list.add(i,strings[i]);
        }
        Collections.sort(list, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if(o1.charAt(n) == o2.charAt(n)){
                    return o1.compareTo(o2);
                } else return o1.charAt(n) - o2.charAt(n);
            }
        });
        for(int i = 0; i<list.size(); i++){
            answer[i]=list.get(i);
        }

        return answer;
    }
}
