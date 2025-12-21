public class Main {
    public static void main(String[] args) {
        System.out.printf("Hello and welcome!");

       Integer sum  = MultiplesOf3Or5.getMultiplesOf3_Or_5(1000);
       System.out.printf("Multiples of 3 or 5 :: " + sum);

        Integer EvenFibonacciNumber  = EvenFibonacciNumbers.calculateTheSumEvenFiboncciNumbers(4000000);
        System.out.printf("Sum of even fibonacci Number :: " + EvenFibonacciNumber);

        Long largestPrimeFactor = LargestPrimeFactor.largestPrimeFactor();
        System.out.printf("Largest Prime Factor ::: " + largestPrimeFactor);

    }
}
