public class solution12977 {
    public static int solution(int[] nums) {

        int answer = 0;
        int sum = 0;

        for(int i = 0; i<nums.length; i++){
            for(int j = i+1; j<nums.length; j++) {
                for (int k = j + 1; k < nums.length; k++) {
                    sum = nums[i] + nums[j] + nums[k];
                    if(check(sum)){
                        answer = answer + 1;
                    }
                }
            }
        }

        return answer;
    }

    private static boolean check(int sum) {
        int count = 0;
        for(int a = 1; a<=Math.sqrt(sum); a++){
            if(sum%a==0){
                count = count+1;
            }
            if(count>1){
                return false;
            }
        }
        if(count==1){
            return true;
        }



        return false;
    }
}
