import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class b5622 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s = br.readLine();

        int answer = 0;

        for(int i = 0; i<s.length(); i++){
            if(s.charAt(i)=='A'||s.charAt(i)=='B'||s.charAt(i)=='C'){
                answer += 3;
            }else if(s.charAt(i)=='D'||s.charAt(i)=='E'||s.charAt(i)=='F'){
                answer += 4;
            }else if(s.charAt(i)=='G'||s.charAt(i)=='H'||s.charAt(i)=='I'){
                answer += 5;
            }else if(s.charAt(i)=='J'||s.charAt(i)=='K'||s.charAt(i)=='L'){
                answer += 6;
            }else if(s.charAt(i)=='M'||s.charAt(i)=='N'||s.charAt(i)=='O'){
                answer += 7;
            }else if(s.charAt(i)=='P'||s.charAt(i)=='Q'||s.charAt(i)=='R'||s.charAt(i)=='S'){
                answer += 8;
            }else if(s.charAt(i)=='T'||s.charAt(i)=='U'||s.charAt(i)=='V'){
                answer += 9;
            }else{
                answer += 10;
            }


        }
        System.out.println(answer);
    }
}
