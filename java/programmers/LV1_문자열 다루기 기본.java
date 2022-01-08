package programmers;

public class LV1_문자열다루기기본 {
	public boolean solution(String s) {
        // 문자열의 길이가 4 혹은 6, 숫자로만 구성돼있으면 true, 그렇지 않으면 false를 리턴하는 함수
        boolean answer = false;
        int l = s.length();
        
        if ( l == 4 || l == 6 ) { // 문자열 s의 길이가 4 혹은 6일 때,
            for ( int i = 0; i < s.length(); i++ ) {
                char word = s.charAt(i);
                if ( word >= 48 && word <= 57 ) {
                    continue;
                } else {
                    return false;
                }
            }
            return true;
        }
        
        return answer;
    }
}
