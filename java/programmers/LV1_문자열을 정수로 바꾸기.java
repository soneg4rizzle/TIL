package programmers;

public class LV1_���ڿ��������ιٲٱ� {
	public int solution(String s) {
        int answer = 0;

        if ( s.length() == 1 )
            answer = Integer.parseInt(s);
        else { // parseInt �Լ��� �̿��ϸ� "-1234" ���� -1234�� �ٷ� �ٲ��� �� �ִ�. �Ʒ� �ڵ�� ���� �߸� �����ϰ� �־��� �κ���.
            if ( s.charAt(0) == '+' ) answer = Integer.parseInt(s.substring(1, s.length()));
            else if ( s.charAt(0) == '-' ) answer = -1 * Integer.parseInt(s.substring(1, s.length()));
            else answer = Integer.parseInt(s.substring(0, s.length()));
        }
        return answer;
    }
}
