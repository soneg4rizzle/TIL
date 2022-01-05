package programmers;

public class LV1_최소직사각형2 {
    public int solution(int[][] sizes) {
        // Math.max / Math.min 을 이용해 푸는 방법
        int max = 0;
        int min = 0;
        
        for ( int[] size : sizes ) {
            int temp_max = Math.max(size[0], size[1]);
            int temp_min = Math.min(size[0], size[1]);
            
            if ( temp_max > max )
                max = temp_max;
            
            if ( temp_min > min )
                min = temp_min;
        }
        
        return max*min;
    }
}
