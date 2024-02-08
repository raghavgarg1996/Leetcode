public class Minimum_Changes_To_Make_Alternating_Binary_String {

    public static int minOperations(String s) {

        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) - '0' != i % 2) {
                count++;
            }
        }

        return Math.min(count, s.length() - count);
    }

    public static void main(String[] args) {

        String s = "0000";
        System.out.println(minOperations(s));
    }
}
