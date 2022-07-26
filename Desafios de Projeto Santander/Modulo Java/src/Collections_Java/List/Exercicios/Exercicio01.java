package Collections_Java.List.Exercicios;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*Faça um programa que receba a temperatura média dos 6 primeiros meses do ano e armazene-as em uma lista.
Após isto, calcule a média semestral das temperaturas e mostre todas as temperaturas acima desta média,
e em que mês elas ocorreram (mostrar o mês por extenso: 1 – Janeiro, 2 – Fevereiro e etc).
*/

public class Exercicio01 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in); // Instanciando objeto para leitura do teclado

        List<Double> temperaturasSemestral = new ArrayList<Double>(); // Craindo a lista

        // Coletando as temperaturas
        double somaTemp = 0.0;
        for (int i = 1; i <= 6; i++) {

            // Temperatura informada
            System.out.print("Leitura da temperatura do mês " + i + ": ");
            double medicao = scan.nextDouble();

            temperaturasSemestral.add(medicao);
            somaTemp += medicao;
        }

        // Média das temperaturas
        double mediaTemperaturasSemenstral = somaTemp/temperaturasSemestral.size();

        System.out.println("Temperaturas Semestral: " + temperaturasSemestral);
        System.out.println("Média temperaturas Semestral: " + mediaTemperaturasSemenstral + "ºC");
        System.out.println("----------");

        // Percorrendo a lista e retornando o(s) mês(es) onde a temperatura foi ou foram maior que a média
        for (Double temp : temperaturasSemestral) {
            if(temp > mediaTemperaturasSemenstral) {
                int index = temperaturasSemestral.indexOf(temp);
                switch (index) {
                    case 0:
                        System.out.println((index + 1) + " - JANEIRO: " + temp + " ºC");
                        break;
                    case 1:
                        System.out.println((index + 1) + " - FEVEREIRO: " + temp+ " ºC");
                        break;
                    case 2:
                        System.out.println((index + 1) + " - MARÇO: " + temp+ " ºC");
                        break;
                    case 3:
                        System.out.println((index + 1) + " - ABRIL: " + temp+ " ºC");
                        break;
                    case 4:
                        System.out.println((index + 1) + " - MAIO: " + temp+ " ºC");
                        break;
                    case 5:
                        System.out.println((index + 1) + " - JUNHO: " + temp+ " ºC");
                        break;
                    default:
                        break;
                }
            }
        }
    }
}
