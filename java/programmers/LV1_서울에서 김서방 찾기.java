package programmers;

public class LV1_���￡���輭��ã�� {
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
        answer += "�輭���� " + loc + "�� �ִ�";
        return answer;
    }
}
