import java.util.Scanner;

public class Exam {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int count6 = 0;
        int count5 = 0;
        int count4 = 0;
        int count3 = 0;
        int count = 0;
        double allGrades = 0;

        for (int i = 1; i <= n ; i++) {
            double grade = Double.parseDouble(scanner.nextLine());
            allGrades = allGrades + grade;
            count++;

            if (grade>=5){
                count6++;
            } else if (grade>=4){
                count5++;
            } else if (grade>=3){
                count4++;
            } else if (grade<3){
                count3++;
            }

        }
        double percentCount6 = count6*1.00/n*100;
        double percenCount5 = count5*1.00/n*100;
        double percentCount4 = count4*1.00/n*100;
        double percentCount3 = count3*1.00/n*100;
        double averageGrade = allGrades/count;

        System.out.printf("Top students: %.2f%%%n", percentCount6);
        System.out.printf("Between 4.00 and 4.99: %.2f%%%n", percenCount5);
        System.out.printf("Between 3.00 and 3.99: %.2f%%%n", percentCount4);
        System.out.printf("Fail: %.2f%%%n",percentCount3);
        System.out.printf("Average: %.2f", averageGrade);


    }
}
