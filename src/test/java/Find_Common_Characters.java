import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Find_Common_Characters {

    public static List<String> commonChars(String[] words) {

        String s1 = words[0];

        char[] c1 = s1.toCharArray();
        List<String> ls = new ArrayList<>();

        if (words.length == 1) {
            for (int i=0; i<c1.length; i++) {
                ls.add(String.valueOf(c1[i]));
            }
            return ls;
        }

        String s2 = words[1];



        for (int i=0; i<c1.length; i++) {
            if (s2.contains(String.valueOf(c1[i]))) {
                s2 = s2.replaceFirst(String.valueOf(c1[i]),"");
                ls.add(String.valueOf(c1[i]));
            }
        }

        System.out.println(ls);

        if (words.length == 2) {
            return ls;
        }



        for (int i = 2; i < words.length; i++) {
            String realWord = words[i];
            for (int j = 0; j < ls.size(); j++) {
                if (!realWord.contains(ls.get(j))) {
                    ls.remove(ls.get(j));
                    j = j-1;
                } else {
                    realWord = realWord.replaceFirst(ls.get(j),"");
                }
            }
        }
        return ls;
    }

        public static void main (String[]args){

            String[] words = {"cool"};
            List<String> ls = commonChars(words);
            System.out.println(ls);
        }
    }
