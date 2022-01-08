package programmers;

public class LV1_소수찾기 {
	public int solution(int n) {
        int answer = 0;

        for ( int i = 2; i < n+1; i++ ) {
            if ( isPrime(i) )
                answer++;
        }
        return answer;
    }

    public boolean isPrime(int num) { // 소수인지 확인하는 메소드
        /*if ( num < 2 ) // 2보다 작으면 소수가 아니므로 false
            return false;*/
        for ( int i = 2; i*i <= num; i++ ) { // 해당 숫자의 제곱근까지 확인
            if ( num%i == 0 )
                return false;
        } return true;
    }
}
