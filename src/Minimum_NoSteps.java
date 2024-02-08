import java.util.HashMap;
import java.util.Map;

public class Minimum_NoSteps {
    public static int minSteps(String s, String t) {

        HashMap<Character, Integer> hm = new HashMap<>();
        int sum =0;

        for (int i=0; i<s.length(); i++) {
            if (hm.containsKey(s.charAt(i))) {
                int val = hm.get(s.charAt(i));
                hm.put(s.charAt(i),++val);
            } else {
                hm.put(s.charAt(i),1);
            }
        }

        for (int i=0; i<t.length(); i++) {
            if (hm.containsKey(t.charAt(i))) {
                int val = hm.get(t.charAt(i));
                if (val>1) {
                    hm.put(t.charAt(i),--val);
                } else {
                    hm.remove(t.charAt(i));
                }
            }
        }

        for (Map.Entry entry : hm.entrySet()) {

            sum = sum + (int) entry.getValue();
        }
        return sum;
    }
    public static void main(String[] args) {

        String s = "leetcode";
        String t = "practice";
        int steps =  minSteps(s,t);
        System.out.println(steps);
    }

}
