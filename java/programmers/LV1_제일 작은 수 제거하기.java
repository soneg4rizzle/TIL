package programmers;

public class LV1_제일작은수제거하기 {
	public int[] solution(int[] arr) {
        int[] answer = {};
        int min;
        int k = 0;
        
        if ( arr.length == 1 ) {
            answer = new int[1];
            answer[0] = -1;
        } else {
            min = arr[0];
            answer = new int[arr.length-1];
            for ( int i = 1; i < arr.length; i++ ) {
                if ( arr[i] < min )
                    min = arr[i];
            }
            
            for ( int i = 0; i < arr.length; i++ ) {
                if ( arr[i] != min )
                    answer[k++] = arr[i];
            }
        }
        return answer;
    }
}
