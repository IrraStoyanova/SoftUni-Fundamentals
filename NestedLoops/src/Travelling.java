import java.util.Scanner;

public class Travelling {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String destination = scanner.nextLine();

        while (!destination.equals("End")){
            double needMoney = Double.parseDouble(scanner.nextLine());
            double savedMoney = 0;
            while (savedMoney < needMoney){
                double sum = Double.parseDouble(scanner.nextLine());
                savedMoney = savedMoney + sum;
            }
            System.out.printf("Going to %s!%n", destination);
            destination = scanner.nextLine();
        }

    }
}
