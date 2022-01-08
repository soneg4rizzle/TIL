package programmers;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Arrays;

public class LV1_문자열내마음대로정렬하기 {
	public String[] solution(String[] strings, int n) {
        List<String> list = new ArrayList<String>();
       List<String> temp = new ArrayList<>(Arrays.asList(strings));
        char min = '{';
        String[] answer = new String[strings.length];
        int k = 0;
        
        for ( int i = 0; i < strings.length; i++ ) {
            for ( int j = 0; j < temp.size(); j++ ) {
                if ( temp.get(j).charAt(n) < min )
                    min = temp.get(j).charAt(n);
            }
            
            for ( int j = 0; j < temp.size(); j++ ) {
                if ( temp.get(j).charAt(n) == min ) {
                    list.add(temp.get(j));
                    temp.remove(j);
                    j--;
                }
            }     
            Collections.sort(list);
            
            for ( int j = 0; j < list.size(); j++ ) {               answer[k++] = list.get(j);
            }
            list.clear();
            min = '{';
        }
        return answer;
    }
}
