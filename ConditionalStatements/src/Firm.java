import java.util.Scanner;

public class Firm {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int hoursNeeded = Integer.parseInt(scanner.nextLine());
        int days = Integer.parseInt(scanner.nextLine());
        int workersNumberExceptional = Integer.parseInt(scanner.nextLine());

        double learningTime = days * 0.10;
        double daysLeft = days - learningTime;
        double hoursLeft = daysLeft * 8.00;
        double exceptionalHours = (workersNumberExceptional * 2) * days;
        double allTimeForProject = hoursLeft + exceptionalHours;

        double diff = Math.abs (allTimeForProject - hoursNeeded);

        if (allTimeForProject >= hoursNeeded) {
            System.out.printf("Yes!%.0f hours left.", Math.floor(diff));
        } else {
            System.out.printf("Not enough time!%.0f hours needed.", Math.ceil(diff));
        }

    }
}
