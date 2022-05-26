import java.util.Scanner;

public class TournamentOfChristmas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int daysTour = Integer.parseInt(scanner.nextLine());
        String sportType = scanner.nextLine();
        int countTotalWin = 0;
        int countTotalLoose = 0;
        double totalEarnedMoney = 0;

        for (int i = 1; i <= daysTour; i++) {
            double earnedMoney = 0;
            int countWinDay = 0;
            int countLooseDay = 0;
            while (!sportType.equals("Finish")) {
                String result = scanner.nextLine();

                if (result.equals("win")) {
                    countWinDay++;
                    earnedMoney = earnedMoney + 20;

                } else if (result.equals("lose")) {
                    countLooseDay++;
                    earnedMoney = earnedMoney;
                }
                sportType = scanner.nextLine();

            }
            if (countWinDay > countLooseDay) {
                earnedMoney = earnedMoney + (earnedMoney * 0.10);
                countTotalWin++;
                totalEarnedMoney = totalEarnedMoney + earnedMoney;
            } else {
                countTotalLoose++;
                totalEarnedMoney = totalEarnedMoney;
            }

        }
        if (countTotalWin > countTotalLoose) {
            totalEarnedMoney = totalEarnedMoney + (totalEarnedMoney * 0.20);
            System.out.printf("You won the tournament! Total raised money: %.2f", totalEarnedMoney);
        } else {
            System.out.printf("You lost the tournament! Total raised money: %.2f", totalEarnedMoney);

        }
    }
}
