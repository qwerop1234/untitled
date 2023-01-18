public class lesson71155 {
    public static int solution(int[][] garden) {
        // 여기에 코드를 작성해주세요.
        int answer = 0;

        boolean[][] visit = new boolean[garden.length][garden[0].length];


        int zero = 1;
        int one = 0;

        for(int i = 0; i< garden.length; i++){
            for(int j = 0; j<garden[i].length; j++){
                if(garden[i][j]==0){
                    zero++;
                }else{
                    one++;
                }
            }
        }

        if(one==garden.length*garden[0].length){
            return 0;
        }

        while(zero-->0){
            for(int i = 0; i< garden.length; i++){
                for(int j = 0; j<garden[i].length; j++){
                    if(garden[i][j]==1&&!visit[i][j]){
                        visit[i][j] = true;
                        if(i+1< garden.length&&garden[i+1][j]==0&&!visit[i+1][j]){
                            visit[i+1][j]=true;
                            garden[i+1][j]=1;
                            zero--;
                        }
                        if(i-1>=0&&garden[i-1][j]==0&&!visit[i-1][j]){
                            visit[i-1][j]=true;
                            garden[i-1][j]=1;
                            zero--;
                        }
                        if(j+1< garden.length&&garden[i][j+1]==0&&!visit[i][j+1]){
                            visit[i][j+1]=true;
                            garden[i][j+1]=1;
                            zero--;
                        }
                        if(j-1>=0&&garden[i][j-1]==0&&!visit[i][j-1]){
                            visit[i][j-1]=true;
                            garden[i][j-1]=1;
                            zero--;
                        }
                    }
                }
            }

            visit = new boolean[garden.length][garden[0].length];
            answer++;

        }


        return answer;
    }

    // 아래는 테스트케이스 출력을 해보기 위한 main 메소드입니다.
    public static void main(String[] args) {

        int[][] garden1 = {{0, 0, 1}, {0, 0, 0}, {0, 0, 0}};

        System.out.println(solution(garden1));

        int[][] garden2 = {{1, 1}, {1, 1}};

        System.out.println(solution(garden2));

    }
}
