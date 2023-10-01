import java.util.*;

public class Two_out_of_three {

    public static List<Integer> twoOutOfThree(int[] nums1, int[] nums2, int[] nums3) {

        HashSet<Integer> hs = new HashSet<>();
        List<Integer> ls = new ArrayList<>();


        for (int i=0; i<nums1.length; i++) {
            hs.add(nums1[i]);
        }

        for (int i=0; i<nums2.length; i++) {
            if (hs.contains(nums2[i])) {
                if (!ls.contains(nums2[i])) {
                    ls.add(nums2[i]);
                }
            } else {
                hs.add(nums2[i]);
            }
        }


        for (int i=0; i<nums3.length; i++) {
            if (hs.contains(nums3[i])) {
                if (!ls.contains(nums3[i])) {
                    ls.add(nums3[i]);
                }
            }
        }

        return ls;
    }

    public static void main(String[] args) {

        int[] nums1 = {1,2,2};
        int[] nums2 = {4,3,3};
        int[] nums3 = {5};

        System.out.println(twoOutOfThree(nums1, nums2, nums3));
    }
}
