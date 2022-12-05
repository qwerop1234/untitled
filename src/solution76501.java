public class solution76501 {
    public int solution(int[] absolutes, boolean[] signs) {
        int answer = 0;

        for(int i=0;i<signs.length;i++)
            if(signs[i]==false){
                answer=answer-absolutes[i];
            }else{
                answer=answer+absolutes[i];
            }


        return answer;
    }
}
