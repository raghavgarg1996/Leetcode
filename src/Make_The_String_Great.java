public class Make_The_String_Great {

    public static String makeGood(String s) {

        StringBuilder sb = new StringBuilder(s);
        boolean found = true;

        while (found) {
            found = false;

            for (int i = 0; i < sb.length() - 1; i++) {
                if (Math.abs(sb.charAt(i) - sb.charAt(i + 1)) == 32) {
                    sb.delete(i, i + 2); // Remove adjacent characters
                    found = true; // Mark that a removal occurred
                    break; // Exit the loop to recheck the string
                }
            }
        }

        return sb.toString();
    }

    public static void main(String[] args) {

        String s = "leEeetcode";
        System.out.println(makeGood(s));
    }
}
