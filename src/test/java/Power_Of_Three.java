public class Power_Of_Three {

    public static boolean isPowerOfThree(int n) {
        if (n <= 0) {
            return false;
        }

        while (n > 1) {
            if (n % 3 != 0) {
                return false;
            }
            n /= 3;
        }

        return n == 1;
    }

    public static void main(String[] args) {

        int n = 5;
        System.out.println(isPowerOfThree(n));
    }
}
