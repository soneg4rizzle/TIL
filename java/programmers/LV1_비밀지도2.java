package programmers;

public class LV1_�������2 {
	  public String[] solution(int n, int[] arr1, int[] arr2) {
		  
	        String[] result = new String[n];
	        for (int i = 0; i < n; i++) {
	            result[i] = Integer.toBinaryString(arr1[i] | arr2[i]);
	        } // ��Ʈ�����ڸ� �̿��� ����1, ����2�� ���Ұ� ��� �ϳ��� 1(��)�� �ִٸ� 1�� ��ȯ�� ����
	        
	        // String.format �� �̿��Ͽ� n�� ũ�⸸ŭ result[i]�� ����(���� n���� result[i]�� ���̰� ������ �������� ä���ش�.) 
	        for (int i = 0; i < n; i++) {
	            result[i] = String.format("%" + n + "s", result[i]);
	            result[i] = result[i].replaceAll("1", "#"); // 1 -> # 
	            result[i] = result[i].replaceAll("0", " "); // 0 -> ����
	        }

	        return result;
	    }
}
