import java.util.Scanner;

public class LeftAndRightSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int sumOne = 0;
        int sumTwo = 0;

        for(int number = 1; number<=2*n; number++){
            int value = Integer.parseInt(scanner.nextLine());
            if (number <= n){
                sumOne = value + sumOne;

            } else if (number <= 2*n){
                sumTwo = value + sumTwo;
            }


        }
        if (sumOne == sumTwo){
            System.out.printf("Yes, sum = %d", sumOne);
        } else {
            System.out.printf("No, diff = %d", Math.abs(sumOne - sumTwo));
        }

    }
}
