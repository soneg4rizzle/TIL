package programmers;
import java.util.Deque;
import java.util.ArrayDeque;

public class LV1_같은숫자는싫어 {
	public int[] solution(int []arr) {
        int[] answer = {};
        Deque<Integer> deque = new ArrayDeque<Integer>();
        
        for ( int i = 0; i < arr.length; i++) {
            int compareN = arr[i]; // 연속인지 비교하기 위한 변수
            if ( deque.isEmpty() ) // 덱에 아무것도 없으면 일단 하나 넣어주고 시작
                deque.add(compareN);
            else {
                if ( compareN != deque.peekLast() ) // compareN이 덱에 넣어준 값과 다르면 연속적으로 나타나는 숫자가 아님을 뜻하므로
                    deque.add(compareN);            // compareN을 덱에 추가해준다.
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
