import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Closest_Prime_Numbers_In_Range {

    public static int[] closestPrimes(int left, int right) {


        List<Integer> ls = sieveOfEratosthenes(left, right);
        int[] arr = new int[2];

        int x = 0;
        int y = ls.size() - 1;
        int val = right;
        int finalX = 0;
        int finaly = 0;

        while (x < y) {
            int k = ls.get(y) - ls.get(x);

            if (k < val) {
                val = k;
                finalX = x;
                finaly = y;
            } else {
                y--;
            }
        }

        if (finalX != finaly) {
            arr[0] = ls.get(finalX);
            arr[1] = ls.get(finaly);
        } else {
            arr[0] = -1;
            arr[1] = -1;
        }

        return arr;
    }


    public static List<Integer> sieveOfEratosthenes(int start, int end) {
        if (start > end || end < 2) {
            return new ArrayList<>(); // Return empty list if range is invalid
        }

        boolean[] primes = new boolean[end + 1];
        Arrays.fill(primes, true);
        primes[0] = primes[1] = false; // 0 and 1 are not prime

        for (int p = 2; p * p <= end; p++) {
            if (primes[p]) {
                for (int multiple = p * p; multiple <= end; multiple += p) {
                    primes[multiple] = false; // Mark multiples of p as non-prime
                }
            }
        }

        // Collecting prime numbers within the given range into a list
        List<Integer> primeNumbers = new ArrayList<>();
        for (int i = Math.max(start, 2); i <= end; i++) {
            if (primes[i]) {
                primeNumbers.add(i);
            }
        }
        return primeNumbers;
    }

    public static void main(String[] args) {

        int left = 19;
        int right = 31;
        int[] sol = closestPrimes(left, right);

        for (int i = 0; i < sol.length; i++) {
            System.out.print(sol[i] + " ");
        }
    }
}
