package programmers;

public class lv1_음양_더하기 {
	 public int solution(int[] absolutes, boolean[] signs) {
	        int answer = 0;
	        // [4,7,12]	[true,false,true]
	        
	        for ( int i = 0; i < signs.length; i++ ) {
	            if ( signs[i] ) {
	                answer += absolutes[i];
	            } else {
	                answer -= absolutes[i];
	            }
	        }
	        return answer;
	    }
}
