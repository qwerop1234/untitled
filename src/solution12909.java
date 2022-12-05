import java.util.Stack;

public class solution12909 {
    boolean solution(String s) {
        boolean answer = true;
        Stack<Character> stack = new Stack<>();

        for(int i = 0; i<s.length(); i++){
            if(s.charAt(i)=='('){
                stack.add(s.charAt(i));
            }else{
                if(stack.isEmpty()){
                    return false;
                }else{
                    stack.pop();
                }
            }

        }
        if(stack.isEmpty()){
            return true;
        }else{
            return false;
        }



    }
}
