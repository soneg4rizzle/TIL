package programmers;

public class lv1_������ {
	public int[] solution(int N, int[] stages) {
        // ������ : ���������� ���������� ���� Ŭ�������� ���� �÷��̾��� �� / ���������� ������ �÷��̾� ��
        
        // ��ü ���������� ���� N, ������ �̿��ϴ� ����ڰ� ���� �����ִ� ���������� ��ȣ�� ��� �迭 stages�� �Ű������� �־��� ��,
        // �������� ���� ������������ ������������ ���������� ��ȣ�� ����ִ� �迭�� return �ϵ��� solution �Լ�

        int[] answer = new int[N];
        double player = stages.length ; // �� ���������� �÷��̾� ���� ��Ÿ�� ����
        double challenger = 0; // �� ���������� '����'������ Ŭ�������� ���� �÷��̾��� ���� ��Ÿ�� ����
        double temp[] = new double[N]; // �ӽ÷� ���������� �������� ���� �迭
        
        for ( int i = 0; i < N; i++ ) {
            for ( int j = 0; j < stages.length; j++ ) {
                if ( i+1 == stages[j] ) {
                    challenger++;
                }
            }
            temp[i] = (challenger / player);
            if ( player == 0 ) // ���� �÷��̾� ���� 0�̶��, challenger / player = NaN ( Not a Number ) �̹Ƿ� ����� ���� ���� ó���ؾ� �Ѵ�.
                temp[i] = 0;
            player -= challenger; // ( �� �÷��̾� �� ) - ( ���� ���������� �Ѿ�� ���� �÷��̾��� �� )
            challenger = 0; // ���� ���������� �Ѿ�Ƿ� 0���� �ʱ�ȭ
        }

        // ���� Ȯ���̸� ������������, �ٸ� Ȯ���̸� ������ ���� ������� ������������ �迭�Ѵ�.
        double max = -1; // ���� ���� ������
        int p = 0; // ���� ���� �������� ���� ��������
        int t = 0;
        
        for ( int i = 0; i < temp.length; i++ ) { // temp �迭�� ��ȸ�ϸ� �������� ���� ���� ���������� ã�� ������� answer �迭�� �־��ش�.
            for ( int j = 0; j < temp.length; j++ ) {
                if ( temp[j] > max ) {
                    max = temp[j];
                    t = j;
                    p = j+1;
                }
            }
            answer[i] = p;
            max = -1;
            temp[t] = -2;
        }
       
        /*
        for ( int i = 0; i < temp.length; i++ ) {
            System.out.print(temp[i] + " | ");
        }
        System.out.println();
        for ( int i = 0; i < answer.length; i++ ) {
            System.out.print(answer[i] + " | ");
        }
        */
        
        return answer;
    }
}
