package programmers;
import java.util.*;

public class LV1_����������¼��ڹ迭 {
	 public int[] solution(int[] arr, int divisor) {
	        int[] answer = {};
	        List<Integer> list = new ArrayList<Integer>();
	        
	        for ( int i = 0; i < arr.length; i++ ) {
	            if ( arr[i] % divisor == 0 ) { // arr[i]�� divisor�� ���������� ���� ���
	                list.add(arr[i]);
	            }
	        }
	        
	        if ( list.size() == 0 ) { // 1. list�� ���� ������ -1���� ���ϵǰ� �Ѵ�.
	            answer = new int[1];
	            answer[0] = -1;
	            return answer;
	        }
	        
	        answer = new int[list.size()];
	        for ( int i = 0; i < list.size(); i++ ) { // 2. 1�� �ƴ� ��� list�� ��� ���ҵ��� answer �迭�� �Ű��ش�. 
	            answer[i] = list.get(i);
	        }
	        Arrays.sort(answer);
	        return answer;
	    }
}
