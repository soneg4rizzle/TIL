package programmers;
import java.util.Stack;

public class LV1_��Ʈ����2 {
    public int solution(String dartResult) {
        int answer = 0;
        Stack<Integer> stack = new Stack<Integer>();
        for ( int i = 0; i < dartResult.length(); i++ ) {
            char c = dartResult.charAt(i);
            if ( Character.isDigit(c) ) { // �̾Ƴ� ���ڰ� ������ ���
                int word = c - '0';
                if ( word == 1  && i+1 < dartResult.length() && dartResult.charAt(i+1) == '0' ) {
                    stack.push(10);
                    i++; // i+1�� �ܾ �̾ƿ����Ƿ� i�� ���� �����ش�.
                } else { 
                    stack.push(word);
                }
            } else { // �̾Ƴ� ���ڰ� ���ڰ� �ƴ� ���
                int num = stack.pop();
                if ( c == 'S' ) {
                    stack.push(num);
                } else if ( c == 'D' ) {
                    stack.push(num*num);
                } else if ( c == 'T' ) {
                    stack.push(num*num*num);
                } else if ( c == '*' ) {
                    if ( !stack.isEmpty() ) {
                        int prev = stack.pop();
                        stack.push(prev*2);
                        stack.push(num*2);
                    } else {
                        stack.push(num*2);
                    }
                } else if ( c == '#' ) {
                    stack.push(num*-1);
                }
            }
        }
        
        while ( !stack.isEmpty() ) {
            System.out.println(stack.peek());
            answer += stack.pop();
        }
            return answer;
    }
}
