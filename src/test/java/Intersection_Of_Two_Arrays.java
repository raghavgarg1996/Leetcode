import java.util.*;

public class Intersection_Of_Two_Arrays {

    public static int[] intersection(int[] nums1, int[] nums2) {

        HashSet<Integer> hs = new HashSet<>();
        ArrayList<Integer> ls = new ArrayList<>();


        for (int i = 0; i < nums1.length; i++) {
            hs.add(nums1[i]);
        }

        for (int i = 0; i < nums2.length; i++) {
            if (hs.contains(nums2[i])) {
                ls.add(nums2[i]);
                hs.remove(nums2[i]);
            }
            if (hs.size() == 0) {
                break;
            }
        }

        int[] sol = new int[ls.size()];

        for (int i = 0; i < ls.size(); i++) {
            sol[i] = ls.get(i);
        }

        return sol;
    }

    public static void main(String[] args) {

        int[] nums1 = {1, 2, 2, 1};
        int[] nums2 = {2, 2};
        int[] nums3 = intersection(nums1, nums2);

        for (int i = 0; i < nums3.length; i++) {
            System.out.print(nums3[i] + " ");
        }
    }
}
