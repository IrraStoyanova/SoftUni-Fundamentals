import java.util.Scanner;

public class Cake {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int width = Integer.parseInt(scanner.nextLine());
        int length = Integer.parseInt(scanner.nextLine());

        int allPieces = width * length;
        String command = scanner.nextLine();

        while(!command.equals("STOP")){
            int currentPieces = Integer.parseInt(command);

            allPieces = allPieces - currentPieces;
            if (allPieces <= 0){
                break;
            }


            command = scanner.nextLine();
        }

        if (allPieces <= 0){
            System.out.printf("No more cake left! You need %d pieces more.", Math.abs(allPieces));
        } else {
            System.out.printf ("%d pieces are left.", allPieces);
        }
    }
}
