import java.util.ArrayList;

public class Number_of_Substrings_Containing_All_Three_Characters {

    public static int numberOfSubstrings(String s) {

        int count = 0;
        ArrayList<String> ls = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            for (int j = i + 1; j <= s.length(); j++) {
                ls.add(s.substring(i, j));
            }
        }

        System.out.println(ls);

        for (int i = 0; i < ls.size(); i++) {
            String val = ls.get(i);
            if (val.contains("a") && (val.contains("b") && (val.contains("c")))) {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {

        String s = "abcabc";
        System.out.println(numberOfSubstrings(s));
    }
}
