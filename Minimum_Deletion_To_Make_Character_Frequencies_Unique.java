import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class GoodStringDeletions {

    public static int minDeletionsToMakeGoodString(String s) {
        // Create a HashMap to store the frequency of each character
        Map<Character, Integer> freqMap = new HashMap<>();

        // Create a Set to keep track of unique frequencies
        Set<Integer> uniqueFreqs = new HashSet<>();

        // Initialize the count of deletions needed
        int deletionsNeeded = 0;

        // Iterate through the characters of the string using a traditional for loop
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            // Update the frequency map
            if (freqMap.containsKey(c)) {
                freqMap.put(c, freqMap.get(c) + 1);
            } else {
                freqMap.put(c, 1);
            }

            int freq = freqMap.get(c);

            // Check if the current frequency is already in the set
            while (uniqueFreqs.contains(freq)) {
                // If it is, decrement the frequency by 1 (delete a character)
                freq--;
                deletionsNeeded++;
            }

            // Add the current frequency to the set of unique frequencies
            uniqueFreqs.add(freq);
        }

        return deletionsNeeded;
    }

    public static void main(String[] args) {
        // Test cases
        System.out.println(minDeletionsToMakeGoodString("aab"));       // Output: 0
        System.out.println(minDeletionsToMakeGoodString("aaabbbcc"));  // Output: 2
        System.out.println(minDeletionsToMakeGoodString("ceabaacb"));  // Output: 2
    }
}





