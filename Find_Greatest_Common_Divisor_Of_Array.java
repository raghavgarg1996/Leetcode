public class Find_Greatest_Common_Divisor_Of_Array {

    public static int findGCD(int[] nums) {

        int maxValue =0;
        int minValue = 99999;
        int hcf =0;

        for (int i=0; i<nums.length; i++) {
            if (nums[i]>maxValue) {
                maxValue =  nums[i];
            }
        }

        for (int i=0; i<nums.length; i++) {
            if (nums[i]<minValue) {
                minValue = nums[i];
            }
        }


        for (int i=1; i<=minValue|| i<=maxValue; i++) {
            if ((minValue % i ==0) && (maxValue % i ==0)) {
                hcf = i;
            }
        }

        return hcf;
    }

    public static  void main (String[] args) {

        int[] nums = {2,5,6,9,10};
        System.out.println(findGCD(nums));
    }
}
