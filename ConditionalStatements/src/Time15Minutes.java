import java.util.Scanner;

public class Time15Minutes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int initHour = Integer.parseInt(scanner.nextLine());
        int initMin = Integer.parseInt(scanner.nextLine());

        int totalMin = (initHour * 60) + initMin + 15;
        int totalHour = totalMin / 60;
        int totalMin2 = totalMin % 60;

        if (totalHour > 23) {
            totalHour = 0;

        }

        System.out.printf("%d:%02d", totalHour, totalMin2);
    }
}
