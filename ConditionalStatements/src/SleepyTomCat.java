import java.util.Scanner;

public class SleepyTomCat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int daysHoliday = Integer.parseInt(scanner.nextLine());

        int minutesPlayHoliday = daysHoliday * 127;
        int workDays = 365 - daysHoliday;
        int minutesPlayWorkDay = workDays * 63;

        int totalPlayMinutes = minutesPlayHoliday + minutesPlayWorkDay;

        int diff = Math.abs(totalPlayMinutes - 30000);
        int totalPlayHours = diff/60;
        int totalPlayHoursMin = diff % 60;
        if (totalPlayMinutes > 30000) {
            System.out.printf ("Tom will run away %n %d hours and %d minutes more for play", totalPlayHours, totalPlayHoursMin);

        } else {
            System.out.printf("Tom sleeps well %n %d hours and %d minutes less for play", totalPlayHours, totalPlayHoursMin);

        }

    }
}
