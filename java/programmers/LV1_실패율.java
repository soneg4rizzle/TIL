package programmers;

public class lv1_실패율 {
	public int[] solution(int N, int[] stages) {
        // 실패율 : 스테이지에 도달했으나 아직 클리어하지 못한 플레이어의 수 / 스테이지에 도달한 플레이어 수
        
        // 전체 스테이지의 개수 N, 게임을 이용하는 사용자가 현재 멈춰있는 스테이지의 번호가 담긴 배열 stages가 매개변수로 주어질 때,
        // 실패율이 높은 스테이지부터 내림차순으로 스테이지의 번호가 담겨있는 배열을 return 하도록 solution 함수

        int[] answer = new int[N];
        double player = stages.length ; // 각 스테이지의 플레이어 수를 나타낼 변수
        double challenger = 0; // 각 스테이지에 '도달'했으나 클리어하지 못한 플레이어의 수를 나타낼 변수
        double temp[] = new double[N]; // 임시로 스테이지별 실패율을 담을 배열
        
        for ( int i = 0; i < N; i++ ) {
            for ( int j = 0; j < stages.length; j++ ) {
                if ( i+1 == stages[j] ) {
                    challenger++;
                }
            }
            temp[i] = (challenger / player);
            if ( player == 0 ) // 만약 플레이어 수가 0이라면, challenger / player = NaN ( Not a Number ) 이므로 계산을 위해 따로 처리해야 한다.
                temp[i] = 0;
            player -= challenger; // ( 총 플레이어 수 ) - ( 다음 스테이지로 넘어가지 못한 플레이어의 수 )
            challenger = 0; // 다음 스테이지로 넘어가므로 0으로 초기화
        }

        // 같은 확률이면 오름차순으로, 다른 확률이면 실패율 높은 순서대로 내림차순으로 배열한다.
        double max = -1; // 가장 높은 실패율
        int p = 0; // 가장 높은 실패율을 가진 스테이지
        int t = 0;
        
        for ( int i = 0; i < temp.length; i++ ) { // temp 배열을 순회하며 실패율이 가장 높은 스테이지를 찾고 순서대로 answer 배열에 넣어준다.
            for ( int j = 0; j < temp.length; j++ ) {
                if ( temp[j] > max ) {
                    max = temp[j];
                    t = j;
                    p = j+1;
                }
            }
            answer[i] = p;
            max = -1;
            temp[t] = -2;
        }
       
        /*
        for ( int i = 0; i < temp.length; i++ ) {
            System.out.print(temp[i] + " | ");
        }
        System.out.println();
        for ( int i = 0; i < answer.length; i++ ) {
            System.out.print(answer[i] + " | ");
        }
        */
        
        return answer;
    }
}
