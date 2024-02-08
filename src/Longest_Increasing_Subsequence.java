public class Longest_Increasing_Subsequence {

    public static int lengthOfLIS(int[] nums) {

        int maxCount = 0;

        for (int i = 0; i < nums.length; i++) {
            int k = nums[i];
            int count = 1;

            for (int j = i; j < nums.length; j++) {
                int val = nums[j];
                if (val > k) {
                    count++;
                    k = val;
                }
            }

            if (count > maxCount) {
                maxCount = count;
            }
        }

        return maxCount;
    }

    public static void main(String[] args) {

        int[] nums = {0, 1, 0, 3, 2, 3};
        System.out.println(lengthOfLIS(nums));
    }
}
