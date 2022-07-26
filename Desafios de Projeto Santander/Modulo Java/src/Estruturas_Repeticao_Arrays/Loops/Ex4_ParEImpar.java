package Estruturas_Repeticao_Arrays.Loops;

/*
Faça um programa que peça N números inteiros,
calcule e mostre a quantidade de números pares
e a quantidade de números impares.
*/

import java.util.Scanner;

public class Ex4_ParEImpar {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int quantNumeros;
        int num;
        int quantPares = 0, quantImpares = 0;

        System.out.println("Quantidade de números: ");
        quantNumeros = scan.nextInt();

        int count = 0;

        do {

            System.out.println("Número: ");
            num = scan.nextInt();

            if(num % 2 == 0) quantPares++;
            else quantImpares++;

            count++;
        } while(count < quantNumeros);

        System.out.println("A quantidade de números pares informados foram: " + quantPares);
        System.out.println("A quantidade de números ímpares informados foram: " + quantImpares);
    }
}
