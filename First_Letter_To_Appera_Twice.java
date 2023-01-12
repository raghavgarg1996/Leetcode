import java.util.HashMap;

public class First_Letter_To_Appera_Twice {
    public char repeatedCharacter(String s) {

        HashMap<Character,Integer> hm = new HashMap<>();
        char sol = 'a';

        for (int i=0; i<s.length(); i++) {
            if (hm.containsKey(s.charAt(i))) {
                sol = s.charAt(i);
                break;
            } else {
                hm.put(s.charAt(i),1);
            }
        }
        return sol;
    }
}

