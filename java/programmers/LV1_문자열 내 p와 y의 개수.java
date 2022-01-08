package programmers;

public class LV1_문자열내P와Y의개수 {
	 boolean solution(String s) {
	        boolean answer = true;
	        String str = s.toLowerCase();
	        int y_num = 0;
	        int p_num = 0;
	        
	        for ( int i = 0; i < str.length(); i++ ) {
	            char c = str.charAt(i);
	            if ( c == 'p' )
	                p_num++;
	            else if ( c == 'y' )
	                y_num++;
	        }
	        
	        if ( p_num == y_num)
	            answer = true;
	        else
	            answer = false;
	        return answer;
	    }
}
