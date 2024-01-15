import java.util.ArrayList;
import java.util.Arrays;

public class Largest_Odd_Number_In_String {

    public static String largestOddNumber(String num) {

        int[] arr = new int[num.length()];
        ArrayList<Integer> ls = new ArrayList<>();

        if (Integer.parseInt(num) % 2 != 0) {
            return num;
        }

        for (int i = 0; i < num.length(); i++) {
            int integerValue = Character.getNumericValue(num.charAt(i));
            arr[i] = integerValue;
        }

        Arrays.sort(arr);

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                ls.add(arr[i]);
            }
        }

        if (ls.isEmpty()) {
            return "";
        } else {
            return Integer.toString(ls.get(0));
        }

    }

    public static void main(String[] args) {

        String nums = "4206";
        System.out.println(largestOddNumber(nums));
    }
}
