package programmers;
<<<<<<< HEAD

public class lv1_폰켓몬 {

=======
import java.util.HashSet;

public class lv1_폰켓몬 {
	public int solution(int[] nums) {
        // N마리 폰켓몬의 종류 번호가 담긴 배열 nums
        
        // 문제 : N/2마리의 폰켓몬을 선택하는 방법 중,
        // 가장 많은 종류의 폰켓몬을 선택하는 방법을 찾아,
        // 그때의 폰켓몬 종류 번호의 개수를 return.
                
        int answer = 0;
        int N = nums.length/2;
    
        HashSet<Integer> hs = new HashSet<Integer>();
        
        for ( int i = 0; i < nums.length; i++ ) {  // 포켓몬의 종류를 HashSet에 넣어준다.
            if ( !hs.contains(nums[i]) ) {
                hs.add(nums[i]);
            }
        }
        
        if ( hs.size() < N ) { // HashSet의 크기가 N보다 작으면 뽑을 수 있는 포켓몬 종류의 수는 HashSet 의 크기와 동일하다.
            return hs.size();
        } else {
            return N; // HashSet의 크기가 N보다 크거나 같으면 뽑을 수 있는 포켓몬 종류의 수는 N과 같다.
        }
    }
>>>>>>> 94a526742027e983494cc284430202e27c1faf41
}
