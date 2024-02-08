import java.util.HashMap;

public class Reverse_Only_Letters {

    public static String reverseOnlyLetters(String s) {

        int x=0;
        int y=s.length()-1;
        char c = 'f';
        int count =0;
        StringBuffer stf = new StringBuffer();

        char[] ch = s.toCharArray();
        int val = s.length();

        while (count<val) {
            if (((65<=ch[x])&&(ch[x]<=90)||(97<=ch[x])&&(ch[x]<=122))&&((65<=ch[y])&&(ch[y]<=90)||(97<=ch[y])&&(ch[y]<=122))) {
                c=ch[x];
                ch[x]=ch[y];
                ch[y]=c;
                x++;
                y--;
                count = count +2;
            } else if (((65<=ch[x])&&(ch[x]<=90)||(97<=ch[x])&&(ch[x]<=122))&&((64>=ch[y])||((91<=ch[y])&&(ch[y]<=96))||(ch[y]>=123))) {
                y--;
                count++;
            } else if (((64>=ch[x])||((91<=ch[x])&&(ch[x]<=96))||(ch[x]>=123))&&((64>=ch[y])||((91<=ch[y])&&(ch[y]<=96))||(ch[y]>=123))) {
                x++;
                y--;
                count = count +2;
            } else {
                x++;
                count++;
            }
        }

        for (int i =0; i<ch.length; i++) {
            stf.append(ch[i]);
        }

        return stf.toString();
    }

    public static void main (String[] args) {

        String s = "a-bC-dEf-ghIj";
        System.out.println(reverseOnlyLetters(s));
    }
}
