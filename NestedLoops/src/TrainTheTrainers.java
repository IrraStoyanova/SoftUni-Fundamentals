import java.util.Scanner;

public class TrainTheTrainers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int countGrades = 0;
        double allSumGrades = 0;

        String command = scanner.nextLine();

        while(!command.equals("Finish")){
            String presentationName = command;
            double sumCurrentGrade = 0;


            for (int i = 1; i <= n ; i++) {
                double currentGrade = Double.parseDouble(scanner.nextLine());
                countGrades++;
                sumCurrentGrade = sumCurrentGrade + currentGrade;

            }
            allSumGrades = allSumGrades + sumCurrentGrade;
            double averageGradeCurrent = sumCurrentGrade/n;

            System.out.printf("%s - %.2f.%n", presentationName, averageGradeCurrent);



            command = scanner.nextLine();

        }
        double averageAll = allSumGrades/countGrades;
        System.out.printf("Student's final assessment is %.2f.",averageAll);
    }
}
