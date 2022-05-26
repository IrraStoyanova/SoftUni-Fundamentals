import java.util.Scanner;

public class Building {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int floors = Integer.parseInt(scanner.nextLine());
        int rooms = Integer.parseInt(scanner.nextLine());

        for (int floor = floors; floor >=1; floor--) {
            for (int room = 0; room <= rooms -1 ; room++) {
                if (floor == floors){
                    System.out.print ("L"+ floor + room + " ");
                } else if (floor%2 == 0){
                    System.out.print ("O"+ floor + room + " ");
                } else {
                    System.out.print ("A"+ floor + room + " ");
                }

                           }
            System.out.println();

        }
    }
}
