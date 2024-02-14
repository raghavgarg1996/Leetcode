import java.util.*;

public class Convert_An_Array_Into_2D_Arrays_With_conditions {

    public static List<List<Integer>> findMatrix(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        int[] count = new int[nums.length + 1];

        for (final int num : nums) {
            // Construct `ans` on demand.
            if (++count[num] > ans.size())
                ans.add(new ArrayList<>());
            ans.get(count[num] - 1).add(num);
        }

        return ans;
    }


    public static void main(String[] args) {

        int[] nums = {1, 3, 4, 1, 2, 3, 1};
        List<List<Integer>> ls = findMatrix(nums);
        System.out.println(ls);
    }
}
