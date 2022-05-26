import java.util.Scanner;

public class StrongNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());
        int initNumber = number;
        int sumFact = 0;

        while (number>0){
            int fact = 1;
            int lastDigit = number%10;
            for (int i = 1; i <= lastDigit; i++) {
                fact = fact * i;
            }
                sumFact += fact;
                number = number/10;
            }

        if (sumFact == initNumber){
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }
}
