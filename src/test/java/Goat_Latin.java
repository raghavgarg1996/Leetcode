import java.util.HashSet;

public class Goat_Latin {

    public static String toGoatLatin(String sentence) {

        HashSet<Character> hs = new HashSet<>();
        StringBuffer st = new StringBuffer();

        hs.add('a');
        hs.add('e');
        hs.add('i');
        hs.add('o');
        hs.add('u');
        hs.add('A');
        hs.add('E');
        hs.add('I');
        hs.add('O');
        hs.add('U');

        String[] arr = sentence.split(" ");

        for (int i = 0; i < arr.length; i++) {
            String sentences = arr[i];
            StringBuffer st1;

            if (hs.contains(sentences.charAt(0))) {
                st1 = new StringBuffer(sentences);
                st1.append("ma");
                for (int j = 0; j < i + 1; j++) {
                    st1.append("a");
                }
                st.append(st1);
            } else {
                st1 = new StringBuffer(sentences);
                Character ch = st1.charAt(0);
                st1.deleteCharAt(0);
                st1.append(ch);
                st1.append("ma");
                for (int j = 0; j < i + 1; j++) {
                    st1.append("a");
                }
                st.append(st1);
            }
            st.append(" ");

        }

        return st.toString().trim();
    }

    public static void main(String[] args) {

        String sentence = "I speak Goat Latin";
        System.out.println(toGoatLatin(sentence));
    }
}
