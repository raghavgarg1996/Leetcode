public class Reverse_String_II {

    public static String reverseStr(String s, int k) {
        StringBuilder rever = new StringBuilder();
        int i = 0;

        while (i < s.length()) {
            // Reverse first k characters
            int end = Math.min(i + k, s.length()); // Fix: Handle last segment properly
            rever.append(new StringBuilder(s.substring(i, end)).reverse());

            // Append next k characters as is
            int nextPart = Math.min(i + 2 * k, s.length()); // Fix: Ensure we don't exceed length
            if (end < nextPart) {
                rever.append(s.substring(end, nextPart));
            }

            i += 2 * k; // Move to next 2k block
        }

        return rever.toString();
    }
    public static void main(String[] args) {
        String s = "abcdefg";
        int k = 2;
        System.out.println(reverseStr(s, k));
    }
}
