import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

public class solution68644 {
    public int[] solution(int[] numbers) {

        HashSet<Integer> list = new HashSet<>();


        for(int i = 0; i<numbers.length;i++){
            if(i == numbers.length){
                break;
            }
            for(int j = i+1; j<numbers.length; j++){
                list.add(numbers[i]+numbers[j]);
            }
        }
        int[] answer = new int[list.size()];


        Iterator iter = list.iterator();
        int i = 0;
        while(iter.hasNext()){
            answer[i++] = (int)iter.next();
        }
        Arrays.sort(answer);

        return answer;
    }
}
