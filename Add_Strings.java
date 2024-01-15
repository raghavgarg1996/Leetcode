import java.math.BigInteger;

public class Add_Strings {

    public static String addStrings(String num1, String num2) {
        BigInteger bigint1 = new BigInteger(num1);
        BigInteger bigint2 = new BigInteger(num2);
        BigInteger sum = bigint1.add(bigint2);
        return sum.toString();
    }

    public static void main(String[] args) {
        String num1 = "3876620623801494171";
        String num2 = "6529364523802684779";
        System.out.println(addStrings(num1, num2));
    }
}
