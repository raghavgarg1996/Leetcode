public class Reduce_Operation_To_Make_Array_Element_Equal {

    static int opera = 0;

    public static int largestEle(int[] nums) {

        int maxValue = nums[0];
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > maxValue) {
                maxValue = nums[i];
            }
        }
        return maxValue;
    }

    public static int secondLarge(int[] nums, int max) {

        int second = 0;

        for (int i = 0; i < nums.length; i++) {
            if ((nums[i] > second) && (nums[i] != max)) {
                second = nums[i];
            }
        }
        return second;
    }

    public static int similarElementCount(int[] nums) {
        int arrayCount = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == nums[i + 1]) {
                arrayCount++;
            }
        }
        return arrayCount;
    }

    public static int reductionOperations(int[] nums) {

        int arrayCount = similarElementCount(nums);

        if (arrayCount + 1 == nums.length) {
            return opera;
        } else {
            int maxValue = largestEle(nums);
            int secondMax = secondLarge(nums, maxValue);

            int[] arr = new int[nums.length];
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] == maxValue) {
                    arr[i] = secondMax;
                    opera++;
                } else {
                    arr[i] = nums[i];
                }
            }
            opera = reductionOperations(arr);
        }
        return opera;
    }

    public static void main(String[] args) {

        int[] nums = {5, 1, 3};
        System.out.println(reductionOperations(nums));
    }
}
