package ex4;

import java.util.Scanner;

public class Ex4Main {
    public static void main(String[] args) {
        
        //4.1
        Scanner scanner = new Scanner(System.in);
        System.out.println("Inserisci una serie di numeri e ti farò il conto alla rovescia");
        int numero = scanner.nextInt();
        countDown(numero);
        scanner.close();

    }

    public static void countDown(int num) {

        for (int i = num; i >= 0; i--) {
            System.out.println(i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

    }
}
