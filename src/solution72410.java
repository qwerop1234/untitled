public class solution72410 {
    public static String solution(String new_id) {
        String answer = "";
        new_id = new_id.toLowerCase();
        new_id = new_id.replaceAll("[^a-z0-9-_.]", "");
        new_id = new_id.replaceAll("[.]{2,}",".");
        if(new_id.charAt(0)=='.'){
            new_id = new_id.substring(1);
        }
        if(new_id.length()!=0){
            if(new_id.charAt(new_id.length()-1)=='.'){
                new_id = new_id.substring(0,new_id.length()-1);
            }
        }

        if(new_id.isEmpty()){
            new_id="a";
        }
        if(new_id.length()>=16){
            new_id = new_id.substring(0,15);
            if(new_id.charAt(new_id.length()-1)=='.'){
                new_id = new_id.substring(0,new_id.length()-1);
            }
        }
        if(new_id.length()<=2){
            for(int i = 0; i<new_id.length();i++)
                if(new_id.length()==3){
                    break;
                }else{
                    new_id = new_id + new_id.charAt(new_id.length()-1);
                }
        }


        return new_id;
    }
}
