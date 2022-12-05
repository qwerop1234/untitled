import java.util.ArrayList;

public class solution12935 {
    public int[] solution(int[] arr) {

        ArrayList<Integer> list = new ArrayList<>();

        if(arr.length-1==0){

            int[] answer = new int [1];
            answer[0] = -1;
            return answer;
        }else {
            int[] answer = new int[arr.length-1];
            int a = 0;
            for (int i = 0; i < arr.length; i++) {
                for (int j = 1; j < arr.length; j++) {
                    if (arr[i] > arr[j]) {
                        a = arr[j];
                    }
                }
                list.add(arr[i]);
            }


            for (int i = 0; i < list.size(); i++) {
                if(list.get(i)==a){
                    list.remove(i);
                }
            }
            for(int i = 0; i< list.size(); i++){
                answer[i] = list.get(i);
            }

            return answer;
        }


    }
}
