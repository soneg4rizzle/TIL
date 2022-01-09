package programmers;

public class LV1_자연수뒤집어배열로만들기 {
	public int[] solution(long n) {
        int[] answer = {};
        String s = Long.toString(n);
        answer = new int[s.length()];
        int k = 0;
        
        for ( int i = s.length()-1; i >= 0; i-- ) {
            answer[k++] = s.charAt(i) - '0';
        }
        
        return answer;
    }
}
