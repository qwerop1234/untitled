import java.util.ArrayList;

public class b111 {
    public int solution(String reference, String track){
        int answer = 100;
        int m = 0;
        ArrayList<String>[] list = new ArrayList[m];




        for(int i = 0; i<track.length(); i++){
            for(int j = 0; j<reference.length(); j++){

                if(track.charAt(i)==reference.charAt(j)){
                    m++;
                    int n = 0;
                    for(int k = 0; k<track.length(); k++){
                        if(track.charAt(i+k)==reference.charAt(j+k)){
                            n++;
                        }
                    }
                    for(int k = i; i<i+n; i++){
                        list[m-1].add(String.valueOf(track.charAt(k)));
                    }
                    i = i+n;

                }

            }
        }

        for(int i = 0; i<m; i++){
            if(answer>list[i].size()){
                answer = list[i].size();
            }
        }




        return  answer;
    }
}
