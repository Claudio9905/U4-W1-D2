package ex2;

import java.util.Scanner;

public class Ex2Main {
    public static void main(String[] args) {

        // 2.1
        Scanner scanner = new Scanner(System.in);
        System.out.println("Inserisci un numero tra 0 e 3 e te lo stampo in lettere: ");
        int numero = scanner.nextByte();
        stampaInLettere(numero);
        scanner.close();
    }

    public static void stampaInLettere(int num) {
        switch (num) {
            case 0 -> System.out.println("Zero");
            case 1 -> System.out.println("Uno");
            case 2 -> System.out.println("Due");
            case 3 -> System.out.println("Tre");
            default -> System.out.println("Il numero non è compreso tra 0 e 3");
        }
    }
}
