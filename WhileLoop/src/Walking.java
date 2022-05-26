import java.util.Scanner;

public class Walking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int targetSteps = 10000;
        int reachedSteps = 0;
        String command = scanner.nextLine();

        while(!command.equals("Going home")){
            int currentSteps = Integer.parseInt(command);
            reachedSteps = reachedSteps + currentSteps;

            if (reachedSteps >=targetSteps){
                break;
            }

            command = scanner.nextLine();
        }

            if (command.equals("Going home")){
                int stepsToHome = Integer.parseInt(scanner.nextLine());
                reachedSteps = reachedSteps + stepsToHome;
            }


         int diff = Math.abs(reachedSteps-targetSteps);
        if (reachedSteps >= targetSteps) {
            System.out.println("Goal reached! Good job!");
            System.out.printf("%d steps over the goal!%n", diff);
        } else {
            System.out.printf("%d more steps to reach goal.",diff);
        }

        }

        }



