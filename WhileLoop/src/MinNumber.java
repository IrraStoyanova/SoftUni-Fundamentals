import java.util.Scanner;

public class MinNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int min = Integer.parseInt(scanner.nextLine());

        String input = scanner.nextLine();
        while (!input.equals("Stop")){
            int number = Integer.parseInt(input);
            if (number < min){
                min = number;

            }
            input = scanner.nextLine();

        }
        System.out.println(min);
    }
}

