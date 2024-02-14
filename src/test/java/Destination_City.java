import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Destination_City {

    public static String destCity(List<List<String>> paths) {

        HashMap<String, String> hm = new HashMap<>();
        String initialStart = "";

        for (List<String> path : paths) {
            String cityA = path.get(0);
            String cityB = path.get(1);

            if (!hm.containsKey(cityA)) {
                hm.put(cityA, cityB);
            }
        }

        initialStart = paths.get(0).get(0);

        String city = finalCity(hm, initialStart);
        return city;
    }

    public static String finalCity(HashMap<String, String> hm, String startingCity) {

        if (!hm.containsKey(startingCity)) {
            return startingCity;
        }

        String city = hm.get(startingCity);
        return finalCity(hm, city);
    }

    public static void main(String[] args) {
        List<List<String>> paths = new ArrayList<>();
        List<String> ls;

        ls = new ArrayList<>();
        ls.add("London");
        ls.add("New York");
        paths.add(ls);

        ls = new ArrayList<>();
        ls.add("New York");
        ls.add("Lima");
        paths.add(ls);

        ls = new ArrayList<>();
        ls.add("Lima");
        ls.add("Sao Paulo ");
        paths.add(ls);

        System.out.println(destCity(paths));
    }
}
