import java.util.Scanner;

public class AverageNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int sum = 0;
        double count = 0;
        double average = 0;

        for (int i = 1; i <= n; i++) {
            int value = Integer.parseInt(scanner.nextLine());
            count++;
            sum += value;

        }
        average = sum/count;

        System.out.printf("%.2f", average);

    }


    }

