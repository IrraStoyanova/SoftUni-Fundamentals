import java.util.Scanner;

public class Vacation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numbPeople = Integer.parseInt(scanner.nextLine());
        String typePeople = scanner.nextLine();
        String dayOfWeek = scanner.nextLine();
        double price = 0;


        if (typePeople.equals("Students")){
            switch(dayOfWeek){
                case "Friday":
                    price = numbPeople * 8.45;
                    break;
                case "Saturday":
                    price = numbPeople * 9.80;
                    break;
                case "Sunday":
                    price = numbPeople * 10.46;
                    break;

            }
            if (numbPeople >= 30) {
                price = price * 0.85;
            }
        } else if (typePeople.equals("Business")){
            switch (dayOfWeek){
                case "Friday":
                    price = numbPeople * 10.90;
                    if (numbPeople>= 100){
                        price = (numbPeople-10) * 10.90;
                    } break;
                case "Saturday":
                    price = numbPeople * 15.60;
                    if (numbPeople>= 100){
                        price = (numbPeople-10) * 15.60;}
                    break;
                case "Sunday":
                    price = numbPeople * 16;
                    if (numbPeople>= 100){
                        price = (numbPeople-10) * 16;
            } break;
            }
        } else if (typePeople.equals("Regular")){
            switch (dayOfWeek){
                case "Friday":
                    price = numbPeople * 15;
                    break;
                case "Saturday":
                    price = numbPeople * 20;
                    break;
                case "Sunday":
                    price = numbPeople * 22.50;
                    break;
            }
            if (numbPeople >= 10 && numbPeople <=20){
                price = price*0.95;
            }
        }
        System.out.printf("Total price: %.2f", price);

    }
}
