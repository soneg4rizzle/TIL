package programmers;

public class lv1_2016년 {
	public String solution(int a, int b) {
        // 31 29 31 30 31 30 31 31 30 31 30 31
        // 1월31일은 일요일
        String answer = "";
        int[] month = new int[] {0, 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int day = b;

        for ( int i = 1; i < a; i++ ) {
            day += month[i];
        }
        
        switch ( day%7 ) { // SUN,MON,TUE,WED,THU,FRI,SAT
            case 1: answer = "FRI"; break;
            case 2: answer = "SAT"; break;
            case 3: answer = "SUN"; break;
            case 4: answer = "MON"; break;
            case 5: answer = "TUE"; break;
            case 6: answer = "WED"; break;
            case 0: answer = "THU"; break;
        }
        
        return answer;
    }
}
