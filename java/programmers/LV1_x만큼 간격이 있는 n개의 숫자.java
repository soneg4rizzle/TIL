package programmers;

public class LV1_x��ŭ�������ִ�n���Ǽ��� {
	public long[] solution(int x, int n) {
        long[] answer = new long[n];
        long num = x;
        
        for ( int i = 0; i < n; i++ ) {
            answer[i] = num;
            num += x;
        }
        return answer;
    }
}
