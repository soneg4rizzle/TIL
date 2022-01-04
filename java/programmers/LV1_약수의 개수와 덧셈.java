package programmers;

public class lv_1_약수의_개수와_덧셈 {
    public int solution(int left, int right) {
        int answer = 0;
        int num = 0; // 약수의 개수
        for ( int i = left; i < right+1; i++ ) { // 12 < n < 18 
            for ( int j = 1; j < i+1; j++ ) { // 1 ~ i 까지 작동
                if ( i%j == 0 )   // j가 i의 약수이면 num++
                    num++;
            }
            if ( num%2 == 0 ) { // 약수의 개수가 짝수이면 answer += i;
                answer += i;    // 약수의 개수가 홀수이면 answer -= i;
            } else {
                answer -= i;
            }
            num = 0;
        }
        return answer;
    }
}
