import java.util.*;

public class Sort_Characters_By_Frequency {

    public static String frequencySort(String s) {

        HashMap<Character, Integer> hm = new HashMap<>();
        ArrayList<Integer> ls = new ArrayList<>();
        StringBuffer st = new StringBuffer();
        LinkedHashMap<Character, Integer> sortedMap = new LinkedHashMap<>();


        for (int i = 0; i < s.length(); i++) {
            if (hm.containsKey(s.charAt(i))) {
                int val = hm.get(s.charAt(i));
                hm.put(s.charAt(i), ++val);
            } else {
                hm.put(s.charAt(i), 1);
            }
        }

        for (Map.Entry entry : hm.entrySet()) {
            ls.add((int) entry.getValue());
        }

        Collections.sort(ls);

        for (int num : ls) {
            for (Map.Entry entry : hm.entrySet()) {
                if (entry.getValue().equals(num)) {
                    sortedMap.put((Character) entry.getKey(),num);
                }
            }
        }

        for (Map.Entry entry : sortedMap.entrySet()) {
            int value = (int) entry.getValue();
            char key = (char) entry.getKey();
            for (int i = 0; i < value; i++) {
                if (ls.contains(value)) {
                    st.append(key);
                }
            }
        }

        st.reverse();

        return st.toString();
    }

    public static void main(String[] args) {

        String s = "raaeaedere";
        System.out.println(frequencySort(s));
    }

}
