package exercicio1;

import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o primeiro número: ");
        int num = sc.nextInt();

        System.out.println("Digite o segundo número: ");
        int num2 = sc.nextInt();

        System.out.println("Escolha a operação (+, -, *, /): ");
        String operacao = sc.next();

        double resultado;

        switch (operacao) {
            case "+" -> {
                resultado = num + num2;
                System.out.println("Resultado: " + resultado);
            }
            case "-" -> {
                resultado = num - num2;
                System.out.println("Resultado: " + resultado);
            }
            case "*" -> {
                resultado = num * num2;
                System.out.println("Resultado: " + resultado);
            }
            case "/" -> {
                if (num2 != 0) {
                    resultado = (double) num / num2;
                    System.out.println("Resultado: " + resultado);
                } else {
                    System.out.println("Erro: Divisão por zero não é permitida.");
                }
            }
            default -> System.out.println("Operação inválida. Tente novamente.");
        }
    }
}
