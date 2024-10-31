package Matrizes;

import java.util.Scanner;

public class Tarefa1 {
    public static void main(String[] args) {
        int Vetor[] ={2,5,1,3,4,9,7,8,10,6} , digitado , i ;
        boolean encontrado = false;

        Scanner leia = new Scanner(System.in);
        System.out.println("Confira a posição do número que você digitar");
        digitado = leia.nextInt();
        for (i = 0 ; i < Vetor.length ; i++){
            if(digitado == Vetor[i]) {
                System.out.println("a posição do número que você digitou é " + (i + 1));
                encontrado = true;
                break;
            }
        }
        if (!encontrado){
            System.out.println("Não foi encontrado");
        }
    }
}

