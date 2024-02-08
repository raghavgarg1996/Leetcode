import java.util.HashMap;
import java.util.Map;

public class Percentage_Of_Letter_In_A_String {

    public static int percentageLetter(String s, char letter) {
        HashMap<Character, Integer> hm = new HashMap<>();

        int choosenLetterCount = 0;

        for (int i = 0; i < s.length(); i++) {
            if (hm.containsKey(s.charAt(i))) {
                int val = hm.get(s.charAt(i));
                hm.put(s.charAt(i), ++val);
            } else {
                hm.put(s.charAt(i), 1);
            }
        }

        for (Map.Entry entry : hm.entrySet()) {
            if ((char) entry.getKey() == letter) {
                choosenLetterCount = (int) entry.getValue();
            }
        }

        return (choosenLetterCount * 100) / s.length();
    }

    public static void main(String[] args) {

        String s = "foobar";
        char letter = 'o';

        System.out.println(percentageLetter(s, letter));

    }
}
