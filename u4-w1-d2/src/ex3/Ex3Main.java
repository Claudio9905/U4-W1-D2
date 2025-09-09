package ex3;

// import java.util.Arrays;

import java.util.Scanner;

public class Ex3Main {
    public static void main(String[] args) {

        // 3.1
        System.out.println("Inserisci una parola e ti separo ogni carattera da una virgola (inserire ':q' se si vuole uscire): ");
        dividedString();

    }

    public static void dividedString() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            String parola = scanner.nextLine();
            if (parola.equals(":q")) {
                break;
            } else {
                System.out.println(String.join(",", parola.split("")));
                /*for (int i = 0; i < parola.length(); i++) {
                    System.out.print(parola.charAt(i));
                  if (i < parola.length() - 1) {
                        System.out.print(",");
                    }
                */
            }

            scanner.close();
        }
    }

}

