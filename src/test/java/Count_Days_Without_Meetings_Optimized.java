import java.util.Arrays;

public class Count_Days_Without_Meetings_Optimized {

    public static int countDays(int days, int[][] meetings) {
        // Sort the meetings based on the start day
        Arrays.sort(meetings, (a, b) -> Integer.compare(a[0], b[0]));

        int mergedDays = 0;
        int start = -1, end = -1;

        for (int[] meeting : meetings) {
            int meetingStart = meeting[0];
            int meetingEnd = meeting[1];

            // If no overlap, add the previous interval length and reset
            if (meetingStart > end) {
                if (start != -1) {
                    mergedDays += end - start + 1;
                }
                start = meetingStart;
                end = meetingEnd;
            } else {
                // Overlapping intervals, just extend the end if needed
                end = Math.max(end, meetingEnd);
            }
        }

        // Add the last interval
        if (start != -1) {
            mergedDays += end - start + 1;
        }

        // Total days minus the merged days
        return days - mergedDays;
    }

    public static void main(String[] args) {

        int inputDays = 10;
        int[][] meetings = {{5, 7}, {1, 3}, {9, 10}};
        System.out.println(countDays(inputDays, meetings));
    }
}
