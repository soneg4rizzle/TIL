package programmers;
import java.util.List;
import java.util.ArrayList;

public class LV1_비밀지도 {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        // 지도1, 지도2 중 하나라도 벽에 해당되면 그 지역은 벽
        // 지도1, 지도2 둘 다 공백이면 그 지역은 길
        // 1. arr1, arr2 원소들을 2진수 형태로 변환
        String[] answer = new String[n];
        List<String> l1 = new ArrayList<String>();
        List<String> l2 = new ArrayList<String>();

        for ( int i = 0; i < n; i++ ) {
            String temp1 = Integer.toBinaryString(arr1[i]);
            String temp2 = Integer.toBinaryString(arr2[i]);
            if ( temp1.length() < n) {
                int k = temp1.length();
                for ( int j = 0; j < n-k; j++ ) {
                    temp1 = "0" + temp1;
                }
            }
            if ( temp2.length() < n ) {
                int k = temp2.length();
                for ( int j = 0; j < n-k; j++ ) {
                    temp2 = "0" + temp2;
                }
            }
            l1.add(temp1);
            l2.add(temp2);
        } 

        for ( int i = 0; i < n; i++ ) {
            String s = "";
            for ( int j = 0; j < n; j++ ) {
                if ( l1.get(i).charAt(j) + l2.get(i).charAt(j) == 96 ) {
                    s += " ";
                } else {
                    s += "#";
                }
            }
            answer[i] = s;
        }

        return answer;
    }
}
