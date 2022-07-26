package Tratando_Excecoes_Java;

import javax.swing.*;
import java.io.*;

//Imprimir um arquivo no console.
public class CheckedException {
    public static void main(String[] args) {

        String nomeDoArquivo = "romances-blake-crouch.txt";

        try {
            imprimirArquivoNoConsole(nomeDoArquivo);
        } catch (FileNotFoundException e) { // Especificando uma exceção exclusiva para se o arquivo não for encontrado
//            e.printStackTrace();
            JOptionPane.showMessageDialog(null,
                    "Revise o nome do arquivo que você deseja imprimir!" + e.getCause());
        }
        catch (IOException e) { // Especificando um conjunto de erros diferente
            e.printStackTrace();
            JOptionPane.showMessageDialog(null,
                    "Ocorreu um erro inesperado! Entre em contato com o suporte!" + e.getCause());
        } finally {
            System.out.println("Chegou em finally");
        }

        System.out.println("Apesar da exception ou não, o programa continua...");
    }

    // Classe responsável por realizar a abertura de um arquivo no console.
    // Este método lança a exceção e não o trata.
    public static void imprimirArquivoNoConsole(String nomeDoArquivo) throws IOException {

        File file = new File(nomeDoArquivo); // Instanciando objeto

        BufferedReader br = new BufferedReader(new FileReader(file.getName())); // Leitura do arquivo
        String line = br.readLine(); // linha a linha

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); // Impressão no console

        // Laço para verificar linha a linha e imprimir no console
        do{
            bw.write(line);
            bw.newLine();
            line=br.readLine();
        } while(line != null);
        bw.flush(); // Descarrega no console
        br.close(); // Fecha o arquivo
    }
}
