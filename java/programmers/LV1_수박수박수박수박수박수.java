package programmers;

public class LV1_수박수박수박수박수박수 {
	 public String solution(int n) {
	        String answer = "";
	        
	        if ( n == 0 ) {
	            return answer;
	        } else if ( n == 1 ) {
	            return "수";
	        } else if ( n%2 == 0 ) { // 짝수일때,
	            for ( int i = 0; i < (n/2); i++ )
	                answer += "수박";
	        } else { 
	            for ( int i = 0; i < (n/2); i++ ) {
	                answer += "수박";
	            } answer += "수";
	        }
	        return answer;
	    }
}
