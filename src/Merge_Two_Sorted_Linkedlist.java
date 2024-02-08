import java.util.LinkedList;

public class Merge_Two_Sorted_Linkedlist {

    public static LinkedList mergeTwoLists(LinkedList list1, LinkedList list2) {
        LinkedList<Integer> ls = new LinkedList<>();

        int i = 0;
        int j = 0;
        int x = 0;

        while (i <= list1.size() && j <= list2.size()) {
            int val1 = (int) list1.get(i);
            int val2 = (int) list2.get(j);
            if (val1 < val2) {
                ls.add(val1);
                x++;
                i++;
            } else {
                ls.add(val2);
                x++;
                j++;
            }
        }

        while (i<=list1.size()) {
            ls.add((Integer) list1.get(i));
            x++;
            i++;
        }

        while (j<=list2.size()) {
            ls.add((Integer) list2.get(j));
            x++;
            j++;
        }

        return ls;
    }

    public static void main(String[] args) {

        LinkedList<Integer> list1 = new LinkedList<>();
        LinkedList<Integer> list2 = new LinkedList<>();

        list1.add(1);
        list1.add(2);
        list1.add(4);

        list2.add(1);
        list2.add(3);
        list2.add(4);

        LinkedList<Integer> list3 = mergeTwoLists(list1, list2);
        System.out.println(list3);
    }
}
