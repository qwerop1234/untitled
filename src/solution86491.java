import java.util.Arrays;

public class solution86491 {
    public int solution(int[][] sizes) {
        int answer = 0;
        int[][] temp = new int[2][sizes.length];
        int a = 0;
        int b = 0;

        for(int i = 0; i< sizes.length;i++){
            if(sizes[i][0]>sizes[i][1]){
                temp[0][i] = sizes[i][0];
                temp[1][i] = sizes[i][1];
            }else{
                temp[0][i] = sizes[i][1];
                temp[1][i] = sizes[i][0];
            }
        }
        Arrays.sort(temp[0]);
        Arrays.sort(temp[1]);
        a = temp[0][temp[0].length-1];
        b = temp[1][temp[0].length-1];




        answer = a*b;

        return answer;
    }
}
