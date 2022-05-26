import java.util.Scanner;

public class Substitute {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int k = Integer.parseInt(scanner.nextLine());
        int l = Integer.parseInt(scanner.nextLine());
        int m = Integer.parseInt(scanner.nextLine());
        int n = Integer.parseInt(scanner.nextLine());
        int count = 0;

        for (int p = 9; p >= n; p--) {
            for (int o = m; o <= 8; o++) {
                for (int j = 9; j >= l; j--) {
                    for (int i = k; i <= 8; i++) {
                        boolean isNumber = (i % 2 == 0)
                                && (j % 2 != 0)
                                && (o % 2 == 0)
                                && (p % 2 != 0);

                        if (isNumber) {
                            count++;
                            if (j == p && i == o) {
                                System.out.println("Cannot change the same player.");
                            } else {
                                System.out.printf("%d%d - %d%d%n", p,o,j,i);
                            }
                            if (count > 6) {
                                return;
                            }


                        }
                    }
                }
            }
        }
    }
}
