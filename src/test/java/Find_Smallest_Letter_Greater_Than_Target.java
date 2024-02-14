public class Find_Smallest_Letter_Greater_Than_Target {

    public static char nextGreatestLetter(char[] letters, char target) {

        char val = '~';
        int count =0;
        for (int i=0; i<letters.length; i++) {
            if ((letters[i]>target) && (letters[i]<val)) {
                val = letters[i];
                count++;
            }
        }

        if (count==0) {
            val = letters[0];
        }
        return val;
    }

    public static void main (String[] args) {
        char[] ch = {'a','b','c','d','e','f','g','h','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
        char target = 'y';
        char out = nextGreatestLetter(ch,target);
        System.out.println(out);
    }
}
