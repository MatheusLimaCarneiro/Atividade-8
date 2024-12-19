package exercicio2;

import java.util.Scanner;

public class Palindromo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.println("Digite uma palavra: ");
        String palavra = sc.nextLine();


        String palavraNormalizada = "";
        for (int i = 0; i < palavra.length(); i++) {
            char c = palavra.charAt(i);
            if (c != ' ') {
                palavraNormalizada += Character.toLowerCase(c);
            }
        }

        String palavraInvertida = "";
        for (int i = palavraNormalizada.length() - 1; i >= 0; i--) {
            palavraInvertida += palavraNormalizada.charAt(i);
        }

        if (palavraNormalizada.equals(palavraInvertida)) {
            System.out.println("A palavra \"" + palavra + "\" é um palíndromo!");
        } else {
            System.out.println("A palavra \"" + palavra + "\" não é um palíndromo.");
        }
    }
}
