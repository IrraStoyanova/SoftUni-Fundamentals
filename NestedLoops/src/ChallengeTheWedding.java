import java.util.Scanner;

public class ChallengeTheWedding {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countMan = Integer.parseInt(scanner.nextLine());
        int countWoman = Integer.parseInt(scanner.nextLine());
        int maxCountPlaces = Integer.parseInt(scanner.nextLine());

        int count = 0;

        for (int i = 1; i <= countMan ; i++) {
            for (int j = 1; j <= countWoman ; j++) {
                count++;

                if (count>maxCountPlaces){
                    return;
                }

                System.out.printf("(%d <-> %d) ", i, j);

            }
            
        }
    }
}
