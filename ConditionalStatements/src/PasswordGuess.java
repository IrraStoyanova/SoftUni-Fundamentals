import java.util.Scanner;

public class PasswordGuess {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String password = scanner.nextLine();
        String password2 = "s3cr3t!P@ssw0rd";
        if (password.equals (password2)) {
            System.out.println("Welcome");
        }
        else {
            System.out.println("Wrong password!");
        }

    }
}
