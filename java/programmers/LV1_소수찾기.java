package programmers;

public class LV1_�Ҽ�ã�� {
	public int solution(int n) {
        int answer = 0;

        for ( int i = 2; i < n+1; i++ ) {
            if ( isPrime(i) )
                answer++;
        }
        return answer;
    }

    public boolean isPrime(int num) { // �Ҽ����� Ȯ���ϴ� �޼ҵ�
        /*if ( num < 2 ) // 2���� ������ �Ҽ��� �ƴϹǷ� false
            return false;*/
        for ( int i = 2; i*i <= num; i++ ) { // �ش� ������ �����ٱ��� Ȯ��
            if ( num%i == 0 )
                return false;
        } return true;
    }
}
