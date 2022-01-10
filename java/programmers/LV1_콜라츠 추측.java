package programmers;

public class LV1_Äİ¶óÃ÷ÃßÃø {
	public int solution(int num) {
        int answer = 0;
        long n = num;
        
        while ( n != 1 ) {
            if ( answer > 500 ) {
                return -1;
            } else if ( n%2 == 0 ) { // nÀÌ Â¦¼ö
                n /= 2;
                answer++;
            } else if ( n%2 == 1 ) {// nÀÌ È¦¼ö
                n = n*3 + 1;
                answer++;
            }
        }
            
        return answer;
    }
}
