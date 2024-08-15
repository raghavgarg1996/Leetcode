import java.util.HashMap;

public class Lemonade_Change {

    public static boolean lemonadeChange(int[] bills) {

        int count5 = 0;
        int count10 = 0;

        HashMap<Integer, Integer> hm = new HashMap<>();

        for (int i = 0; i < bills.length; i++) {

            if (bills[i] == 5) {
                count5++;
            } else if ((bills[i] == 10)) {
                count10++;
                count5--;
            } else {
                if (count10>0) {
                    count10--;
                    count5--;
                } else {
                    count5 -= 3;
                }
            }

            if (count5 < 0) {
                return false;
            }
        }
        return true;
    }


    public static void main(String[] args) {

        int[] bills = {5, 5, 10, 10, 20};
        System.out.println(lemonadeChange(bills));
    }
}
