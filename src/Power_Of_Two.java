public class Power_Of_Two {

    public static boolean isPowerOfTwo(int n) {
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
        System.out.println(isPowerOfTwo(n));
    }
}
