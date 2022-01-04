package programmers;
import java.util.Stack;

public class lv1_3����_������ {
	public int solution(int n) {
        int answer = 0;
        int num = 1;
        int digit = 1;
        Stack<Integer> stack = new Stack<Integer>();
        // 1. n�� 3�� �������� ��� �������� 3�������� �ٲ��� �� ������ �ڸ����� (_)___ ���� ���ڸ��� ��(3^x)�� ���Ѵ�.
        while ( n/(3*num) != 0) {// 0�� �ƴϸ� n>num �̹Ƿ� �ݺ��� ����� ������ num*3�� ���ָ� �ڸ����� ���Ѵ�.
            num *= 3;
            digit++;
        }
        int m = n;
        int temp = num;
        
        for ( int i = 0; i < digit; i++ ) { // m/(2*num) > 0 �̸� 2�� ���ÿ� push
            if ( m/(2*num) > 0 ) {
                stack.push(2);
                m %= 2*num;
                num /= 3;
            } else if ( m/num > 0 ) { // m/num > 0 �̸� 1�� ���ÿ� push
                stack.push(1);
                m %= num;
                num /= 3;
            } else { // �� �� ���ǿ� �ش����� ������ �������¼� < �����¼� �̹Ƿ� ���ÿ� 0�� push
                stack.push(0);
                m %= num;
                num /= 3;
            }
        }
        
        for ( int i = 0; i < digit; i++ ) {
            answer += temp * stack.pop();
            temp /= 3;
        }
        return answer;
    }
}
