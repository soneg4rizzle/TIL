package programmers;
import java.util.HashMap;
import java.util.Map;

class lv1_prob_10 {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        HashMap<String, Integer> hm = new HashMap<String, Integer>();
        
        //[getOrDefault(key, value) ->  ã�� key�� �����ϸ� �ش� key�� ���εǾ� �ִ� ���� ��ȯ�ϰ�, �׷��� ������ ����Ʈ ��(getOrdefault�� value ��)�� ��ȯ]
        for ( int i = 0; i < participant.length; i++ ) {
            hm.put(participant[i], hm.getOrDefault(participant[i], 0) + 1); 
        // �ؽ��� hm�� ���� �ƹ� ���� ������ ���� �����Ƿ�, getOrDefault�� ���� key���� participant �迭�� String �������� ����ǰ� value���� 1�� ����ȴ�. 
        }
        
        for ( int i = 0; i < completion.length; i++ ) {
            hm.put(completion[i], hm.get(completion[i])-1);
        } // �ʿ� ������ ����� ������ ���� �̸�(���� key)�� �ش�Ǹ�
          //                 �̿� �����ϴ� key�� value ���� �ϳ� ���ҽ����ش�.
          // ������/�������� �̸��� ��ġ�� ��츦 �ϳ��� �������� ��Ŀ����
        for(String player : hm.keySet()) {
            if(hm.get(player) != 0) { // Player�� value�� 0�� �ƴϸ� ���� �������� �ǹ�
                answer = player;
                return answer;
            }
        }
        return answer;
    }
}