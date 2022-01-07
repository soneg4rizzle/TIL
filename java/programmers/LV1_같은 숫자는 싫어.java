package programmers;
import java.util.Deque;
import java.util.ArrayDeque;

public class LV1_�������ڴ½Ⱦ� {
	public int[] solution(int []arr) {
        int[] answer = {};
        Deque<Integer> deque = new ArrayDeque<Integer>();
        
        for ( int i = 0; i < arr.length; i++) {
            int compareN = arr[i]; // �������� ���ϱ� ���� ����
            if ( deque.isEmpty() ) // ���� �ƹ��͵� ������ �ϴ� �ϳ� �־��ְ� ����
                deque.add(compareN);
            else {
                if ( compareN != deque.peekLast() ) // compareN�� ���� �־��� ���� �ٸ��� ���������� ��Ÿ���� ���ڰ� �ƴ��� ���ϹǷ�
                    deque.add(compareN);            // compareN�� ���� �߰����ش�.
            }
        }
        
        answer = new int[deque.size()];
        int n = 0;
        while ( !deque.isEmpty() ) {
            answer[n++] = deque.poll();
        }
       
        return answer;
    }
}
