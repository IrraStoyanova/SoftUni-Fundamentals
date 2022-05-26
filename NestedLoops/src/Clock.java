import java.util.Scanner;

public class Clock {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        for (int hour = 0; hour <= 23; hour++) {
            for (int minutes = 0; minutes <= 59; minutes++) {
                System.out.println(hour + ":" + minutes);

            }

        }
    }
}
