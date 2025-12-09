public class MultiplesOf3Or5 {

    /**
     * If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3,5,6 and 9. The sum of these multiples is 23.
     * Find the sum of all the multiples of 3 or 5 below 1000.
     *
     * @param max
     * @return
     */
    public static Integer getMultiplesOf3_Or_5(Integer max){
        if( max == null ){
            return max;
        }
        /**
         * S    =  ( n * ( a(1) + a(n) ) ) / 2
         */
        Integer for3 = ( ( getNTimesLargest( 3, max) * ( 3 + getLargestMultiple(3, max) ) ) / 2 );
        Integer for5 = ( (  getNTimesLargest( 5, max) * ( 5 + getLargestMultiple(5, max) ) ) / 2);
        Integer for15 = ( (  getNTimesLargest( 15, max) * ( 15 + getLargestMultiple(15, max) ) ) / 2 );

        return (for3 + for5) - for15;
    }

    
    /**
     * to get the largest value multiple
     *
     * @param m
     * @param N
     * @return
     */
    private static Integer getLargestMultiple(int m, int N){
        return m * getNTimesLargest(m, N);
    }

    /**
    * Provide the NTimesLargestNumber
    */
    private static Integer getNTimesLargest(int m, int N){
        return ( N - 1 ) / m; //below N
    }

}
