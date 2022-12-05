public class solution12945 {
    public static int solution(int n) {
        int answer = 0;


        answer = fi(n)%1234567;
        return answer;
    }

    private static int fi(int n){

        int[] fi = new int[n+1];

        fi[0] = 0;
        fi[1] = 1;

        for(int i = 2; i<=n; i++){
            fi[i] = fi[i-1]%1234567+fi[i-2]%1234567;
        }

        return fi[n];
    }
}
