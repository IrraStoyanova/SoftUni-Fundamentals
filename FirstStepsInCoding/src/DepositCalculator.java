import java.util.Scanner;

public class DepositCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double depositSum = Double.parseDouble(scanner.nextLine());
        int time = Integer.parseInt(scanner.nextLine());
        double percent = Double.parseDouble(scanner.nextLine());

        double percentSum = depositSum * percent/100;
        double monthlyPercent = percentSum/12;

        System.out.println(depositSum + time*monthlyPercent);




        //сума = депозирана сума  + срок на депозита * ((депозирана сума * годишен лихвен процент ) / 12)



    }
}
