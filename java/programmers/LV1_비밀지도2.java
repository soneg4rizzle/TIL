package programmers;

public class LV1_비밀지도2 {
	  public String[] solution(int n, int[] arr1, int[] arr2) {
		  
	        String[] result = new String[n];
	        for (int i = 0; i < n; i++) {
	            result[i] = Integer.toBinaryString(arr1[i] | arr2[i]);
	        } // 비트연산자를 이용해 지도1, 지도2의 원소가 모두 하나라도 1(벽)이 있다면 1을 반환해 저장
	        
	        // String.format 을 이용하여 n의 크기만큼 result[i]를 정렬(만약 n보다 result[i]의 길이가 작으면 공백으로 채워준다.) 
	        for (int i = 0; i < n; i++) {
	            result[i] = String.format("%" + n + "s", result[i]);
	            result[i] = result[i].replaceAll("1", "#"); // 1 -> # 
	            result[i] = result[i].replaceAll("0", " "); // 0 -> 공백
	        }

	        return result;
	    }
}
