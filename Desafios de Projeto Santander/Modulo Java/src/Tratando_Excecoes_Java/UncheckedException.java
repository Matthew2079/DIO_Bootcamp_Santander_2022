package Tratando_Excecoes_Java;

import javax.swing.*;

// Fazer a divisão de 2 valores inteiros
public class UncheckedException {

    public static void main(String[] args) {

        boolean continueLooping = true;
        do {

            String a = JOptionPane.showInputDialog("Numeredor: ");
            String b = JOptionPane.showInputDialog("Denominador: ");

            try {
                int resultado = dividir(Integer.parseInt(a), Integer.parseInt(b));
                System.out.println("Resultado: " + resultado);
                continueLooping = false;
            } catch (NumberFormatException erro) {
                erro.printStackTrace(); // imprime o erro no console de desenvolvimento
                JOptionPane.showMessageDialog(null, "Entrada inválida, " +
                        "informe um número inteiro " + "\nErro Encontrado: " + erro.getMessage());
            } catch (ArithmeticException erro2) {
                erro2.printStackTrace(); // imprime o erro no console de desenvolvimento
                JOptionPane.showMessageDialog(null, "Impossível dividir por zero");
            }
            finally {
                JOptionPane.showMessageDialog(null, "Finalizado!");
            }

        } while(continueLooping);
    }

    public static int dividir (int a, int b) { return a / b; }
}
