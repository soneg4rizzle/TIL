package programmers;
import java.util.*;

public class LV1_정수내림차순으로배치하기 {
	public long solution(long n) {
        long answer = 0;
        String[] str = Long.toString(n).split("");
        String temp = "";
        Arrays.sort(str, Collections.reverseOrder());
        
        for ( int i = 0; i < str.length; i++ ) {
            temp += str[i];
        } answer = Long.parseLong(temp);
        
        return answer;
    }
}
