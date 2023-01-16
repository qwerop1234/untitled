import com.sun.tools.javac.Main;

import java.util.ArrayList;

public class goorm17301 {
    public static int solution(String pos) {

        int answer = 8;

        int[] row = {1,2,-1,-2,1,2,-1,-2};
        int[] column = {2,-1,2,-1,-2,1,-2,1};

        for(int i = 0; i<8; i++){
            int row1 = pos.charAt(0)-'A';
            int column1 = pos.charAt(1)-'1';
            row1 += row[i];
            column1 += column[i];

            if(row1<0||column1<0){
                answer--;
            }
        }
        return answer;
    }

    public static void main(String[] args) {

        String pos = "A7";

        System.out.println(solution("A7"));
    }



}
