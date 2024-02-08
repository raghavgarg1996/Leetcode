import java.util.HashSet;

public class Largest_Positive_Integer_that_exist_With_Negative {

    public static int findMaxK(int[] nums) {

        HashSet<Integer> hs = new HashSet<>();
        int maxVal = -1;

        for (int i = 0; i < nums.length; i++) {
            int x = -1 * nums[i];

            if (hs.contains(x)) {
                if (Math.abs(x) > maxVal) {
                    maxVal = Math.abs(x);
                }
            } else {
                hs.add(nums[i]);
            }
        }
        return maxVal;
    }

    public static void main(String[] args) {

        int[] nums = {34, 1, 48, 12, -1, 32, -34};
        System.out.println(findMaxK(nums));
    }
}
