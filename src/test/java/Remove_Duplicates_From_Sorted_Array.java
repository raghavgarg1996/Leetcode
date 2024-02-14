import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;

public class Remove_Duplicates_From_Sorted_Array {

    public static int removeDuplicates(int[] nums) {

        int val =0;
        HashSet<Integer> hs = new HashSet<>();
        for (int i=0; i<nums.length; i++) {
            hs.add(nums[i]);
        }

        ArrayList arrayList = new ArrayList(hs);
        Collections.sort(arrayList);

        for (int i=0; i<arrayList.size(); i++) {
            nums[i] = (int) arrayList.get(i);
        }

   /*     Iterator<Integer> itr=hs.iterator();
        while(itr.hasNext()) {
            nums[val] = itr.next();
            val++;
        }  */

        return hs.size();
    }

    public static void main(String[] args) {
        int[] nums = {1, 1, 2};
        int k = removeDuplicates(nums);
        System.out.println(k);
    }
}
