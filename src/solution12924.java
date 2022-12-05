public class solution12924 {
    public static int solution(int n) {
        int answer = 0;
        for(int i = 1; i<=n;i++){
            int a = 0;
            for(int j = i; j<=n;j++){
                if(a<n){
                    a = a+j;
                }else if(a==n){
                    answer = answer +1;
                    break;
                }else if(a>n){
                    break;
                }
            }

        }


        return answer+1;
    }
}
