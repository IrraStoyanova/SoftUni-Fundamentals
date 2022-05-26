import java.util.Scanner;

public class HairSalon {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int dayGoal = Integer.parseInt(scanner.nextLine());

        String service = scanner.nextLine();
        int moneyEarned = 0;

        while(!service.equals("closed")){
            if (service.equals("haircut")){
                String typeHaircut = scanner.nextLine();
                if (typeHaircut.equals("mens")){
                    moneyEarned = moneyEarned + 15;

                } else if (typeHaircut.equals("ladies")){
                    moneyEarned = moneyEarned + 20;

                } else if (typeHaircut.equals("kids")){
                    moneyEarned = moneyEarned + 10;

                }

            } else if (service.equals("color")){
                String typeColor = scanner.nextLine();
                if (typeColor.equals("touch up")){
                    moneyEarned = moneyEarned + 20;

                } else if (typeColor.equals("full color")){
                    moneyEarned = moneyEarned + 30;
                }
            }
            if(moneyEarned >= dayGoal){
                break;
            }

            service = scanner.nextLine();
        }
        int diff = Math.abs(dayGoal-moneyEarned);
        if (moneyEarned >= dayGoal){
            System.out.printf("You have reached your target for the day!%n");
            System.out.printf("Earned money: %dlv.",moneyEarned);
        } else if (moneyEarned < dayGoal){
            System.out.printf("Target not reached! You need %dlv. more.%n",diff);
            System.out.printf("Earned money: %dlv.", moneyEarned);
        }


    }
}
