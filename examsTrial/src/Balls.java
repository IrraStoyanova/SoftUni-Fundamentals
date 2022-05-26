import java.util.Scanner;

public class Balls {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int countBalls = Integer.parseInt(scanner.nextLine());
        int points = 0;
        int countRed = 0;
        int countOrange = 0;
        int countYellow = 0;
        int countWhite = 0;
        int countBlack = 0;
        int countOther = 0;

        for (int i = 1; i <=countBalls ; i++) {
            String colour = scanner.nextLine();

            //•	Ако топката е “red” точките ни се повишават с 5.
            //•	Ако топката е “orange” точките ни се повишават с 10.
            //•	Ако топката е “yellow” точките ни се повишават с 15.
            //•	Ако топката е “white” точките ни се повишават с 20.
            //•	Ако топката е “black” точките ни се делят на 2, като закръгляме към по-малкото цяло число.

            switch(colour){
            case "red":
                countRed++;
                points = points + 5;
                break;
                case "orange":
                countOrange++;
                points = points + 10;
                break;
                case "yellow":
                countYellow++;
                points = points + 15;
                break;
                case "white":
                countWhite++;
                points = points + 20;
                break;
                case"black":
                countBlack++;
                points = points/2;
                break;
                default:
                    countOther++;

            }


        }
        System.out.printf("Total points: %d%n", points);
        System.out.printf ("Red balls: %d%n", countRed);
        System.out.printf("Orange balls: %d%n",countOrange);
        System.out.printf("Yellow balls: %d%n",countYellow);
        System.out.printf("White balls: %d%n", countWhite);
        System.out.printf("Other colors picked: %d%n", countOther);
        System.out.printf("Divides from black balls: %d",countBlack);


    }
}
