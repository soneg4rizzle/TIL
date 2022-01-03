package programmers;
import java.util.ArrayList;

class lv1_���ǰ�� {
    public int[] solution(int[] answers) {
        int[] answer = {}; // 1 2 3 4 5
        int[][] p = new int[][] {{1, 2, 3, 4, 5}, {2, 1, 2, 3, 2, 4, 2, 5}, {3, 3, 1, 1, 2, 2, 4, 4, 5, 5}};
        int[] temp = new int[3];
        // for loop �� �̿��Ͽ� �� �迭�� ���������� �ݺ��ϸ� �� ( answer �������� / �ݺ��� �����ϸ� �� �迭�� �� �ε����� �����ϸ� loop�� ������ ���� index�� ���� �� �ε��� ������ �ٲ��־� �ٽ� �ݺ� ����
        int count = 0; // ���� ����
        int index = 0;
        
        for ( int i = 0; i < 3; i++ ) {
            for ( int j = 0; j < answers.length; j++ ) { // ������ ������ŭ �ݺ�
                if ( p[i][index] == answers[j] ) {
                    count++;
                }
                if ( index == p[i].length - 1 ) {
                    index = 0;
                    continue;
                } 
                index++;
            }
            temp[i] = count;
            count = 0;
            index = 0;
        }
        
        int max = Math.max(Math.max(temp[0], temp[1]), temp[2]);

        ArrayList<Integer> list = new ArrayList<Integer>();
        
        if ( max == temp[0] )
            list.add(1);
        if ( max == temp[1] )
            list.add(2);
        if ( max == temp[2] )
            list.add(3);
        
        answer = new int[list.size()];
        for ( int i = 0; i < answer.length; i++ ) {
            answer[i] = list.get(i);
        }
        
        return answer;
    }
}