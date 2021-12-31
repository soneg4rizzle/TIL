package programmers;

public class lv1_prob_6 {
	public int solution(int[] numbers) {
        int answer = 0;
        
        answer = calculator();
        
        for ( int i = 0; i < numbers.length; i++ ) {
            answer -= numbers[i];
        }
        return answer;
    }
    
    public int calculator() {
        int n = 0;
        
        for ( int i = 0; i < 10; i++ ) {
            n += i;
        }
        
        return n;
    }
}
