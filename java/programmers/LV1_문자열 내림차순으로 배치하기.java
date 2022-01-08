package programmers;
import java.util.Arrays;

public class LV1_문자열내림차순으로배치하기 {
	// 문자열 s에 나타나는 문자를 내림차순으로 정렬해 리턴하는 함수
    public String solution(String s) {
        String answer = "";
        char c[] = new char[s.length()];
        
        for ( int i = 0; i < s.length(); i++ ) {
            c[i] = s.charAt(i);
        }
        
        Arrays.sort(c);
        
        for ( int i = c.length-1; i > -1; i-- ) {
            answer += c[i];
        }
        return answer; 
    }
}
