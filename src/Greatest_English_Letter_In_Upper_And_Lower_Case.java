import java.util.HashSet;

public class Greatest_English_Letter_In_Upper_And_Lower_Case {

    public static String greatestLetter(String s) {

        HashSet<Character> hs = new HashSet<>();
        char ch = '%';
        char maxcharacter = 'A';

        for (int i = 0; i < s.length(); i++) {
            hs.add(s.charAt(i));
        }

        for (int i = 0; i < s.length(); i++) {
            char r = s.charAt(i);

            if (Character.isUpperCase(r)) {
                if (maxcharacter <= r) {
                    maxcharacter = r;
                    char lower = Character.toLowerCase(r);
                    if (hs.contains(lower)) {
                        ch = Character.toUpperCase(r);
                    }
                }
            }
        }

        if (ch == '%') {
            return "";
        } else {
            return String.valueOf(ch);
        }

    }

    public static void main(String[] args) {

        String s = "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAaAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA";
        System.out.println(greatestLetter(s));
    }
}
