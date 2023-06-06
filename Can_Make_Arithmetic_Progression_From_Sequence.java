import java.util.Arrays;

public class Can_Make_Arithmetic_Progression_From_Sequence {

    public static boolean canMakeArithmeticProgression(int[] arr) {

        Arrays.sort(arr);
        int count =0;
        boolean val = false;
        int k = arr[1]-arr[0];
        for (int i=1; i<arr.length; i++) {
            if (arr[i]-arr[i-1]==k) {
                count++;
            }
        }

        if (count==arr.length-1) {
            val = true;
        }
        return val;
    }

    public static void main(String[] args) {
        int[] arr = {3,5,1};
        boolean k = canMakeArithmeticProgression(arr);
        System.out.println(k);
    }
}
