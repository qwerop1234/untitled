import java.util.HashMap;

public class solution81301 {
    public int solution(String s) {
        HashMap<String, Integer> hm = new HashMap<>();

        hm.put("zero",0);
        hm.put("one",1);
        hm.put("two",2);
        hm.put("three",3);
        hm.put("four",4);
        hm.put("five",5);
        hm.put("six",6);
        hm.put("seven",7);
        hm.put("eight",8);
        hm.put("nine",9);

        String result = "";
        String memory = "";

        for(int i = 0; i < s.length(); i++){
            char temp = s.charAt(i);
            if(temp >= '0' && temp <= '9'){
                result += temp;
            }else {
                memory += temp;

                if(hm.containsKey(memory)){
                    result += String.valueOf(hm.get(memory));
                    memory = "";
                }
            }
        }

        int answer = Integer.parseInt(result);

        return answer;
    }
}
