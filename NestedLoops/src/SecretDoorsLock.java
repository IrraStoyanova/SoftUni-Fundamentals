import java.util.Scanner;

public class SecretDoorsLock {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int maxFirstNum = Integer.parseInt(scanner.nextLine());
        int maxSecondNum = Integer.parseInt(scanner.nextLine());
        int maxThirdNum = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= maxFirstNum ; i++) {
            for (int j = 1; j <= maxSecondNum ; j++) {
                for (int k = 1; k <= maxThirdNum ; k++) {
                    boolean isSecret = (i%2 == 0)
                            && (k%2 == 0)
                            && (j == 2 || j == 3 || j == 5 || j==7);

                    if (isSecret){
                        System.out.printf("%d %d %d %n", i, j, k);
                    }
                }

            }

        }


    }
}
