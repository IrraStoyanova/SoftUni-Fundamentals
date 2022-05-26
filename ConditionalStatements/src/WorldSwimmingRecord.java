import java.util.Scanner;

public class WorldSwimmingRecord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double worldRecord = Double.parseDouble(scanner.nextLine());
        double distanceMetres = Double.parseDouble(scanner.nextLine());
        double meterSwimmingSec = Double.parseDouble(scanner.nextLine());

        double allSeconds = distanceMetres * meterSwimmingSec;
        double ResistanceTime = Math.floor(distanceMetres/15) * 12.5;
        double totalTime = allSeconds + ResistanceTime;

        if (totalTime >= worldRecord) {
            System.out.printf ("No, he failed! He was %.02f seconds slower.", totalTime - worldRecord);
        } else if (totalTime <= worldRecord) {
            System.out.printf( "Yes, he succeeded! The new world record is %.02f seconds.", totalTime);
        }

    }
}
