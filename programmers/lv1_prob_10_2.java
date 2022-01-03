package programmers;
import java.util.Arrays;

class lv1_prob_10_2 {
    public String solution(String[] participant, String[] completion) {
    	String answer = "";
    	Arrays.sort(participant);
    	Arrays.sort(completion);
	
    	int i;
	
    	for ( i = 0; i < completion.length; i++ ) {
    		if ( !(completion[i].equals(participant[i])) ) {
    			return participant[i];
    		}
    	}
    return participant[i];
    }
}