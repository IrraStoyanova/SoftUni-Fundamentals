import java.util.Scanner;

public class LunchBreak {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String movieName = scanner.nextLine();
        int durationEpisode = Integer.parseInt(scanner.nextLine());
        int durationLunchBreak = Integer.parseInt(scanner.nextLine());

        double timeForLunch = durationLunchBreak / 8.0;
        double timeForRelax = durationLunchBreak / 4.0;
        double timeLeft = durationLunchBreak - timeForLunch - timeForRelax;

        double diff = Math.abs(timeLeft-durationEpisode);

        if (timeLeft >= durationEpisode) {
            System.out.printf("You have enough time to watch %s and left with %.0f minutes free time.", movieName, Math.ceil(diff));
        } else {
            System.out.printf("You don't have enough time to watch %s, you need %.0f more minutes.", movieName, Math.ceil(diff));
        }


    }
}
