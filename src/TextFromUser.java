import java.util.Scanner;

public class TextFromUser {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj Imie ");
        String Seba = scanner.nextLine();
        System.out.println("Podaj Nazwisko ");
        String Szymanski = scanner.nextLine();
        System.out.println("Podaj Wiek");
        int wiek = scanner.nextInt();
        System.out.println("Witaj " + "Imie " + "Nazwisko " + "Masz " +wiek + " lat " );

    }
}
