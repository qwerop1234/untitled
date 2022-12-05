import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class solution12941 {
    public int solution(int []A, int []B){
        ArrayList<Integer> listA = new ArrayList<>();
        ArrayList<Integer> listB = new ArrayList<>();

        int answer = 0;

        for(int i = 0; i<A.length; i++){
            listA.add(A[i]);
            listB.add(B[i]);
        }
        Collections.sort(listA);
        Collections.sort(listB);
        listB.sort(Comparator.reverseOrder());

        for(int i = 0; i<listA.size();i++){
            answer = answer + listA.get(i)*listB.get(i);
        }


        return answer;
    }
}
