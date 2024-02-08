public class Find_The_Middle_Index_In_Array {

    public static int findMiddleIndex(int[] nums) {

        int[] leftSum = new int[nums.length];
        int[] rightSum = new int[nums.length];
        int sum = 0;

        leftSum[0] = 0;
        rightSum[nums.length - 1] = 0;

        for (int i = 1; i < nums.length; i++) {
            sum = sum + nums[i - 1];
            leftSum[i] = sum;
        }

        printArr(leftSum);

        sum = 0;
        for (int i = nums.length - 2; i >= 0; i--) {
            sum = sum + nums[i + 1];
            rightSum[i] = sum;
        }
        printArr(rightSum);


        for (int i=0; i< nums.length; i++) {
            if (leftSum[i]==rightSum[i]) {
                return i;
            }
        }
        return -1;
    }

    public static void printArr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }


    public static void main(String[] args) {

        int[] arr = {2, 3, -1, 8, 4};
        System.out.println(findMiddleIndex(arr));
    }
}
