package Collections_Java.Map.Exercicios;

import java.util.*;

/*
Faça um programa que simule um lançamento de dados. Lance o dado 100 vezes e armazene.
Depois, mostre quantas vezes cada valor foi conseguido.
 */

public class Exercicio02 {

    public static void main(String[] args) {

        int quantLancamentos = 100; // Definindo o lançamento

        // Criando a Lista para armazenar os valores
        List<Integer> valores = new ArrayList<>();
        Random geradorDeLancamento = new Random(); // Criando valores aleatórios
        int number = 0;
        for (int i = 0; i < quantLancamentos; i++) {
            number = geradorDeLancamento.nextInt(6) + 1;
            valores.add(number);
        }

        // Criando o Map para armazena a quantidade de lançamentos, com base na Lista VALORES
        Map<Integer, Integer> lancamentos = new HashMap<>();
        for (Integer resultado : valores) {
            if (lancamentos.containsKey(resultado))
                lancamentos.put(resultado, (lancamentos.get(resultado) + 1)); //+1
            else lancamentos.put(resultado, 1);
        }

        System.out.print("Jogando");

        // Definindo intervalo na geração de cada valor
        //conteúdo do for + try/cath - totalmente opcional
        for (int i = 0; i < 3; i++) {
            try {
                Thread.sleep(3000);
                System.out.print(".");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        // Percorrendo o Map
        System.out.println("\nValor " + " Quant. de vezes");
        for (Map.Entry<Integer, Integer> entry : lancamentos.entrySet()) {
            System.out.printf("%3d %10d\n", entry.getKey(), entry.getValue());
        }

    }
}
