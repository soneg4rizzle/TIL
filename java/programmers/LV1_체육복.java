package programmers;
import java.util.Scanner;

class lv1_ü���� {
	class Solution {
	    public int solution(int n, int[] lost, int[] reserve) {
	        int answer = 0;
	        int[] check = new int[n+1];

	        for ( int i = 1; i < check.length; i++ ) // ���ɽð� �� �л����� ������ �ִ� ü������ �ּ� ����
	            check[i]++;
	        for ( int i = 0; i < lost.length; i++ ) // ü������ �������� �л��� ü���� ������ 1�� ���ش�.
	            check[lost[i]]--;
	        for ( int i = 0; i < reserve.length; i++ ) // ������ ü������ ������ �ִ� �л��� ü���� ������ 1�� �����ش�.
	            check[reserve[i]]++;
	        
	        for ( int i = 1; i < check.length; i++ ) {
	            if ( check[i] == 2 ) { // ü������ ������ �� �ִ� �л��� ���
	                if ( i == 1 ) { // ���� ��ȣ �л��� ������ ü������ ������ ���� ���
	                    if ( check[i+1] == 0 ) {
	                        check[i+1]++;
	                        check[i]--;
	                    }
	                } else if ( i == n ) { // �� ��ȣ �л��� ������ ü������ ������ ���� ���
	                    if ( check[i-1] == 0 ) {
	                        check[i-1]++;
	                        check[i]--;
	                    }
	                } else if ( 1 < i && i < n ) { // ����~�� ��ȣ ������ �л��� ������ ü������ ������ ���� ���
	                    if ( check[i-1] == 0 ) {
	                        check[i-1]++;
	                        check[i]--;
	                    } else if ( check[i+1] == 0 ) {
	                        check[i+1]++;
	                        check[i]--;
	                    }
	                }
	            }
	        }
	        
	        for ( int i = 1; i < check.length; i++ ) {
	            if ( check[i] != 0 ) {
	                answer++;
	            }
	        }
	        return answer;
	    }
	}
}
