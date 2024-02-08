import java.util.Arrays;

public class Maximum_Product_Of_Two_Elements_In_An_Array {

    public static int maxProduct(int[] nums) {
        Arrays.parallelSort(nums);
        int length = nums.length;

        int first = (nums[length-1] - 1) ;

        int second =  (nums[length - 2]-1);

        int k = first* second;
        return k;
    }

    public static void main(String[] args) {

        int[] nums = {3, 4, 5, 2};
        System.out.println(maxProduct(nums));
    }
}
