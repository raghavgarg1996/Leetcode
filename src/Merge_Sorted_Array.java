import java.util.Arrays;

public class Merge_Sorted_Array {

    public static void merge(int[] nums1, int m, int[] nums2, int n) {

        for (int i=m; i<nums1.length; i++) {
            if (nums1[i]==0) {
                nums1[i] = nums2[i-m];
            }
        }

        Arrays.sort(nums1);

        for (int i=0; i<nums1.length; i++) {
            System.out.print(nums1[i] + " " );
        }
    }

    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3, 0, 0, 0};
        int[] nums2 = {2, 5, 6};
        int m = 3;
        int n = 3;

        merge(nums1, m, nums2, n);
    }
}
