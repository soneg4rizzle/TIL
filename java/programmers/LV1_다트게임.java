package programmers;

public class LV1_다트게임 {
	 public int solution(String dartResult) {
         // 점수는 0~10
         // S, D, T 영역이 존재한다. 각각 점수의 1제곱, 2제곱, 3제곱 으로 계산된다.
         // 옵션으로 *, #이 존재하고 *가 나오면 바로 이전에 나왔던 점수를 2배, 현재 나왔던 점수를 2배로 해준다.
         //                        #이 나오면 현재 나온 점수를 -해준다.
         int answer = 0;
         String[] str = new String[3];
         int start = 0;
         int p = 0;
         for ( int i = 0; i < dartResult.length(); i++ ) {
             String s = dartResult; // 1S2D*3T
             char c = dartResult.charAt(i);
             if ( c == 68 || c == 83 || c == 84 ) { // 문자가 나왔을 때,
                 if ( i+1 < s.length() ) { // 문자열의 다음 인덱스가 존재하면,
                     if ( dartResult.charAt(i+1) > 47 && dartResult.charAt(i+1) < 58 ) { // 다음 문자가 숫자이면
                         str[p++] = s.substring(start, i+1);
                         start = i+1;
                     } else if ( dartResult.charAt(i+1) == 35 || dartResult.charAt(i+1) == 42 ) { // 다음 문자가 *이나 #이면
                         if ( i+2 < s.length() ) {
                             str[p++] = s.substring(start, i+2);
                             start = i+2;
                         } else {
                             str[p++] = s.substring(start);
                             break;
                         }
                     }
                 } else { // 문자열의 다음 인덱스가 존재하지 않으면,
                     str[p] = s.substring(start);
                     break;
                 }
             }
         }
         ///////////////////////////////////////////////////////// 위는 1번, 2번, 3번의 시도 동안에 얻게 된 0~10의 정수와 문자 S, D, T, *, #로 구성된 문자열
         int[] arr = new int[3];
         int n = 0;
         for ( int i = 0; i < 3; i ++ ) {            
             if ( str[i].length() == 2 ) { // 문자열의 길이가 2인 경우 : 숫자+문자
                 int q = Integer.parseInt(str[i].substring(0, 1));
                 if ( str[i].charAt(1) == 'S' ) {
                     arr[n++] = q;
                 } else if ( str[i].charAt(1) == 'D' ) {
                     arr[n++] = q * q;
                 } else {
                     arr[n++] = q * q * q;
                 }
             } else if ( str[i].length() == 3 ) { // 문자열의 길이가 3인 경우 : 1. 숫자숫자문자 2. 숫자문자옵션
                 if ( str[i].charAt(1) > 47 && str[i].charAt(1) < 58 ) { // 숫자숫자문자 인경우
                     int q = Integer.parseInt(str[i].substring(0, 2));
                     if ( str[i].charAt(2) == 'S') {
                         arr[n++] = q;
                     } else if ( str[i].charAt(2) == 'D' ) {
                         arr[n++] = q * q;
                     } else {
                         arr[n++] = q * q * q;
                     }
                 } else if ( str[i].charAt(2) == 35 || str[i].charAt(2) == 42 ) { // 숫자문자옵션 인경우
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
             } else { // 문자열의 길이가 4인경우 -> 10 문자 옵션
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
