import java.util.Arrays;

public class Partition_Equal_Subset_Sum {

    public static boolean canPartition(int[] nums) {
        Arrays.sort(nums);

        int x = 0;
        int y = nums.length - 1;

        int maxValue = nums[y];
        int totalSum = 0;

        while (x <= y) {
            if (maxValue > totalSum) {
                totalSum = totalSum + nums[x];
                x++;
            } else if (maxValue == totalSum) {
                return true;
            } else {
                maxValue = maxValue + nums[y];
                y--;
            }
        }

        return false;
    }

    public static void main(String[] args) {

        int[] nums = {1, 1, 1, 1};

        System.out.println(canPartition(nums));
    }
}
