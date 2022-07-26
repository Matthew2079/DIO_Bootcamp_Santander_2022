package Estruturas_Repeticao_Arrays.Arrays;

/*
Faça um Programa que leia 20 números inteiros aleatórios (entre 0 e 100) armazene-os num vetor.
Ao final mostre os números e seus sucessores.
*/

import java.util.Random;

public class Ex3_NumerosAleatorios {

    public static void main(String[] args) {

        Random random = new Random(); // Gera números aleatórios

        int[] numerosAleatorios = new int[20];

        for (int i = 0; i < numerosAleatorios.length; i++) {
            int numero = random.nextInt(100); // bound especifica o limite
            numerosAleatorios[i] = numero;
        }

        System.out.print("Números Aleatórios: ");
        for ( int numero : numerosAleatorios ) {
            System.out.print(numero + " ");
        }

        System.out.print("\nSucessores dos Números Aleatórios: ");
        for ( int numero : numerosAleatorios ) {
            System.out.print((numero+1) + " ");
        }
    }
}
