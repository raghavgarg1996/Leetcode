import java.util.Arrays;

public class Buy_Two_Chocolates {

    public static int buyChoco(int[] prices, int money) {

        Arrays.sort(prices);

        int x = 0;
        int y = prices.length - 1;
        int value = 0;

        while (x < y) {
            int sum = prices[x] + prices[y];

            if (sum <= money) {
                value = money - sum;
                y--;
            } else {
                value = money;
                y--;
            }
        }
        return value;
    }

    public static void main(String[] args) {

        int[] prices = {98, 54, 6, 34, 66, 63, 52, 39};
        int money = 62;

        System.out.println(buyChoco(prices, money));
    }
}
