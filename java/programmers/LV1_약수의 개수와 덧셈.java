package programmers;

public class lv_1_�����_������_���� {
    public int solution(int left, int right) {
        int answer = 0;
        int num = 0; // ����� ����
        for ( int i = left; i < right+1; i++ ) { // 12 < n < 18 
            for ( int j = 1; j < i+1; j++ ) { // 1 ~ i ���� �۵�
                if ( i%j == 0 )   // j�� i�� ����̸� num++
                    num++;
            }
            if ( num%2 == 0 ) { // ����� ������ ¦���̸� answer += i;
                answer += i;    // ����� ������ Ȧ���̸� answer -= i;
            } else {
                answer -= i;
            }
            num = 0;
        }
        return answer;
    }
}
