import java.util.Scanner;

public class AluminumJoinery {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countAluminum = Integer.parseInt(scanner.nextLine());
        String typeAluminum = scanner.nextLine();
        String typeOfDelivery = scanner.nextLine();
        double totalPrice = 0;

       double price = 0;
       double priceWithDisc = 0;


// Над 30 броя – 5%
// Над 60 броя – 8%

        if (countAluminum <10){
            System.out.println("Invalid order");
            return;
        }
        if (typeAluminum.equals("90X130")){
            price = countAluminum * 110;
            if (countAluminum > 60){
                priceWithDisc = price - (price * 0.08);

            } else if (countAluminum > 30){
                priceWithDisc = price - (price * 0.05);
            } else {
                priceWithDisc = price;
            }
        }
//100X150	140 лв.	 Над 40 броя – 6%
//   Над 80 броя – 10%
        if (typeAluminum.equals("100X150")){
            price = countAluminum * 140;
            if (countAluminum > 80){
                priceWithDisc = price - (price * 0.10);
            } else if (countAluminum > 40){
                priceWithDisc = price - (price * 0.06);
            } else {
                priceWithDisc = price;
            }
        }

        //130X180	190 лв.	 Над 20 броя – 7%
        //   Над 50 броя – 12%

        if (typeAluminum.equals("130X180")){
            price = countAluminum * 190;
            if (countAluminum > 50){
                priceWithDisc = price - (price * 0.12);
            } else if (countAluminum>20){
                priceWithDisc = price - (price * 0.07);
            } else {
                priceWithDisc = price;
            }
        }

        //200X300	250 лв.	 Над 25 броя – 9%
        //   Над 50 броя – 14%

        if (typeAluminum.equals("200X300")){
            price = countAluminum * 250;
            if (countAluminum > 50){
                priceWithDisc = price - (price * 0.14);
            } else if (countAluminum > 25){
                priceWithDisc = price - (price * 0.09);
            } else {
                priceWithDisc = price;
            }
        }

        if (typeOfDelivery.equals("With delivery")){
            totalPrice = priceWithDisc + 60;

        } else if (typeOfDelivery.equals("Without delivery")){
            totalPrice = priceWithDisc;
        }
        if (countAluminum > 99){
            totalPrice = totalPrice - (totalPrice * 0.04);
        }

        System.out.printf("%.2f BGN", totalPrice);

    }
}
