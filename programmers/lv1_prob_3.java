package programmers;

public class lv1_prob_3 {
	 public int solution(String s) {
	        // ����� �� �κп� �ش�Ǵ� ���ڷ� ��ȯ�ؼ� ���
	        // one23four5 -> 12345 �� ��ȯ�ϸ� ����
	        
	        String s_array[] = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten"};
	        
	        for ( int i = 0; i < s_array.length; i++ ) {
	            s = s.replace(s_array[i], String.valueOf(i));
	        }
	        return Integer.parseInt(s);
	    }
}
