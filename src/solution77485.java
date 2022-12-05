import java.util.Arrays;

public class solution77485 {
    public static int[] solution(int rows, int columns, int[][] queries) {
        int[] answer = new int[queries.length];
        int [][] map = new int[rows][columns];

        for(int i = 0; i<rows; i++){
            for(int j = 0; j<columns; j++){
                map[i][j] = i*columns-1+j+2;
            }
        }

        for(int i = 0; i< queries.length; i++){
            int y1 = queries[i][0]-1;
            int x1 = queries[i][1]-1;
            int y2 = queries[i][2]-1;
            int x2 = queries[i][3]-1;
            int[] arr1 = new int[Math.abs(x1-x2)];
            int[] arr2 = new int[Math.abs(y1-y2)];
            int[] arr3 = new int[Math.abs(x2-x1)];
            int[] arr4 = new int[Math.abs(y2-y1)];
            for(int j = 0; j<Math.abs(x1-x2); j++){
                arr1[j] = map[y1][j+x1];
            }
            for(int j = 0; j<Math.abs(y1-y2); j++){
                arr2[j] = map[j+y1][x2];
            }
            for(int j = 0; j<Math.abs(x2-x1); j++){
                arr3[j] = map[y2][x2-j];
            }
            for(int j =0; j<Math.abs(y2-y1); j++){
                arr4[j] = map[y2-j][x1];
            }



            for(int j = 0; j<arr1.length; j++){
                map[y1][x1+j+1] = arr1[j];
            }

            for(int j = 0; j<arr2.length; j++){
                map[y1+j+1][x2] = arr2[j];
            }

            for(int j = 0; j<arr3.length; j++){
                map[y2][x2-j-1] = arr3[j];
            }

            for(int j = 0; j<arr4.length; j++){
                map[y2-j-1][x1] = arr4[j];
            }


            Arrays.sort(arr1);
            Arrays.sort(arr2);
            Arrays.sort(arr3);
            Arrays.sort(arr4);

            answer[i] = Math.min(arr4[0],Math.min(arr3[0],Math.min(arr1[0],arr2[0])));



        }


        return answer;
    }
}
