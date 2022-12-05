public class solution68935 {
    public int solution(int n) {
        int answer = 0;
        String temp = Integer.toString(n, 3);
        String reversed = new StringBuffer(temp).reverse().toString();
        answer = Integer.parseInt(reversed, 3);


        return answer;


    }
}
