package Estruturas_Repeticao_Arrays.Loops;

/*
Faça um programa que leia 5 números
e informe o maior número
e a média desses números.
*/

import java.util.Scanner;

public class Ex3_MaiorEMedia {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int num;
        int count = 0;
        int maior = 0;
        double media = 0;
        double soma = 0;

        do {

            System.out.println("Digite um número: ");
            num = scan.nextInt();

            count += 1;
            soma += num;
            media = soma / count ;

            if(num > maior)  maior = num;

        }while(count < 5);

        System.out.println("\n");
        System.out.println("O maior número foi: " + maior);
        System.out.println("A media dos números informados foram: " + media);

    }
}
