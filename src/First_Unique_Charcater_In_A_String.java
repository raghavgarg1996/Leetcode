import java.util.HashMap;
import java.util.*;

public class First_Unique_Charcater_In_A_String {
    public static int firstUniqChar(String s) {

        char choosencharacter = 'a';
        int choosenvalue =-1;
        HashSet<Character> hs = new HashSet<>();
        HashMap<Character, Integer> hm = new HashMap<>();

        for (int i=0; i<s.length(); i++) {
            if (hm.containsKey(s.charAt(i))) {
                int val = hm.get(s.charAt(i));
                hm.put(s.charAt(i),++val);
            } else {
                hm.put(s.charAt(i),1);
            }
        }

        for (Map.Entry entry: hm.entrySet()) {
            if ((int) entry.getValue()==1) {
                choosencharacter =  (char) entry.getKey();
                hs.add(choosencharacter);
            }
        }

        for (int i=0; i<s.length(); i++) {
            if (hs.contains(s.charAt(i))) {
                choosenvalue = i;
                break;
            }
        }

        return choosenvalue;
    }

    public static void main(String args[]) {

        String s = "leetcode";
        int output = firstUniqChar(s);
        System.out.println(output);
    }
}
