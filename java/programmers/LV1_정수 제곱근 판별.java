package programmers;

public class LV1_정수제곱근판별 {
	public long solution(long n) {
        // Math.pow && Math.sqrt 를 이용한 방법
        long answer = -1;
        
        if ( Math.pow((int)Math.sqrt(n) , 2) == n )
            return (long)Math.pow(Math.sqrt(n)+1, 2);
        
        return answer;
    }
}
