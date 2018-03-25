import java.math.*;

public class L031_primeNumbers {

    public static void main(String[] args) {
        //long startTime = System.currentTimeMillis();
        System.out.println(primesDecreaseSum(5));
        //System.out.println("Time to execute was: " + (System.currentTimeMillis() - startTime) + " milliseconds");
    }

    // функция, которая принимает число, и возвращает сумму всех простых чисел меньше заданного.
    public static int primesDecreaseSum(int primeCandidateInput) {

        int decreasePrimeSumOut = 0;

        int decreaseCounter = primeCandidateInput;
        int primeCandidate = primeCandidateInput;

        for (int i = decreaseCounter - 1; i >= 2; i--) {

            BigInteger bi = BigInteger.valueOf(primeCandidate);
            boolean isPrime = bi.isProbablePrime(100);

            if (isPrime) {
                decreasePrimeSumOut = decreasePrimeSumOut + primeCandidate;
            }

            System.out.println("primeCandidate: " + primeCandidate + "; is prime: " + isPrime + "; decreasePrimeSumOut: " + decreasePrimeSumOut);
            decreaseCounter = decreaseCounter - 1;
            primeCandidate = primeCandidate - 1;

        }

        return decreasePrimeSumOut;
    }

}
