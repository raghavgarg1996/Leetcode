public class Student_Doing_Homework {

    public static int busyStudent(int[] startTime, int[] endTime, int queryTime) {
        int count = 0;
        for (int i = 0; i < startTime.length; i++) {
            int time = endTime[i] - startTime[i];

            if (time == 0 && queryTime == startTime[i]) {
                count++;
            } else {
                for (int j = 0; j <= time; j++) {
                    if (startTime[i] + j == queryTime) {
                        count++;
                    }
                }
            }
        }
        return count;

    }

    public static void main(String[] args) {

        int[] startTime = {61, 74, 11, 54};
        int[] endTime = {61, 75, 65, 92};
        int querryTime = 75;

        int sol = busyStudent(startTime, endTime, querryTime);
        System.out.println(sol);
    }
}
