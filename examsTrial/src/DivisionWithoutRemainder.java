import java.util.Scanner;

public class DivisionWithoutRemainder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        double count2 = 0;
        double count3 = 0;
        double count4 = 0;

        for (int i = 1; i <= n ; i++) {
            int number = Integer.parseInt(scanner.nextLine());
            if (number % 2 == 0){
                count2++;

            }
            if (number % 3 == 0) {
                count3++;
            }
            if (number % 4 == 0){
                count4++;
            }

        }
        double p2 = count2/n*100;
        double p3 = count3/n*100;
        double p4 = count4/n*100;

        System.out.printf("%.2f%%%n", p2);
        System.out.printf("%.2f%%%n", p3);
        System.out.printf("%.2f%%%n",p4);
    }
}
