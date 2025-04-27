import java.util.HashSet;

public class Count_Complete_SubArray_In_An_Array {

    public static int countCompleteSubarrays(int[] nums) {

        HashSet<Integer> hs = new HashSet<>();
        HashSet<Integer> hs2 = new HashSet<>();

        for (int i = 0; i < nums.length; i++) {
            hs.add(nums[i]);
        }

        int k = 0;
        int l = 0;

        while (l < nums.length) {

            for (int i = k; i < l; i++) {

            }
        }
        return 1;
    }

    public static void main(String[] args) {

        int[] nums = {1, 3, 1, 2, 2};
        System.out.println(countCompleteSubarrays(nums));
    }
}
