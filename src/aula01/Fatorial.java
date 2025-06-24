package aula01;

import java.util.Scanner;

public class Fatorial {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um número para ver seu fatorial:");
        int number = scanner.nextInt();

        if(numberIsException(number)) {
            scanner.close();
            return;
        }
        factorial(number);
        scanner.close();
    }

    private static void factorial(int numero) {
        int operation = numero;
        String factorial = "";

        for (int i = 1; i <= numero - 1; i++) {
            operation = operation * (numero - i);
            factorial = factorial + (numero - i) + ((numero - i) <= 1 ? "" : " * ");
        }

        System.out.println(numero + "! = " + (numero <= 1 ? numero : numero + " * " + factorial + " = " + operation));
    }


    private static boolean numberIsException(int numero) {
        if(numero == 0) {
            System.out.println("0! = 1");
            return true;
        }
        return false;
    }

}
