import java.util.Scanner;

public class ExamPreparation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int maxPoorGrades = Integer.parseInt(scanner.nextLine());

        int countProblems = 0;
        double sumGrades = 0;
        String lastProblem = "";
        int countPoorGrades = 0;
        String command = scanner.nextLine();




        while(!command.equals("Enough")){
            String problemName = command;
            int grade = Integer.parseInt(scanner.nextLine());


            if (grade <= 4){
                countPoorGrades ++;
            }
            if (countPoorGrades >= maxPoorGrades){
                break;
            }

            countProblems++;
            sumGrades = sumGrades + grade;
            lastProblem = problemName;

            command = scanner.nextLine();

        }

            if (countPoorGrades >= maxPoorGrades) {
            System.out.printf("You need a break, %d poor grades.", countPoorGrades);
        } else {

            System.out.printf("Average score: %.2f%n", sumGrades / countProblems);
            System.out.printf("Number of problems: %d%n", countProblems);
            System.out.printf("Last problem: %s%n", lastProblem);
        }
    }
}
