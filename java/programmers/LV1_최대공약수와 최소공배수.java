package programmers;

public class LV1_최대공약수와최소공배수 {
	public int[] solution(int n, int m) {
        int[] answer = new int[2];
        int gcf = 1;
        int min = ( n<m ) ? n : m;
        
        for ( int i = 1; i < min+1; i++ ) {
            if ( n%i == 0 && m%i == 0 ) {
                answer[1] = i * (n/i) * (m/i);
                gcf = i;
            }
        } answer[0] = gcf;
            
        return answer;
    }
}
