import java.util.Arrays;

public class Reduce_Operation_To_Make_Array_Element_Equal_Optimized {

    public static int reductionOperations(int[] nums) {
        Arrays.sort(nums);
        int operations = 0;
        int totalOps = 0;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {
                operations++;
            }
            totalOps += operations;
        }
        return totalOps;
    }

    public static void main(String[] args) {
        int[] nums = { /* Your large input array here */ };
        System.out.println(reductionOperations(nums));
    }
}
