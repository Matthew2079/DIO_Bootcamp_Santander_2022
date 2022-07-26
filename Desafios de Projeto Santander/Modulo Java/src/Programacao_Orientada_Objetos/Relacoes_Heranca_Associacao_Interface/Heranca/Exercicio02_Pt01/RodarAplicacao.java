package Programacao_Orientada_Objetos.Relacoes_Heranca_Associacao_Interface.Heranca.Exercicio02_Pt01;

public class RodarAplicacao {

    public static void main(String[] args) {

        Funcionario funcionario = new Funcionario();

        // Upcast implicíto, não existe perda de informações de Classes
        Funcionario gerente = new Gerente();
        Funcionario vendedor = new Vendedor();
        Funcionario faxineiro = new Faxineiro();

        // Gerente gerente_ = new Funcionario;

        /* Downcast explicíto, em compilação dá erro, pois o compilador não sabe o que fazer com as informções que
        a classe ascendente tem e a descente não tem */
        Vendedor vendedor_ = (Vendedor) new Funcionario();
    }
}
