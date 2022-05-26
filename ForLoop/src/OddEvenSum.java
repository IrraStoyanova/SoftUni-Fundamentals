import java.util.Scanner;

public class OddEvenSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int sumEvent = 0;
        int sumOdd = 0;

        for (int number = 1; number <= n; number++){
            int value = Integer.parseInt(scanner.nextLine());
            if (number % 2 == 0){
                sumEvent =value + sumEvent;
            }
            else if (number % 2 == 1){
                sumOdd = value + sumOdd;
            }
        }   if (sumEvent == sumOdd){
            System.out.println("Yes");
            System.out.printf("Sum = %d", sumEvent);
        }   else {
            System.out.println("No");
            System.out.printf("Diff = %d", Math.abs(sumEvent - sumOdd));
        }
    }
}
