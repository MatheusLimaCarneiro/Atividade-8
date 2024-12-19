package exercicio4;

import java.util.Scanner;

public class NumeroInvertido {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] numInvertido = new int[4];
        int[] numeros = new int[4];

        System.out.println("Digite 4 números: ");
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = sc.nextInt();
        }

        for (int i = numeros.length - 1, j = 0; i >= 0; i--, j++) {
            numInvertido[j] = numeros[i];
        }

        System.out.println("Numeros invertidos: ");
        for (int num: numInvertido){
            System.out.println(num);
        }
    }
}
