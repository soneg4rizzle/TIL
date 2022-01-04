package programmers;
import java.util.Stack;

public class lv1_3진법_뒤집기 {
	public int solution(int n) {
        int answer = 0;
        int num = 1;
        int digit = 1;
        Stack<Integer> stack = new Stack<Integer>();
        // 1. n을 3의 제곱수로 계속 나눠가며 3진법으로 바꿨을 때 나오는 자리수와 (_)___ 가장 앞자리의 값(3^x)을 구한다.
        while ( n/(3*num) != 0) {// 0이 아니면 n>num 이므로 반복이 진행될 때마다 num*3을 해주며 자리수를 구한다.
            num *= 3;
            digit++;
        }
        int m = n;
        int temp = num;
        
        for ( int i = 0; i < digit; i++ ) { // m/(2*num) > 0 이면 2를 스택에 push
            if ( m/(2*num) > 0 ) {
                stack.push(2);
                m %= 2*num;
                num /= 3;
            } else if ( m/num > 0 ) { // m/num > 0 이면 1을 스택에 push
                stack.push(1);
                m %= num;
                num /= 3;
            } else { // 위 두 조건에 해당하지 않으면 나눠지는수 < 나누는수 이므로 스택에 0을 push
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
