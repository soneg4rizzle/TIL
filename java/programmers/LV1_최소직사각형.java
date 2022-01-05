package programmers;

public class LV1_최소직사각형 {
    public int solution(int[][] sizes) {
        int answer = 0;
        int max = 0;
        // 1. 명함의 가로,세로 길이가 담긴 sizes[][] 를 돌며 가장 큰 길이가 무엇인지 확인
        int width = 0;
        int height = 0;
        
        for ( int i = 0; i < sizes.length; i++ ) { // 가장 긴 가로or세로의 길이를 가지고 있는 명함의 가로, 세로 길이 정보
            for ( int j = 0; j < sizes[i].length; j++ ) {
                if ( sizes[i][j] > max ) {
                    max = sizes[i][j];
                    if ( j == 0 ) {
                        width = sizes[i][j];
                        height = sizes[i][j+1];
                    } else {
                        width = sizes[i][j-1];
                        height = sizes[i][j];
                    }
                }
            }
        }
        
        for ( int i = 0; i < sizes.length; i++ ) { // 명함의 가장 긴 길이는 위의 for문에서 구한 (width 혹은 height)가 처리해주므로
            if ( width > height ) {        // 비교하는 명함의 가로세로 길이 중 짧은 것을 택하여 (1. 가장 긴 가로길이를 가진 명함의 세로와 비교)
                int k = ( sizes[i][0] < sizes[i][1] ) ? sizes[i][0] : sizes[i][1];      //  (2. 가장 긴 세로길이를 가진 명함의 가로와 비교)
                if ( height < k )
                    height = k;
            } else {
                int k = ( sizes[i][0] < sizes[i][1] ) ? sizes[i][0] : sizes[i][1];
                if ( width < k )
                    width = k;
            }
        }
        
        answer = width * height;
        return answer;
    }
}
