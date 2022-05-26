import java.util.Scanner;

public class Hospital {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int period = Integer.parseInt(scanner.nextLine());

        int treatedPatients = 0;
        int untreatedPatients = 0;
        int countdays = 0;
        int doctors = 7;

        for (int i = 1; i < period; i++) {
            int currentPatients = Integer.parseInt(scanner.nextLine());
            countdays++;

            if (currentPatients>doctors){
                untreatedPatients = untreatedPatients +(currentPatients - doctors);
                treatedPatients = treatedPatients + doctors;

            } else {
                treatedPatients = treatedPatients + currentPatients;
            }

            if (countdays % 2== 0){
                if (untreatedPatients > treatedPatients){
                    doctors++;
                }
            }





        }
        System.out.printf("Treated patients: %d. %n", treatedPatients);
        System.out.printf("Untreated patients: %d.", untreatedPatients);
    }
}
