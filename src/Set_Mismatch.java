import java.util.HashSet;

public class Set_Mismatch {

    public static int[] findErrorNums(int[] nums) {

        HashSet<Integer> hs = new HashSet<>();

        int[] arr = new int[2];

        for (int i = 0; i < nums.length; i++) {
            hs.add(nums[i]);
        }


        return arr;
    }

    public static void main(String[] args) {

        int[] nums = {1, 2, 2, 4};
        int[] output = findErrorNums(nums);

        for (int i = 0; i < output.length; i++) {
            System.out.print(output[i] + " ");
        }
    }
}
