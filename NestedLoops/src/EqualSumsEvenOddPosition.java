import java.util.Scanner;

public class EqualSumsEvenOddPosition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstNum = Integer.parseInt(scanner.nextLine());
        int secondNum = Integer.parseInt(scanner.nextLine());

        for (int i = firstNum; i <= secondNum ; i++) {
            int currentNum = i;

            int even = 0;
            int odd = 0;
            for (int j = 6; j >= 1 ; j--) {
                int digit = currentNum % 10;

                if (j % 2 == 0){
                    even = even + digit;

                } else {
                    odd = odd + digit;
                }
                currentNum = currentNum/10;



            }
            if (even == odd){
                System.out.print(i + " ");
            }

        }
    }
}
