import java.util.ArrayList;
import java.util.*;

public class Product_Of_Array_Except_Self {

    public static int eleminateVal(int[] val, int rem) {
        int out = 1;
        ArrayList<Integer> ls = new ArrayList<>();

        for (int i = 0; i < val.length; i++) {
            if ((i != rem)) {
                ls.add(val[i]);
            }
        }

        for (int i = 0; i < ls.size(); i++) {
            out = out * ls.get(i);
        }

        return out;
    }

    public static int[] productExceptSelf(int[] nums) {

        List<Integer> ls = new ArrayList<>();
        int[] prodElements = new int[nums.length - 1];
        int[] finalArray = new int[nums.length];
        int product = 1;

        for (int i = 0; i < nums.length; i++) {
            ls.add(eleminateVal(nums, i));
        }

        for (int i = 0; i < ls.size(); i++) {
            finalArray[i] = ls.get(i);
        }

        return finalArray;
    }

    public static void main(String[] args) {
        int[] nums = {-1, 1, 0, -3, 3};
        int[] out = new int[nums.length];
        out = productExceptSelf(nums);

        for (int i = 0; i < out.length; i++) {
            System.out.print(out[i] + " ");
        }
    }
}
