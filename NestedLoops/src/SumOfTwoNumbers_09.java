import java.util.Scanner;

public class SumOfTwoNumbers_09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstNum = Integer.parseInt(scanner.nextLine());
        int secondNum = Integer.parseInt(scanner.nextLine());
        int magicNumber = Integer.parseInt(scanner.nextLine());
        int count = 0;
        boolean isMagic = false;


        for (int i = firstNum; i <= secondNum; i++) {
            for (int j = firstNum; j <= secondNum; j++) {
                count++;
                if (i + j == magicNumber) {
                    isMagic = true;
                    System.out.printf("Combination N:%d (%d + %d = %d)", count, i, j, magicNumber);
                    return;

                }

            }

        }
        System.out.printf("%d combinations - neither equals %d", count, magicNumber);

    }}


