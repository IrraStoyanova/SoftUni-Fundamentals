import java.util.Scanner;

public class RefactorSumOfOddNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        int sum = 0;
        for (int i = 1; i <= n*2; i++) {
            if (i%2 != 0) {
                System.out.printf("%d%n", i);
                sum = sum + i;
            }
        }
        System.out.printf("Sum: %d%n", sum);}}



