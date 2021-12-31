package programmers;

public class lv1_prob_2 {
	public String solution(String new_id) {
        String answer = "";
        
        // new_id�� ��� �빮�ڸ� �����Ǵ� �ҹ��ڷ� ġȯ
        new_id = new_id.toLowerCase();
        
        // new_id���� ���ĺ� �ҹ���, ����, ����(-), ����(_), ��ħǥ(.)�� ������ ��� ���ڸ� ����
        for ( int i = 0; i < new_id.length(); i++ ) {
            char ch = new_id.charAt(i);
            if ( ch >= 'a' && ch <= 'z' ) {
                answer += ch;
            } else if ( ch >= '0' && ch <= '9' ) {
                answer += ch;
            } else if ( ch == '-' || ch == '_' || ch == '.' ) {
                answer += ch;
            }
        }
        
        // new_id���� ��ħǥ(.)�� 2�� �̻� ���ӵ� �κ��� �ϳ��� ��ħǥ(.)�� ġȯ
        String compare_answer = "";
        do {
            compare_answer = answer;
            answer = answer.replace("..", ".");
        } while ( answer != compare_answer );
        
        // new_id���� ��ħǥ(.)�� ó���̳� ���� ��ġ�Ѵٸ� �����մϴ�.
        if ( answer.startsWith(".") ) {
            answer = answer.substring(1, answer.length());
        } else if ( answer.endsWith(".") ) {
            answer = answer.substring(0, answer.length()-1);
        }
        
        //new_id�� �� ���ڿ��̶��, new_id�� "a"�� �����մϴ�.
        if ( answer.isEmpty() ) {
            answer += "a";
        }
        
        // new_id�� ���̰� 16�� �̻��̸�, new_id�� ù 15���� ���ڸ� ������ ������ ���ڵ��� ��� ����
        // ���� ���� �� ��ħǥ(.)�� new_id�� ���� ��ġ�Ѵٸ� ���� ��ġ�� ��ħǥ(.) ���ڸ� ����
        if ( answer.length() > 15 ) {
            answer = answer.substring(0, 15);
        }
        if ( answer.endsWith(".") ) {
            answer = answer.substring(0, answer.length()-1);
        }
        
        // new_id�� ���̰� 2�� ���϶��, new_id�� ������ ���ڸ� new_id�� ���̰� 3�� �� ������ �ݺ��ؼ� ���� ���Դϴ�.
        if ( answer.length() <= 2 ) { // length == 1 or 2
            for ( int i = answer.length(); i < 3; i++ ) {
                answer += answer.charAt(i-1);
            }
        }
        
        return answer;
    }
}
