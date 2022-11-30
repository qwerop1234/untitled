import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class b10814 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        ArrayList<Node> list = new ArrayList<>();

        int a = Integer.parseInt(br.readLine());

        for(int i = 0; i<a; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int b = Integer.parseInt(st.nextToken());
            String s = st.nextToken();
            Node n = new Node(b,s);
            list.add(n);
        }
        Collections.sort(list);

        for(int i = 0; i<list.size(); i++){
            sb.append(list.get(i).b).append(" ").append(list.get(i).s).append("\n");
        }
        System.out.println(sb);
    }

    static class Node implements Comparable<Node>{
        int b;
        String s;
        Node(int b, String s){
            this.b = b;
            this.s = s;
        }

        @Override
        public int compareTo(Node o) {
            if(b==o.b){
                return 0;
            }

            return b-o.b;
        }
    }
}
