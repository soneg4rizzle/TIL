package programmers;
<<<<<<< HEAD

public class lv1_���ϸ� {

=======
import java.util.HashSet;

public class lv1_���ϸ� {
	public int solution(int[] nums) {
        // N���� ���ϸ��� ���� ��ȣ�� ��� �迭 nums
        
        // ���� : N/2������ ���ϸ��� �����ϴ� ��� ��,
        // ���� ���� ������ ���ϸ��� �����ϴ� ����� ã��,
        // �׶��� ���ϸ� ���� ��ȣ�� ������ return.
                
        int answer = 0;
        int N = nums.length/2;
    
        HashSet<Integer> hs = new HashSet<Integer>();
        
        for ( int i = 0; i < nums.length; i++ ) {  // ���ϸ��� ������ HashSet�� �־��ش�.
            if ( !hs.contains(nums[i]) ) {
                hs.add(nums[i]);
            }
        }
        
        if ( hs.size() < N ) { // HashSet�� ũ�Ⱑ N���� ������ ���� �� �ִ� ���ϸ� ������ ���� HashSet �� ũ��� �����ϴ�.
            return hs.size();
        } else {
            return N; // HashSet�� ũ�Ⱑ N���� ũ�ų� ������ ���� �� �ִ� ���ϸ� ������ ���� N�� ����.
        }
    }
>>>>>>> 94a526742027e983494cc284430202e27c1faf41
}
