package programmers;
import java.util.Stack;

public class lv1_prob_5 {
	 public int solution(int[][] board, int[] moves) {
	        int answer = 0;
	        Stack<Integer> stack = new Stack<>(); // 바구니 역할의 스택
	        int[] d = new int[board.length]; // 각 인형이 있는 칸의 깊이 정보를 가진 배열
	        int k = 0;
	        int n = board.length - 1;
	     
	        for ( int i = 0; i < d.length; i++ ) {
	            while ( board[k][i] == 0 ) {
	                k++;
	            }
	            d[i] = k;
	            k = 0;
	        }
	      
	        for ( int i = 0; i < moves.length; i++ ) {
	            moves[i] -= 1;
	        }
	       
	        
	        for ( int i = 0; i < moves.length; i++ ) { // 크레인이 움직이는 횟수만큼 반복
	            if ( d[moves[i]] <= n ) { // 1. 이동한 크레인 위치에 인형이 있는 경우
	                if ( stack.isEmpty() ) { // 1-1. 스택이 비어 있으면 무조건 넣는다.
	                    stack.push(board[d[moves[i]]][moves[i]]);
	                    board[d[moves[i]]][moves[i]] = 0; // 해당 위치에서 인형을 꺼냈으니 0으로 빈 자리임을 표시한다.
	                    d[moves[i]] += 1; // 해당 위치에서 인형을 꺼냈으니 인형이 있는 곳의 깊이는 +1
	                } else { // 1-2. 스택이 비어있지 않은 경우
	                    if ( board[d[moves[i]]][moves[i]] == stack.peek() ) { // 바구니 안에 쌓인 인형과 방금 뽑은 인형이 같은 경우
	                        stack.pop();
	                        board[d[moves[i]]][moves[i]] = 0;
	                        d[moves[i]] += 1;
	                        answer += 2;
	                    } else { // 바구니 안에 쌓인 인형과 방금 뽑은 인형이 같지 않은 경우
	                        stack.push(board[d[moves[i]]][moves[i]]);
	                        board[d[moves[i]]][moves[i]] = 0;
	                        d[moves[i]] += 1;
	                    }
	                }
	            }
	        }
	        return answer;
	    }
}
