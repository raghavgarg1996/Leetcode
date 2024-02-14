import java.util.*;

public class Sort_Vowels_In_A_String {

    public static String sortVowels(String s) {

        List<Integer> ls = new ArrayList<>();
        List<Character> charLs = new ArrayList<>();
        HashSet<Character> hs = new HashSet<>();

        hs.add('A');
        hs.add('E');
        hs.add('I');
        hs.add('O');
        hs.add('U');
        hs.add('a');
        hs.add('e');
        hs.add('i');
        hs.add('o');
        hs.add('u');

        for (int i = 0; i < s.length(); i++) {
            if (hs.contains(s.charAt(i))) {
                ls.add(i);
                charLs.add(s.charAt(i));
            }
        }

        char[] ch = new char[charLs.size()];
        for (int i = 0; i < charLs.size(); i++) {
            ch[i] = charLs.get(i);
        }

        Arrays.sort(ch);

        int arrayPos = 0;
        StringBuffer st = new StringBuffer();
        for (int i = 0; i < s.length(); i++) {
            if (ls.contains(i)) {
                st.append(ch[arrayPos]);
                arrayPos++;
            } else {
                st.append(s.charAt(i));
            }
        }

        return st.toString();
    }

    public static void main(String[] args) {

        String s = "lEetcOde";
        System.out.println(sortVowels(s));
    }
}
