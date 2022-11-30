import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class b11651 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();
        ArrayList<Node> list = new ArrayList<>();

        int a = Integer.parseInt(br.readLine());

        for(int i = 0; i<a; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());

            Node n = new Node(b,c);
            list.add(n);
        }
        Collections.sort(list,Collections.reverseOrder());
        for(int i = 0; i<list.size(); i++){
            sb.append(list.get(i).b).append(" ").append(list.get(i).c).append("\n");
        }
        System.out.println(sb);


    }
    static class Node implements Comparable<Node>{
        int b;
        int c;
        Node(int b, int c){
            this.b=b;
            this.c=c;
        }

        @Override
        public int compareTo(Node o) {
            if(c==o.c){
                return o.b-b;
            }
            return o.c-c;
        }
    }
}
