import java.util.Arrays;

public class Increasing_Triplet_Susequences {

    public static boolean increasingTriplet(int[] nums) {

        int firstMin = Integer.MAX_VALUE;
        int secondMin = Integer.MAX_VALUE;

        for (int num : nums) {
            if (num <= firstMin) {
                firstMin = num;
            } else if (num <= secondMin) {
                secondMin = num;
            } else {
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {

        int[] nums = {1, 5, 0, 4, 1, 3};
        System.out.println(increasingTriplet(nums));
    }
}
