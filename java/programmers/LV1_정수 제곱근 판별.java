package programmers;

public class LV1_�����������Ǻ� {
	public long solution(long n) {
        // Math.pow && Math.sqrt �� �̿��� ���
        long answer = -1;
        
        if ( Math.pow((int)Math.sqrt(n) , 2) == n )
            return (long)Math.pow(Math.sqrt(n)+1, 2);
        
        return answer;
    }
}
