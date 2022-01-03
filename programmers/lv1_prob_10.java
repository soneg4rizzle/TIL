package programmers;
import java.util.HashMap;
import java.util.Map;

class lv1_prob_10 {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        HashMap<String, Integer> hm = new HashMap<String, Integer>();
        
        //[getOrDefault(key, value) ->  찾는 key가 존재하면 해당 key에 매핑되어 있는 값을 반환하고, 그렇지 않으면 디폴트 값(getOrdefault의 value 값)이 반환]
        for ( int i = 0; i < participant.length; i++ ) {
            hm.put(participant[i], hm.getOrDefault(participant[i], 0) + 1); 
        // 해쉬맵 hm은 아직 아무 값도 가지고 있지 않으므로, getOrDefault에 따라 key에는 participant 배열의 String 변수들이 저장되고 value에는 1이 저장된다. 
        }
        
        for ( int i = 0; i < completion.length; i++ ) {
            hm.put(completion[i], hm.get(completion[i])-1);
        } // 맵에 완주자 명단을 넣으며 같은 이름(같은 key)에 해당되면
          //                 이에 상응하는 key의 value 값을 하나 감소시켜준다.
          // 참가자/완주자의 이름이 겹치는 경우를 하나씩 지워가는 메커니즘
        for(String player : hm.keySet()) {
            if(hm.get(player) != 0) { // Player의 value가 0이 아니면 완주 못했음을 의미
                answer = player;
                return answer;
            }
        }
        return answer;
    }
}