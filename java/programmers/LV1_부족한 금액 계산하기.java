package programmers;

public class LV1_부족한금액계산하기 {
    public long solution(int price, int money, int count) {
        // price : 놀이기구 이용료
        // 놀이기구 N번 타면 원래 이용료의 N배의 이용료 받는다.
        // money : 현재 내가 가진 돈
        // 놀이기구를 count번 탔을 때 부족한 금액을 리턴해라.;
        long sum = 0;
        
        for ( int i = 1; i < count+1; i++ )
            sum += (long)price*i;
        
        return (sum-money > 0 ) ? sum-money : 0;
    }
}
