package programmers;

public class LV1_�ּ����簢�� {
    public int solution(int[][] sizes) {
        int answer = 0;
        int max = 0;
        // 1. ������ ����,���� ���̰� ��� sizes[][] �� ���� ���� ū ���̰� �������� Ȯ��
        int width = 0;
        int height = 0;
        
        for ( int i = 0; i < sizes.length; i++ ) { // ���� �� ����or������ ���̸� ������ �ִ� ������ ����, ���� ���� ����
            for ( int j = 0; j < sizes[i].length; j++ ) {
                if ( sizes[i][j] > max ) {
                    max = sizes[i][j];
                    if ( j == 0 ) {
                        width = sizes[i][j];
                        height = sizes[i][j+1];
                    } else {
                        width = sizes[i][j-1];
                        height = sizes[i][j];
                    }
                }
            }
        }
        
        for ( int i = 0; i < sizes.length; i++ ) { // ������ ���� �� ���̴� ���� for������ ���� (width Ȥ�� height)�� ó�����ֹǷ�
            if ( width > height ) {        // ���ϴ� ������ ���μ��� ���� �� ª�� ���� ���Ͽ� (1. ���� �� ���α��̸� ���� ������ ���ο� ��)
                int k = ( sizes[i][0] < sizes[i][1] ) ? sizes[i][0] : sizes[i][1];      //  (2. ���� �� ���α��̸� ���� ������ ���ο� ��)
                if ( height < k )
                    height = k;
            } else {
                int k = ( sizes[i][0] < sizes[i][1] ) ? sizes[i][0] : sizes[i][1];
                if ( width < k )
                    width = k;
            }
        }
        
        answer = width * height;
        return answer;
    }
}
