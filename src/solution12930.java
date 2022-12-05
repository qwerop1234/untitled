import java.util.ArrayList;

public class solution12930 {
    public String solution(String s) {
        String answer = "";
        String[] a = s.split(" ",-1);

        for(int i = 0; i<a.length;i++){
            answer +=" ";
            for(int j = 0; j<a[i].length();j++){
                if(j%2==0){
                    answer +=String.valueOf(a[i].charAt(j)).toUpperCase();

                }else{
                    answer +=String.valueOf(a[i].charAt(j)).toLowerCase();
                }
            }
        }






        return answer.substring(1);
    }
}
