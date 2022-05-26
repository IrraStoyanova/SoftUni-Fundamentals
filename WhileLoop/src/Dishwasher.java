import java.util.Scanner;

public class Dishwasher {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countBottles = Integer.parseInt(scanner.nextLine());
        int countCicles = 0;
        int mlDetergent = countBottles * 750;
        int countDishes = 0;
        int countPots = 0;

        String command = scanner.nextLine();

        while(!command.equals("End")){
            int currentPut = Integer.parseInt(command);
            countCicles++;

            if (countCicles%3 == 0){
                mlDetergent = mlDetergent - (currentPut * 15);
                countPots = countPots + currentPut;
            } else {
                mlDetergent = mlDetergent - (currentPut * 5);
                countDishes = countDishes + currentPut;
            }
            if (mlDetergent < 0){
                break;
            }

            command = scanner.nextLine();

        }

        if(mlDetergent < 0){
            System.out.printf ("Not enough detergent, %d ml. more necessary!", Math.abs(mlDetergent));
        } else {
            System.out.println("Detergent was enough!");
            System.out.printf("%d dishes and %d pots were washed.%n", countDishes, countPots);
            System.out.printf("Leftover detergent %d ml.", mlDetergent);

        }
    }}

