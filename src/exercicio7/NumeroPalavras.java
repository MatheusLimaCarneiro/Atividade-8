package exercicio7;

import java.util.Scanner;

public class NumeroPalavras {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite uma frase: ");
        String frase = scanner.nextLine();

        String[] palavras = frase.split("\\s+");

        int numeroDePalavras = palavras.length;

        System.out.println("Número de palavras: " + numeroDePalavras);
    }
}
