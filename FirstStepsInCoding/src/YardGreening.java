import java.util.Scanner;

public class YardGreening {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        Double area = Double.parseDouble(scanner.nextLine());
        double priceall = area * 7.61;
        double discount = priceall * 0.18;
        double finalPrice = priceall - discount;
        System.out.println ("The final price is:" + finalPrice + " lv.");
        System.out.println ("The discount is:" + discount + " lv.");
    }
}
