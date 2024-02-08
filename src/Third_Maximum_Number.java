public class Third_Maximum_Number {

    public static int thirdMax(int[] nums) {

        int max =Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;
        int thirdMax = Integer.MIN_VALUE;
        int count =0;

        if (nums.length == 1) {
            return nums[0];
        } else if (nums.length == 2) {
            if (nums[0] > nums[1]) {
                return nums[0];
            } else {
                return nums[1];
            }
        } else {
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] > max) {
                    max = nums[i];
                }
            }

            for (int i = 0; i < nums.length; i++) {
                if ((nums[i] > secondMax) && (nums[i] != max)) {
                    secondMax = nums[i];
                }
            }

            for (int i = 0; i < nums.length; i++) {
                if ((nums[i] >= thirdMax) && (nums[i] != max) && (nums[i] != secondMax)) {
                    thirdMax = nums[i];
                    count++;
                }
            }

            if ((thirdMax == Integer.MIN_VALUE) && (count==0)) {
                thirdMax = max;
            }

            return thirdMax;
        }


    }

    public static void main(String[] args) {

        int[] nums = {1,2,-2147483648};
        System.out.println(thirdMax(nums));
    }
}
