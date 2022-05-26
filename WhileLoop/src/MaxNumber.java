import java.util.Scanner;

public class MaxNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        //Напишете програма, която до получаване на командата "Stop", чете цели числа,
        // въведени от потребителя и намира най-голямото измежду тях. Въвежда се по едно число на ред.

        //въвеждам число;
        //повтаряме: четене на число и го сравнява;
        //спираме: когато има команда Стоп
        int max = Integer.parseInt(scanner.nextLine());

        String input = scanner.nextLine();
        while (!input.equals("Stop")){
            int number = Integer.parseInt(input);
            if (number > max){
                max = number;

            }
            input = scanner.nextLine();

        }
        System.out.println(max);
    }
        }
