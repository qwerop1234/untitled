public class solution12943 {
    public int solution(long num) {
        long answer = 0;

        if(num == 1){
            return 0;
        }
        for(int i = 0; i<500; i++){
            if(num%2==0){
                num = num/2;
            }else{
                num = 3*num+1;
            }
            answer = answer+1;
            if(num==1){
                break;
            }
        }
        if(num != 1){
            answer = -1;
        }




        return (int) answer;
    }
}
