public class Happy_Number {

    public static boolean isHappy(int n) {

        boolean output = false;

        while (n>0) {
            int f = n % 10;
            if (n<10) {
                n = n*n + f*f;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int n =19;
        boolean k = isHappy(n);
        System.out.println(k);
    }
}
