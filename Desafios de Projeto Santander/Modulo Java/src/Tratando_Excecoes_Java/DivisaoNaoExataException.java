package Tratando_Excecoes_Java;

public class DivisaoNaoExataException extends Exception {

    private int numerador;
    private int denomindaor;

    public DivisaoNaoExataException(String message, int numerador, int denomindaor) {
        super(message);
        this.numerador = numerador;
        this.denomindaor = denomindaor;
    }
}
