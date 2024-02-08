import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Word_Pattern {

    public static boolean wordPattern(String pattern, String s) {

        HashMap<Character, List> hm = new HashMap();
        HashMap<String, List> hm2 = new HashMap<>();
        int count=0;

        for (int i=0; i<pattern.length(); i++) {
            if (hm.containsKey(pattern.charAt(i))) {
                List<Integer> ls2= hm.get(pattern.charAt(i));
                ls2.add(i);
                hm.put(pattern.charAt(i),ls2);
            } else {
                List<Integer> ls = new ArrayList<>();
                ls.add(i);
                hm.put(pattern.charAt(i),ls);
            }
        }

        String[] sarr = s.split(" ");

        for (int i=0; i< sarr.length; i++) {
            String k = sarr[i];
            if (hm2.containsKey(k)) {
                List<Integer> ls2= hm2.get(k);
                ls2.add(i);
                hm2.put(sarr[i],ls2);
            } else {
                List<Integer> ls = new ArrayList<>();
                ls.add(i);
                hm2.put(sarr[i],ls);
            }
        }

        for (Map.Entry entry : hm.entrySet()) {
            List ls = (List) entry.getValue();
            if (hm2.containsValue(ls)) {
                count++;
            }
        }

        if ((s.split(" ").length==1)&& pattern.length()>1) {
            return false;
        }

        if (count==hm2.size()) {
            return true;
        }

        return false;
    }

    public static void main(String[] args) {

        String pattern = "a";
        String s = "a";
        System.out.println(wordPattern(pattern, s));
    }
}
