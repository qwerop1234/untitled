import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class b2512 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        int[] arrays = new int[a];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0; i<a; i++){
            arrays[i] = Integer.parseInt(st.nextToken());
        }
        int b = Integer.parseInt(br.readLine());

        int answer = cal(a,arrays,b);
        System.out.println(answer);
    }

    private static int cal(int a, int[] arrays, int b) {
        int answer = 0;
        Arrays.sort(arrays);
        for(int x : arrays){
            answer += x;
        }
        if(answer<=b){
            return arrays[a-1];
        }else{

            int start = 0;
            int end = arrays[arrays.length-1];

            while(start<end){
                int mid = (start+end)/2;
                int temp = 0;
                for(int x : arrays){
                    if(x>mid){
                        temp += mid;
                    }else{
                        temp += x;
                    }
                }
                if(temp>b){
                    end = mid;
                }else {
                    start = mid+1;
                }
            }
            return start-1;
        }


    }
}
