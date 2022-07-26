package Programacao_Orientada_Objetos.Estrutura_Basica;

/**
 * Classe de exemplo para o exercício da Aula 2 de Orientação a Objetos.
 */

public class RodarAplicacao {

    public static void main(String[] args) {

        // Instanciando o objeto sem as informações no Construtor
        Carro carro1 = new Carro();
        carro1.setCor("Azul");
        carro1.setModelo("BMW Série 3");
        carro1.setCapacidadeTanque(59);
        System.out.println("Modelo: " + carro1.getModelo());
        System.out.println("Cor: " + carro1.getCor());
        System.out.println("Capacidade do tanque: " + carro1.getCapacidadeTanque() + " litros");
        System.out.println("Valor para encher o tanque: R$" + carro1.totalValorTanque(6.39) + "\n");

        // Instanciando o objeto com informações no Construtor
        Carro carro2 = new Carro("Cinza", "Mercedes-Benz Classe C ", 66);
        System.out.println("Modelo: " + carro2.getModelo());
        System.out.println("Cor: " + carro2.getCor());
        System.out.println("Capacidade do tanque: " + carro2.getCapacidadeTanque() + " litros");
        System.out.println("Valor para encher o tanque: R$" + carro2.totalValorTanque(6.46));

    }
}
