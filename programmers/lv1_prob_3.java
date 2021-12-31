package programmers;

public class lv1_prob_3 {
	 public int solution(String s) {
	        // 영어로 된 부분에 해당되는 숫자로 변환해서 출력
	        // one23four5 -> 12345 로 변환하면 성공
	        
	        String s_array[] = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten"};
	        
	        for ( int i = 0; i < s_array.length; i++ ) {
	            s = s.replace(s_array[i], String.valueOf(i));
	        }
	        return Integer.parseInt(s);
	    }
}
