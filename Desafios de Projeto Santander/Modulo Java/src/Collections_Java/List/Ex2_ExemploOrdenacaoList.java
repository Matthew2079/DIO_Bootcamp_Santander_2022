package Collections_Java.List;

/*Dadas as seguintes informações sobre meus gatos, crie uma lista
e ordene esta lista exibindo:
(nome - idade - cor);
Gato 1 = nome: Jon, idade: 18, cor: preto
Gato 2 = nome: Simba, idade: 6, cor: tigrado
Gato 3 = nome: Jon, idade: 12, cor: amarelo
*/

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Ex2_ExemploOrdenacaoList {

    public static void main(String[] args) {

        List<Gato> meusGatos = new ArrayList<>(){{
            add(new Gato("Jon", 18, "preto"));
            add(new Gato("Simba", 6, "tigrado"));
            add(new Gato("Jon", 12, "amarelo"));
        }};

        System.out.println("--\tOrdem de Inserção\t---");
        System.out.println(meusGatos);


        System.out.println("--\tOrdem aleatória\t---");
        Collections.shuffle(meusGatos);
        System.out.println(meusGatos);

        // Utilizando a interface Comparable
        System.out.println("--\tOrdem Natural (Nome)\t---");
        Collections.sort(meusGatos); // para usar o sort precisa reescrever a interface compareTo
        System.out.println(meusGatos);

        // Utilizando a Interface Comparator
        System.out.println("--\tOrdem Idade\t---");
//        Collections.sort(meusGatos, new ComparatorIdade()); // para usar o sort precisa reescrever a interface compare
        meusGatos.sort(new ComparatorIdade());
        System.out.println(meusGatos);

       System.out.println("--\tOrdem cor\t---");
       meusGatos.sort(new ComparatorCor());
       System.out.println(meusGatos);

       System.out.println("--\tOrdem Nome/Cor/Idade\t---");
       meusGatos.sort(new ComparatorNomeCorIdade());
       System.out.println(meusGatos);

    }
}

class Gato implements Comparable<Gato> {

    // A interface Comparable precisa ser reescrita para atender a ordem natural

    private String nome;
    private Integer idade;
    private String cor;

    public Gato(String nome, Integer idade, String cor) {
        this.nome = nome;
        this.idade = idade;
        this.cor = cor;
    }

    public String getNome() {
        return nome;
    }

    public Integer getIdade() {
        return idade;
    }

    public String getCor() {
        return cor;
    }

    @Override
    public String toString() {
        return "Gato{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", cor='" + cor + '\'' +
                '}';
    }

    @Override
    public int compareTo(Gato gato) {
        return this.getNome().compareToIgnoreCase(gato.getNome());
    }
}

class ComparatorIdade implements Comparator<Gato> {

    // O retorno 1 indica que nome comparado deve ficar após o seguinte
    // O retorno 0 indica que os nomes são iguais
    // O retorno -1 indica que o nome comparado deve ficar antes do seguint

    @Override
    public int compare(Gato g1, Gato g2) {
        return Integer.compare(g1.getIdade(), g2.getIdade());
    }
}

class ComparatorCor implements Comparator<Gato> {

    @Override
    public int compare(Gato g1, Gato g2) {
        return g1.getNome().compareToIgnoreCase(g2.getNome());
    }
}

class ComparatorNomeCorIdade implements Comparator<Gato> {

    @Override
    public int compare(Gato g1, Gato g2) {

        // compareToIgnoreCase é utilizado para Strings
        // Integer.compare é utilizado para inteiros

        int nome = g1.getNome().compareToIgnoreCase(g2.getNome());
        if ( nome != 0 ) return nome;

        int cor = g1.getCor().compareToIgnoreCase(g2.getCor());
        if ( cor != 0 ) return cor;

        return Integer.compare(g1.getIdade(), g2.getIdade());

    }
}


