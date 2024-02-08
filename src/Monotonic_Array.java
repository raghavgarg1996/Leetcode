import java.util.HashSet;

public class Monotonic_Array {

    public static boolean isMonotonic(int[] nums) {

        HashSet<Integer> hs = new HashSet<>();
        boolean k = false;

        int pos = 0;
        int neg = 0;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] - nums[i - 1] > 0) {
                pos++;
            } else if (nums[i] - nums[i - 1] == 0) {

            } else {
                neg++;
            }
        }

        for (int i = 0; i < nums.length; i++) {
            hs.add(nums[i]);
        }

        if (pos == hs.size() - 1 || neg == hs.size() - 1) {

            if ((pos > 0) && (neg == 0)) {
                k = true;
            }

            if ((neg > 0) && (pos == 0)) {
                k = true;
            }

            if ((neg == 0) && (pos == 0)) {
                k = true;
            }

        }

        return k;
    }

    public static void main(String[] args) {

        int[] nums = {3, 4, 2, 3};
        System.out.println(isMonotonic(nums));
    }
}
