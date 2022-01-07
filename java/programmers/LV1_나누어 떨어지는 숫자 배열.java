package programmers;
import java.util.*;

public class LV1_나누어떨어지는숫자배열 {
	 public int[] solution(int[] arr, int divisor) {
	        int[] answer = {};
	        List<Integer> list = new ArrayList<Integer>();
	        
	        for ( int i = 0; i < arr.length; i++ ) {
	            if ( arr[i] % divisor == 0 ) { // arr[i]이 divisor로 나누어지는 수인 경우
	                list.add(arr[i]);
	            }
	        }
	        
	        if ( list.size() == 0 ) { // 1. list에 담긴게 없으면 -1값이 리턴되게 한다.
	            answer = new int[1];
	            answer[0] = -1;
	            return answer;
	        }
	        
	        answer = new int[list.size()];
	        for ( int i = 0; i < list.size(); i++ ) { // 2. 1이 아닌 경우 list에 담긴 원소들을 answer 배열에 옮겨준다. 
	            answer[i] = list.get(i);
	        }
	        Arrays.sort(answer);
	        return answer;
	    }
}
