import java.util.Scanner;

public class RadiansToDegrees {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double radiant = Double.parseDouble(scanner.nextLine());
        double degrees = radiant * 180/Math.PI;

        System.out.println(degrees);

    }
}
