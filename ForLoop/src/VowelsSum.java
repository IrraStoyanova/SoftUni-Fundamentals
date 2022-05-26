import java.util.Scanner;

public class VowelsSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();
        int sum = 0;

        for (int position = 0; position <= text.length()-1; position++){

            char currentSymbol = text.charAt(position);
            switch (currentSymbol){
                case 'a':
                    sum = sum +1;
                    break;
                case 'e':
                    sum = sum +2;
                    break;
                case 'i':
                    sum = sum + 3;

                    break;
                case 'o':
                    sum = sum + 4;
                    break;
                case 'u':
                    sum = sum + 5;
                    break;

            }

        }
        System.out.println(sum);
    }
}
