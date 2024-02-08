
import java.util.Arrays;

public class Valid_anagrams {

    public static boolean isanagram(String s, String t) {

        char[] schar = s.toCharArray();
        char[] tchar = t.toCharArray();

        Arrays.sort(schar);
        Arrays.sort(tchar);

        int count =0;
        boolean k = false;

        if (s.length()==t.length()) {
            for (int i=0; i<s.length(); i++) {
                if (schar[i]==tchar[i]) {
                    count++;
                }
            }
        }

        if (count==s.length()) {
            k = true;
        }

        return k;
    }

    public static void main(String[] args) {

        String s = "anagram";
        String t = "nagaram";
        System.out.println(isanagram(s, t));
    }
}
