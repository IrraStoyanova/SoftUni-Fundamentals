import java.util.Scanner;

public class SumNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int controlNumber = Integer.parseInt(scanner.nextLine());

        int sum = 0;
        while (sum < controlNumber){
            int number = Integer.parseInt(scanner.nextLine());
            sum += number;

        }
        System.out.println(sum);

    }
}
