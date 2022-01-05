package programmers;

public class LV1_�ּ����簢��2 {
    public int solution(int[][] sizes) {
        // Math.max / Math.min �� �̿��� Ǫ�� ���
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
