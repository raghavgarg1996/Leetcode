import java.util.HashMap;

public class Ransom_Note {

    public boolean canConstruct(String ransomNote, String magazine) {

        HashMap<Character,Integer> hm = new HashMap<>();
        int count=0;

        if (magazine.length()<ransomNote.length()) {
            return false;
        }

        for (int i=0; i<magazine.length(); i++) {
            if (hm.containsKey(magazine.charAt(i))) {
                int k = hm.get(magazine.charAt(i));
                hm.put(magazine.charAt(i),++k);
            } else {
                hm.put(magazine.charAt(i),1);
            }
        }

        for (int i=0; i<ransomNote.length(); i++) {
            if (hm.containsKey(ransomNote.charAt(i))) {
                int val = hm.get(ransomNote.charAt(i));
                if (val==1) {
                    hm.remove(ransomNote.charAt(i));
                } else {
                    int k = hm.get(ransomNote.charAt(i));
                    hm.put(ransomNote.charAt(i),--val);
                }
                count++;
            }
        }

        if (count==ransomNote.length()) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {

    }
}
