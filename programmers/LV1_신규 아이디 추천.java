package programmers;

public class lv1_prob_2 {
	public String solution(String new_id) {
        String answer = "";
        
        // new_id의 모든 대문자를 대응되는 소문자로 치환
        new_id = new_id.toLowerCase();
        
        // new_id에서 알파벳 소문자, 숫자, 빼기(-), 밑줄(_), 마침표(.)를 제외한 모든 문자를 제거
        for ( int i = 0; i < new_id.length(); i++ ) {
            char ch = new_id.charAt(i);
            if ( ch >= 'a' && ch <= 'z' ) {
                answer += ch;
            } else if ( ch >= '0' && ch <= '9' ) {
                answer += ch;
            } else if ( ch == '-' || ch == '_' || ch == '.' ) {
                answer += ch;
            }
        }
        
        // new_id에서 마침표(.)가 2번 이상 연속된 부분을 하나의 마침표(.)로 치환
        String compare_answer = "";
        do {
            compare_answer = answer;
            answer = answer.replace("..", ".");
        } while ( answer != compare_answer );
        
        // new_id에서 마침표(.)가 처음이나 끝에 위치한다면 제거합니다.
        if ( answer.startsWith(".") ) {
            answer = answer.substring(1, answer.length());
        } else if ( answer.endsWith(".") ) {
            answer = answer.substring(0, answer.length()-1);
        }
        
        //new_id가 빈 문자열이라면, new_id에 "a"를 대입합니다.
        if ( answer.isEmpty() ) {
            answer += "a";
        }
        
        // new_id의 길이가 16자 이상이면, new_id의 첫 15개의 문자를 제외한 나머지 문자들을 모두 제거
        // 만약 제거 후 마침표(.)가 new_id의 끝에 위치한다면 끝에 위치한 마침표(.) 문자를 제거
        if ( answer.length() > 15 ) {
            answer = answer.substring(0, 15);
        }
        if ( answer.endsWith(".") ) {
            answer = answer.substring(0, answer.length()-1);
        }
        
        // new_id의 길이가 2자 이하라면, new_id의 마지막 문자를 new_id의 길이가 3이 될 때까지 반복해서 끝에 붙입니다.
        if ( answer.length() <= 2 ) { // length == 1 or 2
            for ( int i = answer.length(); i < 3; i++ ) {
                answer += answer.charAt(i-1);
            }
        }
        
        return answer;
    }
}
