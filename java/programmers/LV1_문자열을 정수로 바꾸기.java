package programmers;

public class LV1_문자열을정수로바꾸기 {
	public int solution(String s) {
        int answer = 0;

        if ( s.length() == 1 )
            answer = Integer.parseInt(s);
        else { // parseInt 함수를 이용하면 "-1234" 또한 -1234로 바로 바꿔줄 수 있다. 아래 코드는 내가 잘못 이해하고 있었던 부분임.
            if ( s.charAt(0) == '+' ) answer = Integer.parseInt(s.substring(1, s.length()));
            else if ( s.charAt(0) == '-' ) answer = -1 * Integer.parseInt(s.substring(1, s.length()));
            else answer = Integer.parseInt(s.substring(0, s.length()));
        }
        return answer;
    }
}
