import java.util.Scanner;

public class Moving {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int width = Integer.parseInt(scanner.nextLine());
        int length = Integer.parseInt(scanner.nextLine());
        int height = Integer.parseInt(scanner.nextLine());
        int totalSpace = width * length * height;

        String command = scanner.nextLine();


        while(!command.equals("Done")){
            int currentBoxes = Integer.parseInt(command);

            totalSpace = totalSpace - currentBoxes;

            if (totalSpace <=0){
                break;
            }
            command = scanner.nextLine();
        }

        if (totalSpace <= 0){
            System.out.printf("No more free space! You need %d Cubic meters more.", Math.abs(totalSpace));
        } else {
            System.out.printf("%d Cubic meters left.", totalSpace);
        }
    }
}
