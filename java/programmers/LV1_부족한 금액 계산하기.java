package programmers;

public class LV1_�����ѱݾװ���ϱ� {
    public long solution(int price, int money, int count) {
        // price : ���̱ⱸ �̿��
        // ���̱ⱸ N�� Ÿ�� ���� �̿���� N���� �̿�� �޴´�.
        // money : ���� ���� ���� ��
        // ���̱ⱸ�� count�� ���� �� ������ �ݾ��� �����ض�.;
        long sum = 0;
        
        for ( int i = 1; i < count+1; i++ )
            sum += (long)price*i;
        
        return (sum-money > 0 ) ? sum-money : 0;
    }
}
