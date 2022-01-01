package programmers;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

class lv1_prob_11 {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        
        for ( int i = 0; i < commands.length; i++ ) { 
            List<Integer> list = new ArrayList<Integer>();
            // ����Ʈ�� commands[i][0]-1 ~ commands[i][1]-1 �� �ش��ϴ� ������ �־��ش�.
            for ( int j = commands[i][0]-1; j < commands[i][1]; j++ ) {
                list.add(array[j]);
            }
            Collections.sort(list); // ���� �Ŀ� commands[i][2]-1 ��°�� �ش��ϴ� ���� ���� �� �迭�� �־��ش�.
            answer[i] = list.get(commands[i][2]-1);
        }
        
        
        return answer;
    }
}