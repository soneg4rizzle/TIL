package programmers;

public class LV1_자릿수더하기 {
	 public int solution(int n) {
	        int answer = 0;
	        String s = Integer.toString(n);
	        
	        for ( int i = 0; i < s.length(); i++ ) {
	            int k = s.charAt(i) - '0';
	            answer += k;
	        }

	        return answer;
	    }
}
