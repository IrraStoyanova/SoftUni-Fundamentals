import java.util.Scanner;

public class TriangleOfNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());

        for (int row = 1; row <= number ; row++) {
            for (int count = 1; count <= row ; count++) {
                System.out.print(row+ " ");

            }
            System.out.println();

        }
    }
}
