package Collections_Java.Set.Exercicios;

/*
Crie uma conjunto contendo as cores do arco-íris e:
a) Exiba todas as cores o arco-íris uma abaixo da outra;
b) A quantidade de cores que o arco-íris tem;
c) Exiba as cores em ordem alfabética;
d) Exiba as cores na ordem inversa da que foi informada;
e) Exiba todas as cores que começam com a letra ”v”;
f) Remova todas as cores que não começam com a letra “v”;
g) Limpe o conjunto;
h) Confira se o conjunto está vazio;
 */

import java.util.*;

public class Exercicio01 {

    public static void main(String[] args) {

        System.out.println("Criando a Lista com as cores: ");
        Set<String> coresArcoIris = new HashSet<>(); // Ordem aleatória
        coresArcoIris.add("violeta");
        coresArcoIris.add("anil");
        coresArcoIris.add("azul");
        coresArcoIris.add("verde");
        coresArcoIris.add("amarelo");
        coresArcoIris.add("laranja");
        coresArcoIris.add("vermelho");
        System.out.println(coresArcoIris);

        System.out.println("Exibindo as cores armazenadas: ");
        for (String cor : coresArcoIris) { System.out.println(cor); }

        System.out.println("Exibindo a quantidade de cores: " + coresArcoIris.size());

        System.out.println("Exibindo as cores em ordem alfabética: ");
        Set<String> coresArcoIris2 = new TreeSet<>(coresArcoIris); // Ordem natural
        System.out.println(coresArcoIris2);

        // Criando lista com a ordem de inserção passada na criação
        System.out.println("Exibindo na ordem reversa ");
        Set<String> coresArcoIris3 = new LinkedHashSet<>(
                Arrays.asList("violeta", "anil", "azul", "verde", "amarelo", "laranja", "vermelho"));
        System.out.println(coresArcoIris3);

        // Passando a lista como argumento para a Collection List
        List<String> coresArcoIrisList = new ArrayList<>(coresArcoIris3);
        Collections.reverse(coresArcoIrisList);
        System.out.println(coresArcoIrisList);

        System.out.println("Exibindo as cores que começam com a letra ”v”: ");
        for (String cor: coresArcoIris) {
            if(cor.startsWith("v")) System.out.println(cor);
        }

        System.out.println("Removendo as cores que não começam com a letra “v”: ");
        Iterator<String> iterator2 = coresArcoIris.iterator();
        while (iterator2.hasNext()) {
            if (!iterator2.next().startsWith("v")) iterator2.remove();
        }
        System.out.println(coresArcoIris);

        System.out.println("Limpando o conjunto: ");
        coresArcoIris.clear();

        System.out.println("Conferindo se o conjunto está vazio: " + coresArcoIris.isEmpty());
    }
}
