import java.util.Scanner;

public class NumberPyramid {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        boolean isBigger = false;
        int current = 0;

        for (int rols = 1; rols <=n ; rols++) {
            for (int column = 1; column <=rols ; column++) {
                current++;
                if (current > n) {
                    isBigger = true;
                    break;
                }
                System.out.print (current + " ");


            }
            if (isBigger) {
                break;
            }
            System.out.println();

        }

    }
}
