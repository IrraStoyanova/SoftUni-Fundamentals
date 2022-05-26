import java.util.Scanner;

public class Ages {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int ages = Integer.parseInt(scanner.nextLine());

        //•	0-2 – baby;
        //•	3-13 – child;
        //•	14-19 – teenager;
        //•	20-65 – adult;
        //•	>=66 – elder;
        //•	All the values are inclusive.

        if (ages >= 0 && ages <=2){
            System.out.println("baby");
        } else if (ages >=3 && ages <= 13){
            System.out.println("child");
        } else if (ages >=14 && ages <= 19){
            System.out.println("teenager");
        } else if (ages >=20 && ages <=65){
            System.out.println("adult");
        } else if (ages >=66){
            System.out.println("elder");
        }
    }
}
