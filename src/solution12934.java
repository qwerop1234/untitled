public class solution12934 {
    public long solution(long n) {
        long answer = 0;

        if(n%Math.sqrt(n)==0){
            answer = (long) ((long) (Math.sqrt(n)+1)*(Math.sqrt(n)+1));
        }else{
            answer = -1;
        }



        return answer;
    }
}
