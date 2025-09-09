package ex1;

import java.util.Scanner;

public class Ex1Main {
    public static void main(String[] args) {
        // 1.1
        Scanner scanner = new Scanner(System.in);
        System.out.println("Inserisci una parola e ti dirò se il numero di caratteri è pari o dispari: ");
        String parola = scanner.nextLine();
        boolean str = stringaPariDispari(parola);
        if (str) {
            System.out.println("Il numero dei caratteri è pari");
        } else {
            System.out.println("Il numero di caratteri è dispari");
        }

        // 1.2
        System.out.println("-------------------------------------------------");
        System.out.println("Inserisci un'anno e ti dirò se è bisestile: ");
        int anno = scanner.nextInt();
        boolean annoRicevuto = annoBisestile(anno);

        if (annoRicevuto) {
            System.out.println(anno + " è un anno bisestile");
        } else {
            System.out.println(anno + " non è un anno bisestile");
        }
        scanner.close();
    }

    public static boolean stringaPariDispari(String str) {
        return str.length() % 2 == 0;
    }

    public static boolean annoBisestile(int anno) {
        boolean annoBisNoBis = false;

        if (anno % 4 == 0) {
            annoBisNoBis = true;
        } else if (anno % 100 == 0) {
            if (anno % 400 == 0) {
                annoBisNoBis = true;
            }
        }
        return annoBisNoBis;
    }
}
