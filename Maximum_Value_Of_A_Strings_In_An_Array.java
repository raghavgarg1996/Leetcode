
public class Maximum_Value_Of_A_Strings_In_An_Array {

    public static int maximumValue(String[] strs) {

        int maxSize = 0;
        int nums = 0;
        for (int i = 0; i < strs.length; i++) {
            String k = strs[i];

            try {
                nums = Integer.parseInt(k);
            } catch (NumberFormatException e) {
                if (k.length() > maxSize) {
                    maxSize = k.length();
                }
            }

            if (nums > maxSize) {
                maxSize = nums;
            }
        }
        return maxSize;
    }

    public static void main(String[] args) {

        String[] strs = {"1", "01", "001", "0001"};
        System.out.println(maximumValue(strs));
    }
}
