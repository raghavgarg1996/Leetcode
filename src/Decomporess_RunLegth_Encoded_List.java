import java.util.ArrayList;

public class Decomporess_RunLegth_Encoded_List {

    public static int[] decompressRLElist(int[] nums) {

        int j = 0;
        int k = nums.length - 1;

        ArrayList<Integer> ls = new ArrayList<>();

        while (j <= k) {
            int val1 = nums[j];
            int val2 = nums[j + 1];

            for (int m = 0; m < val1; m++) {
                ls.add(val2);
            }

            j = j + 2;
        }

        int[] arr = new int[ls.size()];

        for (int f = 0; f < ls.size(); f++) {
            arr[f] = ls.get(f);
        }

        return arr;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4};
        int[] output = decompressRLElist(nums);

        for (int i = 0; i < output.length; i++) {
            System.out.print(output[i] + " ");
        }
    }
}
