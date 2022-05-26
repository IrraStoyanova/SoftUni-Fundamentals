import java.util.Scanner;

public class Graduation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //името на у-ка ->string
        //оценките ->double
        //прочитане на оценки;
        // преминава в следващ клас, ако оценката му е повече или равна на 4.
        //ако два пъти получи по-ниска оценка от 4 ->изключват го и програмата приключва
        //повтаряме: докато не станат дванайсет оценки

        String nameStudent = scanner.nextLine();

        double sumAllGrades = 0;
        int countClasses = 0;
        int countLowGrades = 0;

        while (countClasses != 12){
            double currentGrade = Double.parseDouble(scanner.nextLine());

            if (currentGrade < 4){
                countLowGrades ++;
                if (countLowGrades > 1){
                    break;
                }
            }

            sumAllGrades += currentGrade;
            countClasses ++;
        }

        if (countClasses == 12) {
            System.out.printf("%s graduated. Average grade: %.2f", nameStudent, sumAllGrades/12);
        } else {
            System.out.printf("%s has been excluded at %d grade", nameStudent, countClasses);
        }


    }
}

