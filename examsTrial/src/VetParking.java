import java.util.Scanner;

public class VetParking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countDays = Integer.parseInt(scanner.nextLine());
        int countHours = Integer.parseInt(scanner.nextLine());
        double tax = 0;
        double totalTax = 0;

        for (int i = 1; i <=countDays; i++) {
            double taxPerDay = 0;

            for (int j = 1; j <= countHours ; j++) {
                if (i % 2 == 0 && j % 2 !=0){
                    tax = 2.50;
                    taxPerDay = taxPerDay + tax;
                }
                else if (i% 2 !=0 && j % 2 == 0){
                    tax = 1.25;
                    taxPerDay = taxPerDay + tax;
                } else {
                    tax = 1;
                    taxPerDay = taxPerDay + tax;
                }
                totalTax = totalTax + tax;


            }
            System.out.printf("Day: %d - %.2f leva%n", i,taxPerDay);

        }
        System.out.printf("Total: %.2f leva", totalTax);
    }
}
