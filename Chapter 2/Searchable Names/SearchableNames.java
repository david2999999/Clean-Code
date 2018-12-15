public class SearchableNames {
    private int badExample() {
        int s;
        int[] t = new int[34];

        for (int j = 0; j < 34; j++) {
            s = (t[j] * 4) / 5;
        }
    }


    private int goodExample() {
        int realDaysPerIdealDay = 4;
        int WORK_DAYS_PER_WEEK = 5;
        int NUMBER_OF_TASKS = 34;
        int sum = 0;
        int[] taskEstimate = new int[34];

        for (int j = 0; j < NUMBER_OF_TASKS; j++) {
            int realTaskDays = taskEstimate[j] * realDaysPerIdealDay;
            int realTaskWeeks = (realTaskDays / WORK_DAYS_PER_WEEK);
            sum += realTaskWeeks;
        }

        return sum;
    }
}
