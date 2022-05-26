import java.util.Scanner;

public class HalfSumElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int sum = 0;
        int max = Integer.MIN_VALUE;

        for(int number = 1; number <= n; number ++){

            int currentNum = Integer.parseInt(scanner.nextLine());
            sum = sum + currentNum;

            if (currentNum > max){
                max = currentNum;
            }}

            int sumWithoutMax = sum - max;
            if (max == sumWithoutMax) {
                System.out.println("Yes");
                System.out.printf ("Sum = %d", sumWithoutMax);

            } else {
                System.out.println("No");
                System.out.printf("Diff = %d", Math.abs(max-sumWithoutMax));
            }

        }


    }

