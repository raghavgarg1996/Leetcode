public class Left_and_Right_Sum_Diffrence {

    public static int[] leftRigthDifference(int[] nums) {

        int[] leftSumArr = new int[nums.length];
        int[] rightSumArr = new int[nums.length];
        int[] diffSum = new int[nums.length];

        leftSumArr[0] =0;
        rightSumArr[nums.length-1] =0;

        for (int i=0; i<nums.length-1; i++) {
            leftSumArr[1+i] = leftSumArr[i]+nums[i];
        }

        for (int i=1; i<nums.length; i++) {
            rightSumArr[nums.length-1-i] = rightSumArr[nums.length-i] + nums[nums.length-i];
        }

        for (int i=0; i<nums.length; i++) {
            diffSum[i] = Math.abs(leftSumArr[i] - rightSumArr[i]);
        }


        return diffSum;
    }

    public static void main(String[] args) {
        int[] arr = {10,4,8,3};

        int[] sol = leftRigthDifference(arr);

        for (int i=0; i<sol.length; i++) {
            System.out.println(sol[i]);
        }
    }
}
