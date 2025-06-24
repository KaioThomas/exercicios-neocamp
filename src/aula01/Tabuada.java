package aula01;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Tabuada {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um número para ver sua tabuada de 1 a 10:");
        int number = scanner.nextInt();

        showTabuada(number);
        scanner.close();
    }

    private static List<String> tabuada(int numero) {
        List<String> tabuada = new ArrayList<>();

        for(int i = 1; i <= 10; i++) {
            int result = numero * i;
            String line = numero + " * " + i + " = " + result;
            tabuada.add(line);
        }

        return tabuada;
    }

    private static void  showTabuada(int numero) {
        List<String> tabuada = tabuada(numero);

        tabuada.forEach(System.out::println);
    }
}
