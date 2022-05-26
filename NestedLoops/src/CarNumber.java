import java.util.Scanner;

public class CarNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int startInterval = Integer.parseInt(scanner.nextLine());
        int endInterval = Integer.parseInt(scanner.nextLine());



        for (int i = startInterval; i <= endInterval ; i++) {
            for (int j = startInterval; j <= endInterval ; j++) {
                for (int k = startInterval; k <= endInterval ; k++) {
                    for (int l = startInterval; l <=endInterval ; l++) {
                        boolean isValid = (( i % 2 ==0 && l % 2 != 0) || (i % 2 != 0) && (l%2 ==0))
                                && (i > l)
                                && (j + k) % 2 == 0;
                        if (isValid) {
                            System.out.printf("%d%d%d%d ", i, j, k, l);
                        }

                    }

                }

            }

        }
    }
}
