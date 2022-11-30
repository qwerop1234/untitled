import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

public class b1446 {
    static int N;
    static int D;
    static ArrayList<Node> list = new ArrayList<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        D = Integer.parseInt(st.nextToken());

        for(int i = 0; i<N; i++){
            st = new StringTokenizer(br.readLine());
            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());
            int distance = Integer.parseInt(st.nextToken());
            if(end>D){
                continue;
            }else if(end-start<distance){
                continue;
            }else{
                list.add(new Node(start,end,distance));
            }
        }

        Collections.sort(list);

        int point = 0;
        int moving = 0;
        int[] dis = new int[10001];
        Arrays.fill(dis,10001);
        dis[0] = 0;

        while(moving<D){
            if(point< list.size()){
                Node n = list.get(point);
                if(moving==n.start){
                    dis[n.end] = Math.min(dis[moving]+n.distance,dis[n.end]);
                    point++;
                }else{
                    dis[moving+1] = Math.min(dis[moving+1],dis[moving]+1);
                    moving++;
                }
            }else{
                dis[moving+1] = Math.min(dis[moving+1],dis[moving]+1);
                moving++;
            }
        }
        System.out.println(dis[D]);




    }


    private static class Node implements Comparable<Node>{
        int start;
        int end;
        int distance;
        Node(int start, int end, int distance){
            this.start = start;
            this.end = end;
            this.distance = distance;
        }

        @Override
        public int compareTo(Node o) {
            if(start==o.start){
                return end-o.end;
            }
            return start-o.start;
        }
    }
}
