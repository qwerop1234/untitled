import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class b1181 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Node> list = new ArrayList<>();
        StringBuffer sb = new StringBuffer();

        int a = Integer.parseInt(br.readLine());

        for(int i = 0; i<a; i++){
            String s = br.readLine();
            Node n = new Node(s);
            list.add(n);
        }

        Collections.sort(list);

        for(int i = 0; i< list.size(); i++){
            if(i!=list.size()-1){
                if(list.get(i).s.equals(list.get(i+1).s)){
                    continue;
                }else{
                    sb.append(list.get(i).s).append("\n");
                }
            }else{
                sb.append(list.get(i).s);
            }

        }
        System.out.println(sb);
    }

    static class Node implements Comparable<Node>{
        String s;
        Node(String s){
            this.s = s;
        }

        @Override
        public int compareTo(Node o) {
            if(s.length()==o.s.length()){
                for(int i = 0; i<s.length(); i++){
                    if(s.charAt(i)-o.s.charAt(i)!=0){
                        return s.charAt(i)-o.s.charAt(i);
                    }
                }
            }
            return s.length()-o.s.length();
        }
    }
}
