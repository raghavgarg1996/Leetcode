public class Search_In_Rotated_Sorted_Array_II {

    public static boolean search(int[] nums, int target) {

        boolean k = false;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                k = true;
            }
        }

        return k;
    }

    public static void main(String[] args) {

        int[] nums = {2, 5, 6, 0, 0, 1, 2};
        int target = 0;
        System.out.println(search(nums, target));
    }
}
