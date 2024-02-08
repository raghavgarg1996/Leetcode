public class Calculate_Money_In_Leetcode_Bank {

    public static int totalMoney(int n) {
        int weeks = n / 7; // Calculate the number of full weeks
        int leftoverDays = n % 7; // Calculate the number of days left after full weeks
        int total = 0;

        // Calculate the total for complete weeks
        for (int i = 1; i <= weeks; i++) {
            total += (i + i + 6) * 7 / 2; // Arithmetic series formula: Sum of an arithmetic series
        }

        // Calculate the total for the remaining days
        int startingMoney = weeks + 1; // Money starts from the next week
        for (int i = 0; i < leftoverDays; i++) {
            total += startingMoney + i;
        }

        return total;
    }

    public static void main(String[] args) {
        int n = 20;
        System.out.println(totalMoney(n));
    }
}