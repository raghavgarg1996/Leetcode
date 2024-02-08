import java.util.ArrayList;

public class String_Compression {

    public static int compress(char[] chars) {

        int l = 0;
        int j = 0;
        int k = chars.length - 1;
        ArrayList<String> ls = new ArrayList<>();
        int count = 0;

        while (j <= k) {
            char ch = chars[j];
            if (chars[l] == ch) {
                j++;
                count++;
            } else {
                ls.add(String.valueOf(chars[l]));
                if ((count > 1) && (count <= 9)) {
                    ls.add(String.valueOf(count));
                }

                if (count > 9) {
                    String numberString = Integer.toString(count); // Convert the number to a string

                        for (int i = 0; i < numberString.length(); i++) {
                            char digitChar = numberString.charAt(i);
                            ls.add(String.valueOf(digitChar));
                        }
                    }
                count = 1;
                l = j;
                j++;
            }
        }

        ls.add(String.valueOf(chars[l]));
        if ((count > 1) && (count <= 9)) {
            ls.add(String.valueOf(count));
        }

        if (count > 9) {
            String numberString = Integer.toString(count); // Convert the number to a string

            for (int i = 0; i < numberString.length(); i++) {
                char digitChar = numberString.charAt(i);
                ls.add(String.valueOf(digitChar));
            }
        }

        for (int i = 0; i < ls.size(); i++) {

       //     chars = new char[ls.size()];
            chars[i] = ls.get(i).toCharArray()[0];
            System.out.print(chars[i]+" ");
        }

        return ls.size();
    }

    public static void main(String[] args) {

        char[] ch = {'a', 'a', 'b', 'b', 'c', 'c', 'c'};
        int k = compress(ch);
        System.out.println();
        System.out.println(k);
    }
}
