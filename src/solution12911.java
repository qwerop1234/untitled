public class solution12911 {
    public int solution(int n) {
        int answer = 0;

        String n2 = Integer.toBinaryString(n);


        if(n2.contains("0")){
        }else{
            return (int) Math.pow(2,n2.length()-1) + n;
        }

        int a = 0;
        int b = 0;

        for(int i = 0; i<n2.length();i++){
            if(n2.charAt(i)=='1'){
                a += 1;
            }
        }

        while(true){
            b = 0;
            String n3 = Integer.toBinaryString(++n);
            for(int i = 0; i<n3.length();i++){
                if(n3.charAt(i)=='1'){
                    b += 1;
                }
            }
            if(a==b){
                return n;
            }
        }
    }
}
