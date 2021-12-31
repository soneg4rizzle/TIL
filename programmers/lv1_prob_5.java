package programmers;
import java.util.Stack;

public class lv1_prob_5 {
	 public int solution(int[][] board, int[] moves) {
	        int answer = 0;
	        Stack<Integer> stack = new Stack<>(); // �ٱ��� ������ ����
	        int[] d = new int[board.length]; // �� ������ �ִ� ĭ�� ���� ������ ���� �迭
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
	       
	        
	        for ( int i = 0; i < moves.length; i++ ) { // ũ������ �����̴� Ƚ����ŭ �ݺ�
	            if ( d[moves[i]] <= n ) { // 1. �̵��� ũ���� ��ġ�� ������ �ִ� ���
	                if ( stack.isEmpty() ) { // 1-1. ������ ��� ������ ������ �ִ´�.
	                    stack.push(board[d[moves[i]]][moves[i]]);
	                    board[d[moves[i]]][moves[i]] = 0; // �ش� ��ġ���� ������ �������� 0���� �� �ڸ����� ǥ���Ѵ�.
	                    d[moves[i]] += 1; // �ش� ��ġ���� ������ �������� ������ �ִ� ���� ���̴� +1
	                } else { // 1-2. ������ ������� ���� ���
	                    if ( board[d[moves[i]]][moves[i]] == stack.peek() ) { // �ٱ��� �ȿ� ���� ������ ��� ���� ������ ���� ���
	                        stack.pop();
	                        board[d[moves[i]]][moves[i]] = 0;
	                        d[moves[i]] += 1;
	                        answer += 2;
	                    } else { // �ٱ��� �ȿ� ���� ������ ��� ���� ������ ���� ���� ���
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
