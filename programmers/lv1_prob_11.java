package programmers;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

class lv1_prob_11 {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        
        for ( int i = 0; i < commands.length; i++ ) { 
            List<Integer> list = new ArrayList<Integer>();
            // 리스트에 commands[i][0]-1 ~ commands[i][1]-1 에 해당하는 값들을 넣어준다.
            for ( int j = commands[i][0]-1; j < commands[i][1]; j++ ) {
                list.add(array[j]);
            }
            Collections.sort(list); // 정렬 후에 commands[i][2]-1 번째에 해당하는 값을 리턴 할 배열에 넣어준다.
            answer[i] = list.get(commands[i][2]-1);
        }
        
        
        return answer;
    }
}