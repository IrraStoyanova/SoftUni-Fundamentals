import java.util.Scanner;

public class MobileOperator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String timeContract = scanner.nextLine();
        String typeContract = scanner.nextLine();
        String mobileInternet = scanner.nextLine();
        int months = Integer.parseInt(scanner.nextLine());

        double taxPerMonth = 0;

        if (timeContract.equals("one")){
            if (typeContract.equals("Small")) {
                taxPerMonth = 9.98;
                if (mobileInternet.equals("yes")) {
                    taxPerMonth = 9.98 + 5.50;
                }
            }
                else if (typeContract.equals("Middle")){
                    taxPerMonth = 18.99;
                    if (mobileInternet.equals("yes")){
                        taxPerMonth = 18.99 + 4.35;
                    }
                }
                else if (typeContract.equals("Large")){
                    taxPerMonth = 25.98;
                    if (mobileInternet.equals("yes")){
                        taxPerMonth = 25.98 + 4.35;
                    }
                }
                else if (typeContract.equals("ExtraLarge")){
                    taxPerMonth = 35.99;
                    if (mobileInternet.equals("yes")){
                        taxPerMonth = 35.99 + 3.85;
                    }
                }
            }
        else if (timeContract.equals("two")){
            if (typeContract.equals("Small")) {
                taxPerMonth = 8.58;
                if (mobileInternet.equals("yes")) {
                    taxPerMonth = 8.58 + 5.50;
                }
            }
            else if (typeContract.equals("Middle")){
                taxPerMonth = 17.09;
                if (mobileInternet.equals("yes")){
                    taxPerMonth = 17.09 + 4.35;
                }
            }
            else if (typeContract.equals("Large")){
                taxPerMonth = 23.59;
                if (mobileInternet.equals("yes")){
                    taxPerMonth = 23.59 + 4.35;
                }
            }
            else if (typeContract.equals("ExtraLarge")){
                taxPerMonth = 31.79;
                if (mobileInternet.equals("yes")){
                    taxPerMonth = 31.79 + 3.85;
                }
            }

        }

        double totalSum = taxPerMonth * months;
        double totalSumWithDisc = totalSum - (totalSum*0.0375);
        if (timeContract.equals("two")){
            System.out.printf("%.2f lv.", totalSumWithDisc);
        } else {
            System.out.printf("%.2f lv.",totalSum);
        }

        }

        }


