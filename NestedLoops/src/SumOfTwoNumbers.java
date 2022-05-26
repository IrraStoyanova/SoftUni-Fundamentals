import java.util.Scanner;

public class SumOfTwoNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstInterval = Integer.parseInt(scanner.nextLine());
        int secondInterval = Integer.parseInt(scanner.nextLine());
        int magicNumber = Integer.parseInt(scanner.nextLine());
        int count = 0;

        for (int x1 = firstInterval; x1 <= secondInterval; x1++) {
            for (int x2 = firstInterval; x2 <= secondInterval; x2++) {
                count++;
                int sum = x1 + x2;
                if (sum == magicNumber){
                    System.out.printf("Combination N:%d (%d + %d = %d)", count, x1, x2, sum);
                    return;
                }

            }

        }
        System.out.printf("%d combinations - neither equals %d", count, magicNumber);
    }
}
