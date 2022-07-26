package Programacao_Orientada_Objetos.Estrutura_Basica;

public class Carro {

    String cor;
    String modelo;
    int capacidadeTanque;

    // Construtores e sobrecarga
    Carro () { }
    Carro (String cor, String modelo, Integer capacidadeTanque) {
        this.cor = cor;
        this.modelo = modelo;
        this.capacidadeTanque = capacidadeTanque;
    }

    // Get e Setters
    String getCor() {
        return cor;
    }

    void setCor(String cor) {
        this.cor = cor;
    }

    String getModelo() {
        return modelo;
    }

    void setModelo(String modelo) {
        this.modelo = modelo;
    }

    void setCapacidadeTanque(int capacidadeTanque) {
        this.capacidadeTanque = capacidadeTanque;
    }

    int getCapacidadeTanque () {
        return capacidadeTanque;
    }

    // Regras de Negócio
    double totalValorTanque(double valorCombustivel) {
        return capacidadeTanque * valorCombustivel;
    }


}
