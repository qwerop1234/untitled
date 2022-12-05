public class solution12912 {
    public long solution(int a, int b) {
        long answer = 0;
        int A = 0;
        int B = 0;
        if(a<b){
            A = a;
            B = b;
        }else{
            A = b;
            B = a;
        }


        for(int i = A; i<=B; i++){
            answer = answer + i;
        }


        return answer;
    }
}
