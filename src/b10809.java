import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class b10809 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Character> list = new ArrayList<>();

        String s = br.readLine();

        for(int i = 0; i<s.length(); i++){
            list.add((char) (s.charAt(i)-'a'));
        }


        int[] arr = new int[26];

        for(int i = 0; i<arr.length; i++){
            arr[i] = -1;
        }

        for(int i = 0; i<list.size(); i++){
            if(arr[list.get(i)]>-1){
                continue;
            }
            arr[list.get(i)]=i;
        }

        for(int i = 0; i<arr.length; i++){
            System.out.println(arr[i]);
        }
    }
}
