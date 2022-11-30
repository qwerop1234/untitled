import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

public class b11650 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();
        ArrayList<node> list = new ArrayList<>();

        int a = Integer.parseInt(br.readLine());




        for(int i = 0; i<a; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());
            node s = new node(b,c);
            list.add(s);
        }
        Collections.sort(list);

        for(int i = 0; i<list.size(); i++){
            sb.append(list.get(i).a).append(" ").append(list.get(i).b).append("\n");
        }

        System.out.println(sb);
    }

    static class node implements Comparable<node>{
        int a;
        int b;

        node(int a, int b){
            this.a=a;
            this.b=b;
        }

        @Override
        public int compareTo(node o) {
            if(this.a>o.a){
                return 1;
            }else if(this.a==o.a){
                if(this.b>o.b){
                    return 1;
                }else{
                    return -1;
                }
            }else{
                return -1;
            }
        }

    }
}
