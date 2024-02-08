public class Longest_subArray_Of_1s_After_Deleting_One_Array {

    public static int longestSubarray(int[] nums) {

        int x=0;
        int y=0;
        int z=0;
        int maxSubarrayCount=0;
        int count=0;

        while (y<nums.length) {
            if (nums[y]==1) {
                count++;
                y++;
                if (count>maxSubarrayCount) {
                    maxSubarrayCount = count;
                }
            } else if ((nums[y]==0) && (z==0) && y!=0) {
                z=y;
                y++;
            } else {
                x=z;
                z=y;
                y++;
                count=count-x-1;
                if (count<0) {
                    count=0;
                }
                z=0;
            }
        }

        if (maxSubarrayCount == nums.length) {
            return maxSubarrayCount-1;
        }
        return maxSubarrayCount;
    }

    public static void main (String[] args) {

        int[] nums = {1,0,1,1,1,1,1,1,0,1,1,1,1,1};
        System.out.println(longestSubarray(nums));
    }
}
