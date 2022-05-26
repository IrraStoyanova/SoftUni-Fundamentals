import java.util.Scanner;

public class UniquePinCodes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int maxFirstNum = Integer.parseInt(scanner.nextLine());
        int maxSecondNum = Integer.parseInt(scanner.nextLine());
        int maxThirdNum = Integer.parseInt(scanner.nextLine());



        for (int i = 1; i <= maxFirstNum; i++) {
            for (int j = 2; j <=maxSecondNum; j++) {
                for (int k = 1; k <=maxThirdNum ; k++) {
                    boolean isValid = (i % 2 ==0)
                            && ( j == 2 || j == 3 || j == 5 || j == 7)
                            && ( k % 2 == 0);
                    if (isValid){
                        System.out.printf("%d %d %d%n", i, j, k);
                    }

                }

            }



        }

    }
}
