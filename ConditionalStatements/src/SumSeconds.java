import java.util.Scanner;

public class SumSeconds {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstTime = Integer.parseInt (scanner.nextLine());
        int secondTime = Integer.parseInt(scanner.nextLine());
        int thirdTime = Integer.parseInt(scanner.nextLine());

        int totalTimeSec = firstTime + secondTime + thirdTime;
        int totalTimeMin = totalTimeSec/60;
        int totalTimeRemain = totalTimeSec % 60;

        System.out.printf("%d:%02d", totalTimeMin, totalTimeRemain);



    }
}
