import java.util.Scanner;

public class Zadanie {
    public static void main(String[] args) {
        /**
         * 1. Chce aby w programie bylo pytanie o imie i nazwisko i wiek
         * 2. chce zeby po zapytaniu o wiek byla petla sprawdzajaca czy osoba jest pelnoletnia (przy nie napis wypad)
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("podaj imie");
        String imie = scanner.next();
        System.out.println("podaj nazwisko");
        String nazwisko = scanner.next();
        System.out.println("podaj wiek");
        int wiek = scanner.nextInt();
        if (wiek >= 18){
            System.out.println("zapraszam do klubu");
        }
        if (wiek < 18){
            System.out.println("wypad");
        }


        }
        }