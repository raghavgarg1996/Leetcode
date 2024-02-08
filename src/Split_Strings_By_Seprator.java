import java.util.ArrayList;
import java.util.List;

public class Split_Strings_By_Seprator {

    public static List<String> splitWordsBySeparator(List<String> words, char separator) {

        List<String> ls = new ArrayList<>();

        for (int i = 0; i < words.size(); i++) {
            String data = words.get(i);

            String[] arr = data.split(String.valueOf(separator));

            for (int j = 0; j < arr.length; j++) {
                ls.add(arr[j]);
            }
        }

        return ls;
    }

    public static void main(String[] args) {

        List<String> words = new ArrayList<>();
        words.add("one.two.three");
        words.add("four.five");
        words.add("six");
        Character separator = '.';
        List<String> output = splitWordsBySeparator(words, separator);
        System.out.println(output);
    }
}
