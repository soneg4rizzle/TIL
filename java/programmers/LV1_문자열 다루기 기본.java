package programmers;

public class LV1_���ڿ��ٷ��⺻ {
	public boolean solution(String s) {
        // ���ڿ��� ���̰� 4 Ȥ�� 6, ���ڷθ� ������������ true, �׷��� ������ false�� �����ϴ� �Լ�
        boolean answer = false;
        int l = s.length();
        
        if ( l == 4 || l == 6 ) { // ���ڿ� s�� ���̰� 4 Ȥ�� 6�� ��,
            for ( int i = 0; i < s.length(); i++ ) {
                char word = s.charAt(i);
                if ( word >= 48 && word <= 57 ) {
                    continue;
                } else {
                    return false;
                }
            }
            return true;
        }
        
        return answer;
    }
}
