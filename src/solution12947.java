public class solution12947 {
    public boolean solution(int x) {
        boolean answer = true;
        String a = String.valueOf(x);
        int sum = 0;

        for(int i = 0; i<a.length();i++){
            sum = sum + a.charAt(i)-'0';
        }
        if(x%sum!=0){
            answer = false;
        }





        return answer;
    }
}
