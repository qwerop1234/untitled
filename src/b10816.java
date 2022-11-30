import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class b10816 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();

        int a = Integer.parseInt(br.readLine());
        int[] card = new int[a];
        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 0; i < a; i++) {
            card[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(card);

        int b = Integer.parseInt(br.readLine());
        int[] list1 = new int[b];
        StringTokenizer st1 = new StringTokenizer(br.readLine());

        for (int i = 0; i < b; i++) {
            list1[i] = Integer.parseInt(st1.nextToken());
        }


        for (int i = 0; i < list1.length; i++) {
            sb.append(lower(card,list1[i])-upper(card,list1[i])).append(" ");
        }


        System.out.println(sb);


    }


    private static int upper(int[] card, int i) {

        int start = 0;
        int end = card.length;

        while (start < end) {
            int mid = (start + end) / 2;

            if (i <= card[mid]) {
                end = mid;
            } else {
                start = mid + 1;
            }
        }

        return start;
    }

    private static int lower(int[] card, int i) {

        int start = 0;
        int end = card.length;

        while (start < end) {
            int mid = (start + end) / 2;

            if (i < card[mid]) {
                end = mid;
            } else {
                start = mid + 1;
            }

        }


        return start;
    }
}
