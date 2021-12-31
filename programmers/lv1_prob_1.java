package programmers;
import java.util.*;

class lv1_prob_1 {
    public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = {0, 0};
        int unknown_num = 0;
        int nonZero_count = 0;
        int min_same = 0;
        int rank[] = {6, 5, 4, 3, 2, 1};
        Arrays.sort(lottos); // 0 0 1 25 31 44
        
        for ( int i = 0; i < lottos.length; i++ ) {
            if ( lottos[i] == 0 ) {
                unknown_num++; // 2
            }
        }
        
        for ( int i = 0; i < lottos.length; i++ ) { // sort 된 lottos 배열에서 0이 아닌 수가 나오는 첫 번째 경우의 수
            if ( lottos[i] != 0 ) {
                nonZero_count = i; // 2
                break;
            }
        }
        // win_nums = {31, 10, 45, 1, 6, 19};
        for ( int i = nonZero_count; i < lottos.length; i++ ) {
            for ( int j = 0; j < win_nums.length; j++ ) {
                if ( lottos[i] == win_nums[j] ) {
                    min_same++; // 2
                }          
            }
        }
        
        for ( int i = 0; i < rank.length; i++ ) {
            if ( rank[i] == min_same ) {
                min_same = i+1;
                break;
            }
        }
        
        if ( unknown_num == 6 && min_same == 0 ) {
            answer[1] = 6;
            answer[0] = 1;
        } else if ( unknown_num == 0 && min_same == 0 ) {
            answer[1] = 6;
            answer[0] = 6;
        } else {
        answer[1] = min_same;
        answer[0] = min_same - unknown_num;
        }
        return answer;
    }
}