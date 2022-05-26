import java.util.Scanner;

public class BestPlayer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String command = scanner.nextLine();
        int maxGoals = 0;
        String bestPlayer = "";

        while(!command.equals("END")){
            String namePlayer = command;
            int goals = Integer.parseInt(scanner.nextLine());
            if (goals >= 10){
                maxGoals = goals;
                bestPlayer = namePlayer;
                System.out.printf("%s is the best player!%n", bestPlayer);
                System.out.printf("He has scored %d goals and made a hat-trick !!!", maxGoals);
                return;
            }
            if (goals > maxGoals){
                maxGoals = goals;
                bestPlayer = namePlayer;
            }

            command = scanner.nextLine();


        }
        System.out.printf("%s is the best player!%n", bestPlayer);
        if (maxGoals >= 3) {
            System.out.printf("He has scored %d goals and made a hat-trick !!!", maxGoals);
        } else {
            System.out.printf("He has scored %d goals.", maxGoals);
        }

    }
}
