package programmers;

public class LV1_��ձ��ϱ� {
	public double solution(int[] arr) {
        double answer = 0;
        
        for ( int i = 0; i < arr.length; i++ )
            answer += arr[i];
        answer /= arr.length;
        return answer;
    }
}
