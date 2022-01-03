package programmers;

public class lv1_Ű�е�_������ {
	 public String solution(int[] numbers, String hand) {
	        int nl = numbers.length;
	        int l_loc = 10;
	        int r_loc = 11;
	        StringBuilder sb = new StringBuilder();
	        
	        int dist[][] = {{0, 4, 3, 4, 3, 2, 3, 2, 1, 2, 1, 1},
	                        {4, 0, 1, 2, 1, 2, 3, 2, 3, 4, 3, 5},
	                        {3, 1, 0, 1, 2, 1, 2, 3, 2, 3, 4, 4},
	                        {4, 2, 1, 0, 3, 2, 1, 4, 3, 2, 5, 3},
	                        {3, 1, 2, 3, 0, 1, 2, 1, 2, 3, 2, 4},
	                        {2, 2, 1, 2, 1, 0, 1, 2, 1, 2, 3, 3},
	                        {3, 3, 2, 1, 2, 1, 0, 3, 2, 1, 4, 2},
	                        {2, 2, 3, 4, 1, 2, 3, 0, 1, 2, 1, 3},
	                        {1, 3, 2, 3, 2, 1, 2, 1, 0, 1, 2, 2},
	                        {2, 4, 3, 2, 3, 2, 1, 2, 1, 0, 3, 1},
	                        {1, 3, 4, 5, 2, 3, 4, 1, 2, 3, 0, 2},
	                        {1, 5, 4, 3, 4, 3, 2, 3, 2, 1, 2, 0}};
	        
	        for ( int i = 0; i < nl; i++ ) {
	            if ( numbers[i] == 1 || numbers[i] == 4 || numbers[i] == 7 ) {
	                sb.append("L");
	                l_loc = numbers[i];
	            } else if ( numbers[i] == 3 || numbers[i] == 6 || numbers[i] == 9 ) {
	                sb.append("R");
	                r_loc = numbers[i];
	            } else if ( l_loc == 1 && r_loc == 3 || l_loc == 4 && r_loc == 6 || l_loc == 7 && r_loc == 9 ) {
	                System.out.println("���ʼ�: " + l_loc + "/ �����ʼ�: " + r_loc + "/ �� ��ġ: "+ hand);
	                if ( hand.equals("left")) {
	                    sb.append("L");
	                    l_loc = numbers[i];
	                } else {
	                    sb.append("R");   
	                    r_loc = numbers[i];
	                } 
	            } else {
	                if ( dist[l_loc][numbers[i]] > dist[r_loc][numbers[i]] ) {
	                    sb.append("R");
	                    r_loc = numbers[i];
	                }
	                else if ( dist[l_loc][numbers[i]] < dist[r_loc][numbers[i]] ) {
	                    sb.append("L");
	                    l_loc = numbers[i];
	                }
	                else {
	                    System.out.println(hand);
	                    if ( hand.equals("left") ) {
	                        System.out.println("h == left �´�");
	                        sb.append("L");
	                        l_loc = numbers[i];
	                    } else {
	                        System.out.println("h == right �´�");
	                        sb.append("R");
	                        r_loc = numbers[i];
	                    }
	                }
	            }
	            
	            System.out.println("�޼�: " + l_loc + " / ������: " + r_loc);
	        }
	        
	        return sb.toString();
	    }
}
