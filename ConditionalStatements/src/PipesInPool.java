import java.util.Scanner;

public class PipesInPool {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int volumeR = Integer.parseInt(scanner.nextLine());
        int debitP1 = Integer.parseInt(scanner.nextLine());
        int debitP2 = Integer.parseInt(scanner.nextLine());
        double hours = Double.parseDouble(scanner.nextLine());

        double volumePipe1 = debitP1 * hours;
        double volumePipe2 = debitP2 * hours;
        double volumeTotal = volumePipe1 + volumePipe2;

        double percentTotal = (volumeTotal/volumeR) * 100;
        double percentP1 = (volumePipe1 / volumeTotal) * 100;
        double percentP2 = (volumePipe2/volumeTotal) * 100;

        double diff = Math.abs(volumeTotal - volumeR);

        if (volumeTotal > volumeR) {
            System.out.printf("For %.2f hours the pool overflows with %.2f liters.", hours, diff);
        } else {
            System.out.printf("The pool is %.2f%% full. Pipe 1: %.2f%%. Pipe 2: %.2f%%.", percentTotal, percentP1, percentP2);



    }
}
}
