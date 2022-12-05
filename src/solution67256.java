public class solution67256 {
    public String solution(int[] numbers, String hand) {
        String answer = "";
        int leftnumber = 10;
        int rightnumber = 12;


        for(int i = 0; i<numbers.length;i++){
            if(numbers[i]==1||numbers[i]==4||numbers[i]==7){
                leftnumber = numbers[i];
                answer = answer + "L";
            }
            else if(numbers[i]==3||numbers[i]==6||numbers[i]==9){
                rightnumber = numbers[i];
                answer = answer + "R";
            }
            else if(numbers[i]==2||numbers[i]==5||numbers[i]==8){
                if(Math.abs(leftnumber-numbers[i])/3+Math.abs(leftnumber-numbers[i])%3>Math.abs(rightnumber-numbers[i])/3+Math.abs(rightnumber-numbers[i])%3){
                    rightnumber = numbers[i];
                    answer = answer + "R";
                }else if(Math.abs(leftnumber-numbers[i])/3+Math.abs(leftnumber-numbers[i])%3<Math.abs(rightnumber-numbers[i])/3+Math.abs(rightnumber-numbers[i])%3){
                    leftnumber = numbers[i];
                    answer = answer + "L";
                }else if(Math.abs(leftnumber-numbers[i])/3+Math.abs(leftnumber-numbers[i])%3==Math.abs(rightnumber-numbers[i])/3+Math.abs(rightnumber-numbers[i])%3){
                    if(hand.equals("left")){
                        leftnumber = numbers[i];
                        answer = answer + "L";
                    }else{
                        rightnumber = numbers[i];
                        answer = answer + "R";
                    }
                }
            }
            else if(numbers[i]==0){
                if(Math.abs(leftnumber-11)/3+Math.abs(leftnumber-11)%3>Math.abs(rightnumber-11)/3+Math.abs(rightnumber-11)%3){
                    rightnumber = 11;
                    answer = answer + "R";
                }else if(Math.abs(leftnumber-11)/3+Math.abs(leftnumber-11)%3<Math.abs(rightnumber-11)/3+Math.abs(rightnumber-11)%3){
                    leftnumber = 11;
                    answer = answer + "L";
                }else if(Math.abs(leftnumber-11)/3+Math.abs(leftnumber-11)%3==Math.abs(rightnumber-11)/3+Math.abs(rightnumber-11)%3){
                    if(hand.equals("left")){
                        leftnumber = 11;
                        answer = answer + "L";
                    }else{
                        rightnumber = 11;
                        answer = answer + "R";
                    }
                }
            }
        }


        return answer;
    }
}
