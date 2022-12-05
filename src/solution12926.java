import java.util.Objects;

public class solution12926 {
    public String solution(String s, int n) {
        String answer = "";
        String[] temp = s.split("");




        for(int i= 0; i<temp.length;i++){
            if(Objects.equals(temp[i], " ")){
                answer += " ";
            }else if(temp[i].charAt(0)<='Z'){
                answer +=(char)((temp[i].charAt(0)+n-'A')%26+'A');
            }else if(temp[i].charAt(0)<='z'){
                answer +=(char)((temp[i].charAt(0)+n-'a')%26+'a');
            }
        }
        return answer;
    }
}
