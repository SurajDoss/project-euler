/**
 * <p>The prime factors of $13195$ are $5, 7, 13$ and $29$.</p>
 * <p>What is the largest prime factor of the number $600851475143$?</p>
 */
public class LargestPrimeFactor {
    /**
     *
     * @return
     */
    public static Long largestPrimeFactor() {

        Long largestPrime       = 1L;
        Long N                  = 600851475143L;

        //we remove the 2 factor here
        while( N % 2 == 0){
            largestPrime = 2L;
            N /= 2;
        }

        //check the odd factors upro roon N
        for(Long i = 3L; i * i <= N ; i += 2 ){
            while( N % i == 0){
                largestPrime = i;
                N /= i;
            }
        }

        //if reminder is prime
        if (N > 1) {
            largestPrime = N;
        }

        return largestPrime;
    }
}
