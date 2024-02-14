public class Remove_All_Occurrences_Of_A_String_Optimized {

    public static String removeOccurrences(String s, String part) {

        if (s.contains(part)) {
            return removeOccurrences(s.replaceFirst(part, ""), part);
        } else {
            return s;
        }
    }

    public static void main(String[] args) {

        String s = "aabababa";
        String part = "aba";
        System.out.println(removeOccurrences(s, part));
    }
}
