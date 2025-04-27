public class Count_Subarray_Of_Length_Three_With_condition {

    public static int countSubarrays(int[] nums) {

        int count = 0;

        for (int i = 0; i <= nums.length - 3; i++) {
            int first = nums[i];
            int middle = nums[i + 1];
            int third = nums[i + 2];

            if (2 * (first + third) == middle) {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {

        int[] nums = {7, 8, -3};
        System.out.println(countSubarrays(nums));
    }
}
