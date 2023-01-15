public class Max_Count_Of_Pos_Integer_and_Neg_Integer {
    public int maximumCount(int[] nums) {

        int posCount =0;
        int negCount =0;
        int maxCount =0;
        for (int i=0; i<nums.length; i++) {
            if (nums[i]>0) {
                posCount++;
            } else if (nums[i]<0) {
                negCount++;
            }
        }

        maxCount = Math.max(negCount, posCount);

        return maxCount;
    }
}
