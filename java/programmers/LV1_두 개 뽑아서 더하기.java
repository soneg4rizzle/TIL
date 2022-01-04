package programmers;

import java.util.HashSet;
import java.util.Arrays;
import java.util.Iterator;

public class lv1_두_개_뽑아서_더하기 {
	public int[] solution(int[] numbers) {
        int[] answer = {};
        HashSet<Integer> hs = new HashSet<Integer>();
        
        for ( int i = 0; i < numbers.length; i++ ) {
            for ( int j = i+1; j < numbers.length; j++ ) {
                hs.add(numbers[i]+numbers[j]);
            }
        }
            
        answer = new int[hs.size()];
        Iterator it = hs.iterator();
        
        int i = 0;
        while ( it.hasNext() ) {
            answer[i++] = (int)it.next();       
        }
        Arrays.sort(answer);
        return answer;
    }
}
