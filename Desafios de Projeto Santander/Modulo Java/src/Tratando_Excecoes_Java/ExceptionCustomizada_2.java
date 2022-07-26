package Tratando_Excecoes_Java;

import javax.swing.*;

public class ExceptionCustomizada_2 {

    public static void main(String[] args){

        int[] numerador = {4, 5, 8, 10};
        int[] denominador = {2, 4, 0, 2, 8};

        for (int i = 0; i < denominador.length; i++) {

            try {
                if ( numerador[i] % 2 != 0 )
                    throw new DivisaoNaoExataException("Divisão não exata!", numerador[i], denominador[i]);
                int resultado = numerador [i] / denominador [i];
                System.out.println(resultado);
            } catch (DivisaoNaoExataException e) {
                e.printStackTrace();
                JOptionPane.showMessageDialog(null, e.getMessage());
            } catch (ArithmeticException e2) {
                e2.printStackTrace();
                JOptionPane.showMessageDialog(null, "Valor do denominador igual à 0 encontrado!");
            } catch (ArrayIndexOutOfBoundsException e3) {
                e3.printStackTrace();
                JOptionPane.showMessageDialog(null, "Elemento na posição numerador não encontrado"
                        + "\n" + e3.getMessage());
            }
        }
        System.out.println("O programa continua...");
    }
}


