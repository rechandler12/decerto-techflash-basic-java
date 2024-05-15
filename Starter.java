import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Starter {
    public static void main(String[] args) {
        // Zad 1.
        // Wypisz na konsoli Hello World!

        System.out.println("Hello World!");
//        System.out.println(conditional());
//        loopFor();
//        loopWhile();
//        throwRuntimeException();
        try {
            throwException();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static String conditional() {
        // Zad 2.
        /*
        Wczytaj liczbę od użytkownika i jeśli jest większa niż 10 to wypisz "Większa niż 10!", a jeśli jest mniejsza to
        wypisz "Mniejsza niż 10!"
        */

        System.out.print("Podaj liczbe: ");
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        int liczba = Integer.parseInt(s);

        if (liczba > 10) {
            return "Większa niż 10!";
        } else if (liczba < 10) {
            return "Mniejsza niż 10!";
        }
        return "Równa 10!";
    }

    public static void loopFor() {
        // Zad 3.
        /*
        Wypisz "Przebieg pętli for [X]!", gdzie X to, który przebieg pętli, a liczbę przebiegów ma wprowadzić user.
        Użyj pętli for
        */

        System.out.print("Podaj liczbe: ");
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        int liczba = Integer.parseInt(s);

        for (int i = 0; i < liczba; i++) {
            System.out.println("Przebieg pętli for [" + i + "]!");
        }
    }

    public static void loopWhile() {
        // Zad 4.
        /*
        Wypisz "Przebieg pętli while [X]!", gdzie X to, który przebieg pętli, a liczbę przebiegów ma wprowadzić user.
        Użyj pętli while
        */

        System.out.print("Podaj liczbe: ");
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        int liczba = Integer.parseInt(s);

        int i = 0;
        while (i < liczba) {
            System.out.println("Przebieg pętli while [" + i + "]!");
            i++;
        }
    }

    public static void fillList() {
        // Zad 5.
        /*
        Stwórz listę, dodawaj do niej elementy (String), dopóki nie będzie wprowadzony pusty String
        Następnie wypisz każdy element listy
        */

        List<String> list = new ArrayList<>();
        Scanner in = new Scanner(System.in);
        while (true) {
            System.out.print("Podaj element: ");
            String s = in.nextLine();
            if (s == null || s.isEmpty()) {
                break;
            }
            list.add(s);
        }

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }

    private static boolean isEmpty(String str) {
        return str == null || str.isEmpty();
    }

    public static void fillArray() {
        // Zad 6.
        List<String> list = new ArrayList<>();
        String[] arr = new String[100];


        /*
        Stwórz tablicę, dodawaj do niej elementy (String), dopóki nie będzie wprowadzony pusty String
        Następnie wypisz tablicę
        */
    }

    public static String throwRuntimeException() {
        // Zad 7.
        /*
        Zmodyfikuj zadanie 2 o obsługę warunków brzegowych, rzuć IllegalStateException z odpowiednim message
        */

        System.out.print("Podaj liczbe: ");
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        int liczba = Integer.parseInt(s);

        if (liczba > 10) {
            return "Większa niż 10!";
        } else if (liczba < 10) {
            return "Mniejsza niż 10!";
        }
        throw new IllegalStateException("Liczba rowna 10!");
    }

    public static String throwException() throws Exception {
        // Zad 8.
        /*
        Zmodyfikuj zadanie 2 o obsługę warunków brzegowych, rzuć Exception z odpowiednim message
        Złap go w metodzie main i przekształć na odpowiednią zwrotkę na konsolę
        */

        System.out.print("Podaj liczbe: ");
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        int liczba = Integer.parseInt(s);

        if (liczba > 10) {
            return "Większa niż 10!";
        } else if (liczba < 10) {
            return "Mniejsza niż 10!";
        }
        throw new Exception("Liczba rowna 10!");
    }
}
