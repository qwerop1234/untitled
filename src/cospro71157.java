import java.util.*;

public class cospro71157 {
    public static int solution(int K, String[] words) {
        // 여기에 코드를 작성해주세요.
        int answer = 1;
        int cnt = K;


        for(int i = 0; i<words.length; i++){
            cnt -= words[i].length()+1;
            if(cnt<-1){
                answer++;
                cnt = K-words[i].length()+1;
            }

        }

        return answer;
    }

    public static void main(String[] args) {
        int K = 10;
        String[] words = {new String("nice"), new String("happy"), new String("hello"), new String("world"), new String("hi")};

        System.out.println(solution(K, words));
    }


}
