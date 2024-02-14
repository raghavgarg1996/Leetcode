public class Rotate_Array {

    public static void rotate(int[] nums, int k) {
        int[] out = new int[nums.length];
        for (int i=0; i<k; i++) {
            if (i==0) {
                out=funcRot(nums);
            } else {
                out=funcRot(out);
            }

        }

        for (int i=0; i<nums.length; i++) {
            if ((nums.length!=1) && (k!=0))  {
                nums[i] = out[i];
            }
        }
    }

    public static int[] funcRot(int[] arr) {
        int[] sol = new int[arr.length];
        sol[0] = arr[arr.length-1];

        for (int i=0; i<arr.length-1; i++) {
            sol[i+1] = arr[i];
        }

        return sol;
    }

    public static void main (String[] args) {
        int[] nums = {1};
        int k = 0;
        rotate(nums, k);
    }
}
