package programmers;

public class LV1_�ڵ�����ȣ������ {
	 public String solution(String phone_number) {
	        String answer = "";
	        int length = phone_number.length();
	        String star = "";
	        
	        for ( int i = 0; i < length-4; i++ )
	            star += "*";
	        
	        return star + phone_number.substring(length-4);
	    }
}
