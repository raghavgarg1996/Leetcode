import java.util.ArrayList;

public class Check_If_All_A_Appear_Before_All_B {

    public static boolean checkString(String s) {

        ArrayList<Integer> aList = new ArrayList<>();
        ArrayList<Integer> bList = new ArrayList<>();
        boolean k = false;
        int count =0;

        for (int i=0; i<s.length(); i++) {
            if (s.charAt(i)=='a') {
                aList.add(i);
            } else {
                bList.add(i);
            }
        }

        int[] aArray = new int[aList.size()];
        int[] bArray = new int[bList.size()];

        for (int i=0; i<aList.size(); i++) {
            aArray[i] = aList.get(i);
        }

        for (int i=0; i<bList.size(); i++) {
            bArray[i] = bList.get(i);
        }

        for (int i=0; i<aArray.length; i++) {
            for (int j=0; j<bArray.length; j++) {
                if (aArray[i]<bArray[j]) {
                    count++;
                }
            }
        }

        if (count == aArray.length * bArray.length) {
            k = true;
        }

        return k;
    }

    public static void main(String[] args) {

        String s = "bbb";
        boolean b = checkString(s);
        System.out.println(b);
    }
}
