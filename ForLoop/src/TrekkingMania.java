import java.util.Scanner;

public class TrekkingMania {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberGroups = Integer.parseInt(scanner.nextLine());


        //•	Група до 5 човека – изкачват Мусала
        //•	Група от 6 до 12 човека – изкачват Монблан
        //•	Група от 13 до 25 човека – изкачват Килиманджаро
        //•	Група от 26 до 40 човека –  изкачват К2
        //•	Група от 41 или повече човека – изкачват Еверест
        int musala = 0;
        int monblan = 0;
        int kilimandjaro = 0;
        int kadve = 0;
        int everest = 0;
        int allPeople = 0;

        for (int i = 1; i <=numberGroups ; i++) {

           int peopleInGroup = Integer.parseInt(scanner.nextLine());
           allPeople = allPeople + peopleInGroup;

            if (peopleInGroup <=5){
                musala = musala + peopleInGroup;

            } else if ( peopleInGroup <= 12){
                monblan = monblan + peopleInGroup;

            } else if ( peopleInGroup <=25){
                kilimandjaro = kilimandjaro + peopleInGroup;

            } else if ( peopleInGroup <= 40){
                kadve = kadve + peopleInGroup;

            } else if (peopleInGroup > 40){
                everest = everest + peopleInGroup;

            }

        }
        System.out.printf("%.2f%%", (musala * 1.0/allPeople) * 100);
        System.out.println();
        System.out.printf("%.2f%%", (monblan * 1.0/allPeople) * 100);
        System.out.println();
        System.out.printf("%.2f%%", (kilimandjaro * 1.0/allPeople) * 100);
        System.out.println();
        System.out.printf("%.2f%%", (kadve * 1.0/allPeople) * 100);
        System.out.println();
        System.out.printf("%.2f%%", (everest * 1.0/allPeople) * 100);
        System.out.println();
    }
}
