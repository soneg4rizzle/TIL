package programmers;

public class LV1_���ڼ��ڼ��ڼ��ڼ��ڼ� {
	 public String solution(int n) {
	        String answer = "";
	        
	        if ( n == 0 ) {
	            return answer;
	        } else if ( n == 1 ) {
	            return "��";
	        } else if ( n%2 == 0 ) { // ¦���϶�,
	            for ( int i = 0; i < (n/2); i++ )
	                answer += "����";
	        } else { 
	            for ( int i = 0; i < (n/2); i++ ) {
	                answer += "����";
	            } answer += "��";
	        }
	        return answer;
	    }
}
