import java.util.HashMap;

public class solution42576 {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        HashMap<String, Integer> hm = new HashMap<>();

        for(int i = 0; i< participant.length;i++){
            if(!hm.containsKey(participant[i])){
                hm.put(participant[i],1);
            }else{
                int value = hm.get(participant[i]);
                hm.put(participant[i],value+1);
            }
        }

        for(int i = 0; i<completion.length;i++){
            int a = hm.get(completion[i])-1;
            if(a==0){
                hm.remove(completion[i]);
            }else{
                hm.put(completion[i],a);
            }
        }

        for(String key : hm.keySet()){
            answer = key;
        }



        return answer;
    }
}
