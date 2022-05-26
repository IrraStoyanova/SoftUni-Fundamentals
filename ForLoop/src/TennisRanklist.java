import java.util.Scanner;

public class TennisRanklist {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberTournirs = Integer.parseInt(scanner.nextLine());
        int initialPoints = Integer.parseInt(scanner.nextLine());


        int points = 0;
        int countWin = 0;


        for (int i = 1; i <= numberTournirs; i++) {
            String result = scanner.nextLine();
            switch (result) {
                case "W":
                    points = points + 2000;
                    countWin++;
                    break;
                case "F":
                    points = points + 1200;
                    break;
                case "SF":
                    points = points + 720;
                    break;
            }

        }
        System.out.printf("Final points: %d %n", initialPoints + points);
        System.out.printf("Average points: %d%n", points / numberTournirs);
        System.out.printf("%.2f%%", countWin * 1.0 / numberTournirs * 100);
    }
}