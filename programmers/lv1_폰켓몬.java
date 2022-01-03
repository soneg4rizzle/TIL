package programmers;
<<<<<<< HEAD
<<<<<<< HEAD

public class lv1_ÆùÄÏ¸ó {

=======
import java.util.HashSet;

public class lv1_ÆùÄÏ¸ó {
	public int solution(int[] nums) {
        // N¸¶¸® ÆùÄÏ¸óÀÇ Á¾·ù ¹øÈ£°¡ ´ã±ä ¹è¿­ nums
        
        // ¹®Á¦ : N/2¸¶¸®ÀÇ ÆùÄÏ¸óÀ» ¼±ÅÃÇÏ´Â ¹æ¹ý Áß,
        // °¡Àå ¸¹Àº Á¾·ùÀÇ ÆùÄÏ¸óÀ» ¼±ÅÃÇÏ´Â ¹æ¹ýÀ» Ã£¾Æ,
        // ±×¶§ÀÇ ÆùÄÏ¸ó Á¾·ù ¹øÈ£ÀÇ °³¼ö¸¦ return.
                
        int answer = 0;
        int N = nums.length/2;
    
        HashSet<Integer> hs = new HashSet<Integer>();
        
        for ( int i = 0; i < nums.length; i++ ) {  // Æ÷ÄÏ¸óÀÇ Á¾·ù¸¦ HashSet¿¡ ³Ö¾îÁØ´Ù.
            if ( !hs.contains(nums[i]) ) {
                hs.add(nums[i]);
            }
        }
        
        if ( hs.size() < N ) { // HashSetÀÇ Å©±â°¡ Nº¸´Ù ÀÛÀ¸¸é »ÌÀ» ¼ö ÀÖ´Â Æ÷ÄÏ¸ó Á¾·ùÀÇ ¼ö´Â HashSet ÀÇ Å©±â¿Í µ¿ÀÏÇÏ´Ù.
            return hs.size();
        } else {
            return N; // HashSetÀÇ Å©±â°¡ Nº¸´Ù Å©°Å³ª °°À¸¸é »ÌÀ» ¼ö ÀÖ´Â Æ÷ÄÏ¸ó Á¾·ùÀÇ ¼ö´Â N°ú °°´Ù.
        }
    }
>>>>>>> 94a526742027e983494cc284430202e27c1faf41
=======

public class lv1_ÆùÄÏ¸ó {

>>>>>>> parent of 44403cc (í”„ë¡œê·¸ëž˜ë¨¸ìŠ¤ LV1_ì‹¤íŒ¨ìœ¨ | +a)
}
