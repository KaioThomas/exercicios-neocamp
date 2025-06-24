package aula01;

import java.util.List;
import java.util.Scanner;

public class Calculadora {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Calculadora\n");

        System.out.println("Digite a operação que deseja realizar:");
        String operation = scanner.nextLine();

        System.out.println("Digite o primeiro número que deseja efetuar a operação:");
        double x = scanner.nextDouble();

        System.out.println("Digite o segundo número que deseja efetuar a operação:");
        double y = scanner.nextDouble();

       if(isValidOperation(operation)) {
           double result = calculate(x, y, operation);
           System.out.println("Resultado: " + result + "\n");
       } else {
           System.out.println("Operação inválida\n");
           scanner.close();
       }
    }

    private static double calculate(double x, double y, String operation) {

        return switch (operation) {
            case "+" -> x + y;
            case "-" -> x - y;
            case "*" -> x * y;
            case "/" -> x / y;
            default -> 0;
        };
    }

    private static boolean isValidOperation(String operation) {
        List<String> operations = List.of(new String[]{"+", "-", "*", "/"});
        return operations.stream().anyMatch(operation::equals);
    }
}