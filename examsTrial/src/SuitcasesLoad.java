import java.util.Scanner;

public class SuitcasesLoad {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double volume = Double.parseDouble(scanner.nextLine());

        String command = scanner.nextLine();
        int countSuitcase = 0;

        while(!command.equals("End")){
            double suitcaseVolume = Double.parseDouble(command);
            countSuitcase++;

            if (countSuitcase%3 == 0){
                suitcaseVolume = suitcaseVolume + (suitcaseVolume*0.10);
            }
            if (volume <= suitcaseVolume){
                System.out.printf("No more space!%n");
                System.out.printf("Statistic: %d suitcases loaded.", countSuitcase-1);
                break;
            }
            volume = volume - suitcaseVolume;


            command = scanner.nextLine();
        }
        if (command.equals("End")) {

            System.out.printf("Congratulations! All suitcases are loaded!%n");
            System.out.printf("Statistic: %d suitcases loaded.", countSuitcase);
        }
    }
}
