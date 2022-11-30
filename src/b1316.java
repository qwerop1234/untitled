import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class b1316 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (isGroupString(br.readLine()))
                count++;
        }
        System.out.println(count);
    }

    // 그룹 단어인지 체크하는 메서드
    static boolean isGroupString(String str) {
        boolean alpha[] = new boolean[26];
        for (int i = 0; i < str.length(); i++) {
            int now = str.charAt(i);
            int prev = (i > 0) ? str.charAt(i - 1) : 0;
            if (alpha[now - 'a'] == false)
                alpha[now - 'a'] = true;
            else if (now != prev)
                return false;
        }
        return true;
    }

}
