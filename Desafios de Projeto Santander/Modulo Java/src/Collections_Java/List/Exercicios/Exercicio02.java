package Collections_Java.List.Exercicios;

/*
Utilizando listas, faça um programa que faça 5 perguntas para uma pessoa sobre um crime. As perguntas são:
1. "Telefonou para a vítima?"
2. "Esteve no local do crime?"
3. "Mora perto da vítima?"
4. "Devia para a vítima?"
5. "Já trabalhou com a vítima?"
Se a pessoa responder positivamente a 2 questões ela deve ser classificada como "Suspeita", entre 3 e 4 como
"Cúmplice" e 5 como "Assassina". Caso contrário, ele será classificado como "Inocente".
*/

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Exercicio02 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in); // Instanciando objeto para leitura do teclado

        List<String> respostas = new ArrayList<>(); // Craindo a lista

        System.out.println("Perguntas: ");

        System.out.print("\n 1. Telefonou para vítima? ");
        String resposta = scanner.next();
        respostas.add(resposta.toLowerCase());

        System.out.print("\n 2. Esteve no local do crime? ");
        resposta = scanner.next();
        respostas.add(resposta.toLowerCase());

        System.out.print("\n 3. Mora perto da vítima? ");
        resposta = scanner.next();
        respostas.add(resposta.toLowerCase());

        System.out.print("\n 4. Devia para vítima? ");
        resposta = scanner.next();
        respostas.add(resposta.toLowerCase());

        System.out.print("\n 5. Já trabalhou com a vítima? ");
        resposta = scanner.next();
        respostas.add(resposta.toLowerCase());

        System.out.println("\n" + respostas);

        // Verificando a lista e armazenando as respostas positivas
        int count = 0;
        Iterator<String> contador = respostas.iterator();
        while(contador.hasNext()){
            String resp = contador.next();
            if(resp.contains("s")) {
                count ++;
            }
        }

        // Atribuindo título com base na quantidade de respostas positivas
        switch(count) {
            case 2: System.out.println("\n >> Titulada: SUSPEITA <<"); break;
            case 3:
            case 4: System.out.println("\n >> Titulada: CÚMPLICE <<"); break;
            case 5: System.out.println("\n >> Titulada: ASSASSINO <<"); break;
            default: System.out.println("\n >> Titulada: INOCENTE <<"); break;
        }
    }
}
