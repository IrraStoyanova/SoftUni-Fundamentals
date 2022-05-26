import java.util.Scanner;

public class TheatrePromotion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String typeofDay = scanner.nextLine();
        int age = Integer.parseInt(scanner.nextLine());

        boolean isNotValid = false;
        int price = 0;

        if (age >= 0 && age <=18){
            if (typeofDay.equals("Weekday")){
                price = 12;
            } else if (typeofDay.equals("Weekend")){
                price = 15;
            } else if (typeofDay.equals("Holiday")){
                price = 5;
            }

        } else if (age > 18 && age <= 64){
            if (typeofDay.equals("Weekday")){
                price = 18;
            } else if (typeofDay.equals("Weekend")){
                price = 20;
            } else if (typeofDay.equals("Holiday")){
                price = 12;
            }

        } else if (age > 64 && age <= 122){
            if (typeofDay.equals("Weekday")){
                price = 12;
            } else if (typeofDay.equals("Weekend")){
                price = 15;
            } else if (typeofDay.equals("Holiday")){
                price = 10;
            }

        } else {
            isNotValid = true;
        }

        if (isNotValid){
            System.out.println("Error!");
        } else {
        System.out.printf("%d$", price);
        }
    }
}
