public class Sum_Multiples {

    public static int sumOfMultiples(int n) {

        int count = 0;
        int k = 0;
        int l = 0;

        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0) {
                k = i;
                count = count + i;
            }
            if ((i % 5 == 0) && (i != k)) {
                l = i;
                count = count + i;
            }
            if ((i % 7 == 0) && (i != k) && (i != l)) {
                count = count + i;
            }
        }

        return count;
    }

    public static void main(String[] args) {

        int n = 15;
        System.out.println(sumOfMultiples(n));
    }
}
