import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class b2644 {
    static int cnt = -1;
    static int n;
    static int a;
    static int b;
    static int m;
    static ArrayList<Integer>[] list;
    static boolean visit[];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(br.readLine());

        visit = new boolean[n + 1];
        list = new ArrayList[n+1];

        for (int i = 0; i < n; i++) {
            list[i + 1] = new ArrayList<Integer>();
        }

        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());
            list[start].add(end);
            list[end].add(start);
        }
        dfs(a, b, 0);

        System.out.println(cnt);

    }

    private static void dfs(int a, int b, int count) {
        if(a==b){
            cnt=count;
            return;
        }



        visit[a] = true;
        for(int next : list[a]){
            if(visit[next]){
                continue;
            }
            dfs(next,b,count+1);
        }

    }
}
