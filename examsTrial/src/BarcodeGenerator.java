import java.util.Scanner;

public class BarcodeGenerator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int firstNum = Integer.parseInt(scanner.nextLine());
        int secondNum = Integer.parseInt(scanner.nextLine());

        int num = 0;
        int num1 = 0;
        int num2 = 0;
        int num3 = 0;
        int num4 = 0;

        int secondNum1 = 0;
       int num5 = secondNum%10;
       secondNum1 = secondNum/10;
       int num6 = secondNum1%10;
       secondNum1 = secondNum1/10;
       int num7 = secondNum1%10;
       secondNum1 = secondNum1/10;
       int num8 = secondNum1%10;

       int jTrue = 0;
       int kTrue = 0;
       int lTrue = 0;
       int mTrue = 0;
        for (int i = firstNum; i <=secondNum ; i++){
            num1 = i%10;
            num = i/10;
            num2 = num%10;
            num = num/10;
            num3 = num%10;
            num = num/10;
            num4 = num%10;

            for (int j = num1; j <= num5 ; j++) {
                if (j%2 != 0){
                    jTrue = j;
                }
                for (int k = num2; k <= num6 ; k++) {
                    if (k%2 != 0){
                        kTrue = k;
                    }
                    for (int l = num3; l <= num7 ; l++) {
                        if (l%2 != 0){
                            lTrue = l;
                        }
                        for (int m = num4; m <= num8 ; m++) {
                            if (m%2 != 0){
                            mTrue = m;
                            }

                        }
                    }

                }

            }



            System.out.printf("%d%d%d%d ",mTrue, lTrue, kTrue, jTrue);
        }
        
    }
}

