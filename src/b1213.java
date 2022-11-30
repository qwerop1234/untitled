import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class b1213 {
    static String s;
    static int size;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        s = br.readLine();
        size = s.length();

        int[] alp = new int[26];
        for(int i=0;i<size;i++)
            alp[s.charAt(i)-'A']++;

        int cnt = 0;
        int center = 0;

        for(int i=0;i<26;i++)
            if(alp[i]%2!=0) {
                center = i;
                cnt++;
            }

        if(cnt>1 || (cnt==1 && size%2==0)) {
            System.out.print("I'm Sorry Hansoo");
            return;
        }

        StringBuilder sb = new StringBuilder();

        for(int i=0;i<26;i++)
            for(int j=0;j<alp[i]/2;j++)
                sb.append((char)(i+'A'));


        StringBuffer tmp = new StringBuffer(sb.toString());

        if(cnt==1) {
            sb.append((char)(center+'A'));
        }
        System.out.println(sb.toString()+tmp.reverse());
    }
}
