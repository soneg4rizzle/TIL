package programmers;
import java.util.Arrays;

public class LV1_���ڿ������������ι�ġ�ϱ� {
	// ���ڿ� s�� ��Ÿ���� ���ڸ� ������������ ������ �����ϴ� �Լ�
    public String solution(String s) {
        String answer = "";
        char c[] = new char[s.length()];
        
        for ( int i = 0; i < s.length(); i++ ) {
            c[i] = s.charAt(i);
        }
        
        Arrays.sort(c);
        
        for ( int i = c.length-1; i > -1; i-- ) {
            answer += c[i];
        }
        return answer; 
    }
}
