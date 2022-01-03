package programmers;
import java.util.Scanner;

class lv1_체육복 {
	class Solution {
	    public int solution(int n, int[] lost, int[] reserve) {
	        int answer = 0;
	        int[] check = new int[n+1];

	        for ( int i = 1; i < check.length; i++ ) // 점심시간 전 학생들이 가지고 있던 체육복의 최소 개수
	            check[i]++;
	        for ( int i = 0; i < lost.length; i++ ) // 체육복을 도난당한 학생의 체육복 개수를 1개 빼준다.
	            check[lost[i]]--;
	        for ( int i = 0; i < reserve.length; i++ ) // 여분의 체육복을 가지고 있던 학생의 체육복 개수를 1개 더해준다.
	            check[reserve[i]]++;
	        
	        for ( int i = 1; i < check.length; i++ ) {
	            if ( check[i] == 2 ) { // 체육복을 빌려줄 수 있는 학생의 경우
	                if ( i == 1 ) { // 시작 번호 학생이 여분의 체육복을 가지고 있을 경우
	                    if ( check[i+1] == 0 ) {
	                        check[i+1]++;
	                        check[i]--;
	                    }
	                } else if ( i == n ) { // 끝 번호 학생이 여분의 체육복을 가지고 있을 경우
	                    if ( check[i-1] == 0 ) {
	                        check[i-1]++;
	                        check[i]--;
	                    }
	                } else if ( 1 < i && i < n ) { // 시작~끝 번호 사이의 학생이 여분의 체육복을 가지고 있을 경우
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
