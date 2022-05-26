import java.sql.SQLOutput;
import java.util.Scanner;

public class Oscars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String nameActor = scanner.nextLine();
        double pointsAcademy = Double.parseDouble(scanner.nextLine());
        int numberTeachers = Integer.parseInt(scanner.nextLine());

        double totalPoints = pointsAcademy;


        for (int i = 1; i <= numberTeachers ; i++) {
            String nameTeacher = scanner.nextLine();
            double pointsFromTeacher = Double.parseDouble(scanner.nextLine());

            double currentPointSum = (nameTeacher.length() * pointsFromTeacher) / 2;

            if (totalPoints < 1250.5){
                totalPoints = totalPoints + currentPointSum;
            }
                    }

        if (totalPoints > 1250.5){
                System.out.printf("Congratulations, %s got a nominee for leading role with %.1f!", nameActor, totalPoints);
            } else {
                System.out.printf("Sorry, %s you need %.1f more!", nameActor, Math.abs(1250.5 - totalPoints));
        }

        }
    }

