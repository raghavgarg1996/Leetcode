import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Isomorphic_String {

    public static boolean isIsomorphic(String s, String t) {

        HashMap<Character, List> hm = new HashMap<>();
        HashMap<Character, List> hm2 = new HashMap<>();
        int count=0;


        for (int i = 0; i < s.length(); i++) {
            if (hm.containsKey(s.charAt(i))) {
                List<Integer> ls2 = hm.get(s.charAt(i));
                ls2.add(i);
                hm.put(s.charAt(i), ls2);
            } else {
                List<Integer> ls = new ArrayList<>();
                ls.add(i);
                hm.put(s.charAt(i), ls);
            }
        }

        System.out.println(hm);


        for (int i = 0; i < t.length(); i++) {
            if (hm2.containsKey(t.charAt(i))) {
                List<Integer> ls2 = hm2.get(t.charAt(i));
                ls2.add(i);
                hm2.put(t.charAt(i), ls2);
            } else {
                List<Integer> ls = new ArrayList<>();
                ls.add(i);
                hm2.put(t.charAt(i), ls);
            }
        }

        System.out.println(hm2);

        for (Map.Entry entry : hm.entrySet()) {
            List ls = (List) entry.getValue();
            if (hm2.containsValue(ls)) {
                count++;
            }
        }

        if (count==hm2.size()) {
            return true;
        }

        return false;
    }

    public static void main(String[] args) {
        String s = "paper";
        String t = "title";
        boolean f = isIsomorphic(s, t);
        System.out.println(f);
    }


}
