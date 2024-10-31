package Matrizes;

import java.util.Scanner;

public class Tarefa2 {
    public static void main(String[] args) {
        int Vetor[] = new int[10], numeroPassado = 0, soma = 0;
        float media;

        Scanner leia = new Scanner(System.in);
        System.out.println("Escreva 10 valores: ");
        for (int i = 0; i < Vetor.length; i++) {
            Vetor[i] = leia.nextInt();
        }
        System.out.println("Valores pares: ");
        for (int j = 0; j < Vetor.length; j++) {
            if (Vetor[j] % 2 == 0) {
                System.out.printf("%d ", Vetor[j]);
            }
        }
        System.out.println("\n");
        System.out.println("Valores impares : ");
        for (int h = 0; h < Vetor.length; h++) {
            if (Vetor[h] % 2 != 0) {
                System.out.printf("%d ", Vetor[h]);
            }
        }
        for (int s = 0; s < Vetor.length; s++) {
            soma = Vetor[s] + numeroPassado;
            numeroPassado = soma;
        }

        System.out.println("\n A soma dos vetores é: " + soma);

        media = soma / Vetor.length;

        System.out.println("\n A média dos vetores é " + media);
        leia.close();
    }
}