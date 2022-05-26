import java.util.Scanner;

public class WeatherForecast02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        double gradus = Double.parseDouble(scanner.nextLine());

        if (gradus > 25.9) {
            System.out.println("Hot");
        } else if (gradus > 20.00) {
            System.out.println("Warm");
        } else if (gradus > 14.9) {
            System.out.println("Mild");
        } else if (gradus > 11.9) {
            System.out.println("Cool");
        } else if (gradus > 5.00) {
            System.out.println("Cold");
        } else {
            System.out.println("unknown");
        }

    }
}
