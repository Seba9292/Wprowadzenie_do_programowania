import java.util.Objects;
import java.util.Scanner;

public class Zadanie {
    public static void main(String[] args) {
            /**
             * 1.chce aby w programie było pytanie o imie i nazwisko i wiek
             * 2.chce zeby po zapytaniu o wiek byla petla sprawdzajaca czy osoba jest pelnoletnia czy nie - (przy pelnoletniej napis zapraszam do klubu, a jezeli nie to napis wypad)
             *
             */
            String[] wygrani = new String[]{"Monia", "Seba", "Magda", "Piotrek", "Adam"};
            Scanner scanner = new Scanner(System.in);
            System.out.println("podaj imie");
            String imie = scanner.next();
            System.out.println("podaj nazwisko");
            String naziwsko = scanner.next();
            System.out.println("Podaj wiek");
            int wiek = scanner.nextInt();
            if (wiek>=18){
                System.out.println("zapraszam do klubu");
                for (String wygrany: wygrani){
                    if(Objects.equals(imie, wygrany)){
                        System.out.println("Dostajesz darmowego szota ;)");
                    }
                }
            }
            if(wiek<18){
                System.out.println("wypad xD");
            }

        }
    }