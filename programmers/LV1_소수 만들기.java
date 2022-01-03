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
    
    public int combination(int[] nums) { // 3개의 숫자를 더해서 구할 수 있는 총 숫자의 개수를 구하는 메소드
        int n = nums.length;
        int sum = n*(n-1)*(n-2) / 6;
        return sum;
    }
    
    public int[] makePrimeArray(int[] arr, int n) { // 3개의 수를 더해 만들어진 값이 있는 배열을 만드는 메소드
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
    
    public boolean isPrime(int num) { // 소수인지 확인하는 메소드
        if ( num < 2 ) // 2보다 작으면 소수가 아니므로 false
            return false;
        for ( int i = 2; i*i <= num; i++ ) { // 해당 숫자의 제곱근까지 확인
            if ( num%i == 0 )
                return false;
        } return true;
    }
}
