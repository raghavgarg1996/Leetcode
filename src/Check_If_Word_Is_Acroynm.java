import java.util.*;

public class Check_If_Word_Is_Acroynm {

    public static boolean isAcronym(List<String> words, String s) {

        List<Character> ls = new ArrayList<>();
        for (int i=0; i<words.size(); i++) {
            String k = words.get(i);
            ls.add(k.charAt(0));
        }

        if (ls.toString().replace("[","").replace("]","").replace(", ","").equals(s)) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {

        List<String> ls = new ArrayList<>();
        ls.add("alice");
        ls.add("bob");
        ls.add("charlie");

        String s = "abc";
        System.out.println(isAcronym(ls, s));
    }
}
