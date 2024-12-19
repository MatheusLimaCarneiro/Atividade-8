package exercicio5;

import java.util.Scanner;

public class Anagramas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a primeira palavra: ");
        String palavra1 = sc.nextLine().toLowerCase();

        System.out.print("Digite a segunda palavra: ");
        String palavra2 = sc.nextLine().toLowerCase();

        if (palavra1.length() != palavra2.length()) {
            System.out.println("As palavras NÃO são anagramas.");
            return;
        }

        char[] caracteres1 = palavra1.toCharArray();
        char[] caracteres2 = palavra2.toCharArray();

        char[] palavraInvertida1 = new char[caracteres1.length];
        for (int i = 0; i < caracteres1.length; i++) {
            palavraInvertida1[i] = caracteres1[caracteres1.length - 1 - i];
        }


        char[] palavraInvertida2 = new char[caracteres2.length];
        for (int i = 0; i < caracteres2.length; i++) {
            palavraInvertida2[i] = caracteres2[caracteres2.length - 1 - i];
        }


        boolean saoAnagramas = true;
        for (int i = 0; i < caracteres1.length; i++) {
            if (palavraInvertida1[i] != palavraInvertida2[i]) {
                saoAnagramas = false;
                break;
            }
        }

        if (saoAnagramas) {
            System.out.println("As palavras são anagramas!");
        } else {
            System.out.println("As palavras NÃO são anagramas.");
        }
    }
}
