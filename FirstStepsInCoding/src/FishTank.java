import java.util.Scanner;

public class FishTank {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int length = Integer.parseInt(scanner.nextLine());
        int large = Integer.parseInt(scanner.nextLine());
        int tall = Integer.parseInt(scanner.nextLine());
        double percFree = Double.parseDouble(scanner.nextLine());

        int volume = length * large * tall;
        Double volumeLitres = volume * 0.001;
        double spaceNeeded = percFree/100;
        double litresNeeded = volumeLitres * (1 - spaceNeeded);
        System.out.println(litresNeeded);

    }
}
