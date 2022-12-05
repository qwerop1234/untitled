import java.util.Arrays;

public class solution12919 {
    public String solution(String[] seoul){
        int x = Arrays.asList(seoul).indexOf("Kim");

        return "김서방은 "+ x + "에 있다";
    }
}
