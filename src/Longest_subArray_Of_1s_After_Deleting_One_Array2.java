public class Longest_subArray_Of_1s_After_Deleting_One_Array2 {

    public static int longestSubarray(int[] nums) {

        int x=1;
        int y=1;
        int z=0;
        int maxSubarrayCount=0;
        int count=0;

        while (y<=nums.length) {
            if (nums[y-1]==1) {
                count++;
                if (count>maxSubarrayCount) {
                    maxSubarrayCount = count;
                }
                y++;
            } else if ((nums[y-1]==0) && (z==0) && y-1!=0) {
                z=y;
                y++;
            } else {
                x=z;
                z=y;
                count=count-x;
                if (count<0) {
                    count=0;
                }
                y++;
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
