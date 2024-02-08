public class Remove_All_Occurrences_Of_A_String {

    public static String removeOccurrences(String s, String part) {

        String res = "";
        if (s.contains(part)) {
            res = s.replaceFirst(part, "");
            res = removeOccurrences(res, part);
        } else {
            res = s;
        }
        return res;
    }

    public static void main(String[] args) {

        String s = "aabababa";
        String part = "aba";
        System.out.println(removeOccurrences(s, part));
    }
}
