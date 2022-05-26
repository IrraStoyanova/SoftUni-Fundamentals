import java.util.Scanner;

public class NumberSequence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        int countNumbers = Integer.parseInt(scanner.nextLine());
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for (int number = 1; number <= countNumbers; number ++){
            int value = Integer.parseInt(scanner.nextLine());

            if (value > max){
                max = value;
            }
            if (value < min){
                min = value;
            }
        }
        System.out.println ("Max number: " + max);
        System.out.println("Min number: " + min);
    }
}
