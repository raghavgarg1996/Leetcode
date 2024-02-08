public class Power_Of_Four {

    public static boolean isPowerOfFour(int n) {
        if (n <= 0) {
            return false;
        }

        while (n > 1) {
            if (n % 4 != 0) {
                return false;
            }
            n /= 4;
        }

        return n == 1;
    }


    public static void main(String[] args) {

        int n = 5;
        System.out.println(isPowerOfFour(n));
    }
}
