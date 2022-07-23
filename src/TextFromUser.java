import java.util.Scanner;

public class TextFromUser {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println(" Provide Username ");
        String Username = scanner.nextLine();

        System.out.println(" Provide Surname ");
        String Surname = scanner.nextLine();

        System.out.println(" Provide Age");
        int Age = scanner.nextInt();
        System.out.println (" Witaj " + Username  +  Surname  + " You are " + Age + " Years " );
    }
}
