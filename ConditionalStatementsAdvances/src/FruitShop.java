import java.util.Scanner;

public class FruitShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        String fruit = scanner.nextLine();
        String dayOfWeek = scanner.nextLine();
        double quantity = Double.parseDouble(scanner.nextLine());

        double sum  = 0;


        if (dayOfWeek.equals("Monday") || dayOfWeek.equals("Tuesday") || dayOfWeek.equals("Wednesday") || dayOfWeek.equals("Thursday") || dayOfWeek.equals("Friday")) {
            switch (fruit){
                case "banana":
                    sum = quantity*2.50;
                    System.out.printf("%.2f", sum);
                    break;
                case "apple":
                    sum = quantity*1.20;
                    System.out.printf("%.2f", sum);
                    break;
                case "orange":
                    sum = quantity * 0.85;
                    System.out.printf("%.2f", sum);
                    break;
                case "grapefruit":
                    sum =quantity * 1.45;
                    System.out.printf("%.2f", sum);
                    break;
                case "kiwi":
                    sum =quantity * 2.70;
                    System.out.printf("%.2f", sum);
                    break;
                case "pineapple":
                    sum = quantity * 5.50;
                    System.out.printf("%.2f", sum);
                    break;
                case "grapes":
                    sum =quantity * 3.85;
                    System.out.printf("%.2f", sum);
                    break;
                default:
                    System.out.println("error");
                    break;
            }


        } else if (dayOfWeek.equals("Saturday") || dayOfWeek.equals("Sunday")) {
            switch (fruit){
                case "banana":
                    sum = quantity * 2.70;
                    System.out.printf("%.2f", sum);
                    break;
                case "apple":
                    sum =quantity * 1.25;
                    System.out.printf("%.2f", sum);
                    break;
                case "orange":
                    sum = quantity * 0.90;
                    System.out.printf("%.2f", sum);
                    break;
                case "grapefruit":
                    sum = quantity * 1.60;
                    System.out.printf("%.2f", sum);
                    break;
                case "kiwi":
                    sum = quantity * 3.00;
                    System.out.printf("%.2f", sum);
                    break;
                case "pineapple":
                    sum = quantity * 5.60;
                    System.out.printf("%.2f", sum);
                    break;
                case "grapes":
                    sum = quantity * 4.20;
                    System.out.printf("%.2f", sum);
                    break;
                default:
                    System.out.println("error");
                    break;
            }

        } else {
            System.out.println("error");
        }



    }
}
