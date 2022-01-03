package programmers;
import java.util.ArrayList;

class lv1_모의고사 {
    public int[] solution(int[] answers) {
        int[] answer = {}; // 1 2 3 4 5
        int[][] p = new int[][] {{1, 2, 3, 4, 5}, {2, 1, 2, 3, 2, 4, 2, 5}, {3, 3, 1, 1, 2, 2, 4, 4, 5, 5}};
        int[] temp = new int[3];
        // for loop 을 이용하여 각 배열의 정답패턴을 반복하며 비교 ( answer 개수까지 / 반복을 진행하며 각 배열의 끝 인덱스에 도달하면 loop이 끝나기 전에 index를 제일 앞 인덱스 값으로 바꿔주어 다시 반복 진행
        int count = 0; // 정답 개수
        int index = 0;
        
        for ( int i = 0; i < 3; i++ ) {
            for ( int j = 0; j < answers.length; j++ ) { // 문제의 개수만큼 반복
                if ( p[i][index] == answers[j] ) {
                    count++;
                }
                if ( index == p[i].length - 1 ) {
                    index = 0;
                    continue;
                } 
                index++;
            }
            temp[i] = count;
            count = 0;
            index = 0;
        }
        
        int max = Math.max(Math.max(temp[0], temp[1]), temp[2]);

        ArrayList<Integer> list = new ArrayList<Integer>();
        
        if ( max == temp[0] )
            list.add(1);
        if ( max == temp[1] )
            list.add(2);
        if ( max == temp[2] )
            list.add(3);
        
        answer = new int[list.size()];
        for ( int i = 0; i < answer.length; i++ ) {
            answer[i] = list.get(i);
        }
        
        return answer;
    }
}