package programmers;

public class LV1_��Ʈ���� {
	 public int solution(String dartResult) {
         // ������ 0~10
         // S, D, T ������ �����Ѵ�. ���� ������ 1����, 2����, 3���� ���� ���ȴ�.
         // �ɼ����� *, #�� �����ϰ� *�� ������ �ٷ� ������ ���Դ� ������ 2��, ���� ���Դ� ������ 2��� ���ش�.
         //                        #�� ������ ���� ���� ������ -���ش�.
         int answer = 0;
         String[] str = new String[3];
         int start = 0;
         int p = 0;
         for ( int i = 0; i < dartResult.length(); i++ ) {
             String s = dartResult; // 1S2D*3T
             char c = dartResult.charAt(i);
             if ( c == 68 || c == 83 || c == 84 ) { // ���ڰ� ������ ��,
                 if ( i+1 < s.length() ) { // ���ڿ��� ���� �ε����� �����ϸ�,
                     if ( dartResult.charAt(i+1) > 47 && dartResult.charAt(i+1) < 58 ) { // ���� ���ڰ� �����̸�
                         str[p++] = s.substring(start, i+1);
                         start = i+1;
                     } else if ( dartResult.charAt(i+1) == 35 || dartResult.charAt(i+1) == 42 ) { // ���� ���ڰ� *�̳� #�̸�
                         if ( i+2 < s.length() ) {
                             str[p++] = s.substring(start, i+2);
                             start = i+2;
                         } else {
                             str[p++] = s.substring(start);
                             break;
                         }
                     }
                 } else { // ���ڿ��� ���� �ε����� �������� ������,
                     str[p] = s.substring(start);
                     break;
                 }
             }
         }
         ///////////////////////////////////////////////////////// ���� 1��, 2��, 3���� �õ� ���ȿ� ��� �� 0~10�� ������ ���� S, D, T, *, #�� ������ ���ڿ�
         int[] arr = new int[3];
         int n = 0;
         for ( int i = 0; i < 3; i ++ ) {            
             if ( str[i].length() == 2 ) { // ���ڿ��� ���̰� 2�� ��� : ����+����
                 int q = Integer.parseInt(str[i].substring(0, 1));
                 if ( str[i].charAt(1) == 'S' ) {
                     arr[n++] = q;
                 } else if ( str[i].charAt(1) == 'D' ) {
                     arr[n++] = q * q;
                 } else {
                     arr[n++] = q * q * q;
                 }
             } else if ( str[i].length() == 3 ) { // ���ڿ��� ���̰� 3�� ��� : 1. ���ڼ��ڹ��� 2. ���ڹ��ڿɼ�
                 if ( str[i].charAt(1) > 47 && str[i].charAt(1) < 58 ) { // ���ڼ��ڹ��� �ΰ��
                     int q = Integer.parseInt(str[i].substring(0, 2));
                     if ( str[i].charAt(2) == 'S') {
                         arr[n++] = q;
                     } else if ( str[i].charAt(2) == 'D' ) {
                         arr[n++] = q * q;
                     } else {
                         arr[n++] = q * q * q;
                     }
                 } else if ( str[i].charAt(2) == 35 || str[i].charAt(2) == 42 ) { // ���ڹ��ڿɼ� �ΰ��
                     int q = Integer.parseInt(str[i].substring(0, 1));
                     if ( str[i].charAt(2) == '#' ) {
                         if ( str[i].charAt(1) == 'S' ) {
                             arr[n++] = -1 * q;
                         } else if ( str[i].charAt(1) == 'D' ) {
                             arr[n++] = -1 * q * q;
                         } else {
                             arr[n++] = -1 * q * q * q;
                         }
                     } else if ( str[i].charAt(2) == '*' ) {
                         if ( str[i].charAt(1) == 'S' ) {
                             if ( i == 0 ) {
                                 arr[n++] = 2 * q;
                             } else {
                                 arr[n-1] *= 2;
                                 arr[n++] = 2 * q;
                             }
                         } else if ( str[i].charAt(1) == 'D' ) {
                             if ( i == 0 ) {
                                 arr[n++] = 2 * q * q;
                             } else {
                                 arr[n-1] *= 2;
                                 arr[n++] = 2 * q * q;
                             }
                         } else {
                             if ( i == 0 ) {
                                 arr[n++] = 2 * q * q * q;
                             } else {
                                 arr[n-1] *= 2;
                                 arr[n++] = 2 * q * q * q;
                             }
                         }
                     }
                 }
             } else { // ���ڿ��� ���̰� 4�ΰ�� -> 10 ���� �ɼ�
                 int q = Integer.parseInt(str[i].substring(0, 2));
                 if ( str[i].charAt(3) == '#' ) {
                     if ( str[i].charAt(2) == 'S' ) {
                         arr[n++] = -1 * q;
                     } else if ( str[i].charAt(2) == 'D' ) {
                         arr[n++] = -1 * q * q;
                     } else {
                         arr[n++] = -1 * q * q * q;
                     }
                 } else if ( str[i].charAt(3) == '*' ) {
                     if ( str[i].charAt(2) == 'S') {
                         if ( i == 0 ) {
                             arr[n++] = 2 * q;
                         } else {
                             arr[n-1] *= 2;
                             arr[n++] = 2 * q;
                         }
                     } else if ( str[i].charAt(2) == 'D' ) {
                         if ( i == 0 ) {
                             arr[n++] = 2 * q * q;
                         } else {
                             arr[n-1] *= 2;
                             arr[n++] = 2 * q * q * q;
                         }
                     }
                 }
             }                       
         }
         for ( int num : arr ) {
             answer += num;
         }
         return answer;
     }
}
