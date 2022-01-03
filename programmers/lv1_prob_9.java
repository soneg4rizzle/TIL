package programmers;

public class lv1_prob_9 {
	public int solution(int[] nums) {
        int answer = 0;
        int atm = combination(nums);
        int prime_arr[];
        prime_arr = makePrimeArray(nums, atm);
       
        for ( int i = 0; i < prime_arr.length; i++ ) {
            if ( isPrime(prime_arr[i]) ) {
                answer++;
            }
        }
        return answer;
    }
    
    public int combination(int[] nums) { // 3���� ���ڸ� ���ؼ� ���� �� �ִ� �� ������ ������ ���ϴ� �޼ҵ�
        int n = nums.length;
        int sum = n*(n-1)*(n-2) / 6;
        return sum;
    }
    
    public int[] makePrimeArray(int[] arr, int n) { // 3���� ���� ���� ������� ���� �ִ� �迭�� ����� �޼ҵ�
        int p_arr[] = new int[n];
        int a = 0;
        for ( int i = 0; i < arr.length-2; i++ ) {
            for  ( int j = 1; j < arr.length-1; j++ ) {
                for ( int k = 2; k < arr.length; k++ ) {
                    if ( i < j && j < k ) {
                        p_arr[a] = arr[i] + arr[j] + arr[k];
                        a++;
                    }
                }        
            }   
        }
        return p_arr;
    }
    
    public boolean isPrime(int num) { // �Ҽ����� Ȯ���ϴ� �޼ҵ�
        if ( num < 2 ) // 2���� ������ �Ҽ��� �ƴϹǷ� false
            return false;
        for ( int i = 2; i*i <= num; i++ ) { // �ش� ������ �����ٱ��� Ȯ��
            if ( num%i == 0 )
                return false;
        } return true;
    }
}
