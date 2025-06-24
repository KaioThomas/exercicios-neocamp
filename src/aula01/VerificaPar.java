package aula01;

import java.util.Scanner;

public class VerificaPar {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Verifica se o número é par ou impar\n");

        System.out.println("Digite o número que deseja verificar:");
        double number = scanner.nextDouble();

        System.out.println(verificaSeNumeroPar(number));
    }

    private static String verificaSeNumeroPar(double number) {
        if(number % 2 == 0) {
            return "Número par.";
        }
        return "Número impar.";
    }

}