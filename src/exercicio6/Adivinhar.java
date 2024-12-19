package exercicio6;

import java.util.Random;
import java.util.Scanner;

public class Adivinhar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Random random = new Random();
        int numeroEscolhido = random.nextInt(50) + 1;

        int palpite = 0;

        while (palpite != numeroEscolhido) {
            System.out.print("Digite seu palpite (1 a 50): ");
            palpite = sc.nextInt();

            if (palpite < numeroEscolhido) {
                System.out.println("O número é maior. Tente novamente!");
            } else if (palpite > numeroEscolhido) {
                System.out.println("O número é menor. Tente novamente!");
            } else {
                System.out.println("Parabéns! Você adivinhou o número!");
            }
        }
    }
}
