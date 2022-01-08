package programmers;

public class LV1_두정수사이의합 {
	public long solution(int a, int b) {
        long answer = 0;
        
        if ( a <= b ) {
            for ( int i = a; a < b+1; a++ ) {
                answer += a;
            }
        } else {
            for ( int i = b; b < a+1; b++ ) {
                answer += b;
            }
        }
        return answer;
    }
}
