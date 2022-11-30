import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class b10773 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(br.readLine());

        Stack<Integer> stack = new Stack<>();

        int sum = 0;

        for(int i = 0; i<a; i++){
            int b = Integer.parseInt(br.readLine());
            if(b!=0){
                stack.add(b);
            }else{
                stack.pop();
            }
        }
        while(!stack.isEmpty()){
            sum+=stack.pop();
        }
        System.out.println(sum);
    }
}
