package programmers;

public class LV1_ÇÏ»þµå¼ö {
	 public boolean solution(int x) {
	        boolean answer = false;
	        String s = Integer.toString(x);
	        int compN = 0;
	        
	        for ( int i = 0; i < s.length(); i++ )
	            compN += s.charAt(i) - '0';
	        return ( x%compN == 0 );
	    }
}
