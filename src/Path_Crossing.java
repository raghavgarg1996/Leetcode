import java.util.HashMap;

public class Path_Crossing {

    public static boolean isPathCrossing(String path) {

        HashMap<HashMap<Integer, Integer>, Integer> hs = new HashMap<>();
        HashMap<Integer, Integer> hm = new HashMap<>();

        int x = 0;
        int y = 0;
        hm.put(x, y);
        hs.put(hm, 0);

        for (int i = 0; i < path.length(); i++) {
            if (path.charAt(i) == 'N') {
                y++;
            } else if (path.charAt(i) == 'S') {
                y--;
            } else if (path.charAt(i) == 'E') {
                x++;
            } else {
                x--;
            }

            hm = new HashMap<>();
            hm.put(x, y);

            if (hs.containsKey(hm)) {
                return true;
            }
            hs.put(hm, i + 1);
        }
        return false;
    }

    public static void main(String[] args) {

        String path = "NESWW";
        System.out.println(isPathCrossing(path));
    }
}
