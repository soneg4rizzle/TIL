package programmers;

public class LV1_서울에서김서방찾기 {
	public String solution(String[] seoul) {
        String answer = "";
        String name = "Kim";
        int loc = 0;
        for ( int i = 0; i < seoul.length; i++ ) {
            if ( seoul[i].equals(name) ) {
                loc = i;
                break;
            }
        }
        answer += "김서방은 " + loc + "에 있다";
        return answer;
    }
}
