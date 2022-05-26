import java.util.Scanner;

public class VendingMachine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        double totalSum = 0;
        String command = scanner.nextLine();

        while (!command.equals("Start")){
            double coin = Double.parseDouble(command);
        if (coin != 0.1 && coin != 0.2 && coin != 0.5 && coin != 1 && coin != 2){
            System.out.printf("Cannot accept %.2f%n", coin);
        } else {
            totalSum += coin;
        }
        command = scanner.nextLine();
        }

        String product = scanner.nextLine();

        //Nuts", "Water", "Crisps", "Soda", "Coke"

        while (!product.equals("End")) {
            boolean hasMoney = true;
            switch (product) {
                case "Nuts":
                    if (totalSum < 2) {
                        System.out.println("Sorry, not enough money");
                        hasMoney = false;
                    } else {
                        totalSum -= 2;
                    }
                    break;
                case "Water":
                    if (totalSum < 0.7) {
                        System.out.println("Sorry, not enough money");
                        hasMoney = false;
                    } else {
                        totalSum -= 0.7;
                    }
                    break;
                case "Crisps":
                    if (totalSum < 1.5) {
                        System.out.println("Sorry, not enough money");
                        hasMoney = false;
                    } else {
                        totalSum -= 1.5;
                    }
                        break;

                case "Soda":
                    if (totalSum < 0.8) {
                        System.out.println("Sorry, not enough money");
                        hasMoney = false;
                    } else {
                        totalSum -= 0.8;
                    }
                        break;

                case "Coke":
                    if (totalSum < 1) {
                        System.out.println("Sorry, not enough money");
                        hasMoney = false;
                    } else {
                        totalSum -= 1;
                    }
                        break;

                default:
                    System.out.println("Invalid product");
                    hasMoney = false;
                    break;
            }
            if (!hasMoney) {
                product = scanner.nextLine();
                continue;
            }
            System.out.printf("Purchased %s%n", product);
            product = scanner.nextLine();
        }
        System.out.printf("Change: %.2f", totalSum);



           }

        }




