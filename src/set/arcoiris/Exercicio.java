package set.arcoiris;

//Crie um conjunto contendo as cores do arco-íris e:
//  (a). Exiba todas as cores uma abaixo da outra
//  (b). A quantidade de cores que o arco-iris tem
//  (c). Exiba as cores em ordem alfabética
//  (d). Exiba as cores na ordem inversa da que foi informada
//  (e). Exiba todas as cores que começam com a letra 'v'
//  (f). Remova todas as cores que nao começam com a letra 'v'
//  (g). Limpe o conjunto
//  (h). Confira se o conjunto está vazio
//  "vermelho", "laranja", "amarelo", "verde", "azul", "anil", "violeta"

import java.util.*;

public class Exercicio {
    public static void main(String[] args) {
        Set<String> arcoIris = new LinkedHashSet<>(); //LinkedHashSet mantém a ordem de inserção, o que será necessário
        arcoIris.add("vermelho");
        arcoIris.add("laranja");
        arcoIris.add("amarelo");
        arcoIris.add("verde");
        arcoIris.add("azul");
        arcoIris.add("anil");
        arcoIris.add("violeta");

        System.out.println("Exiba todas as cores uma abaixo da outra:");
        for (String cor : arcoIris) {
            System.out.println(cor);
        }

        System.out.println("A quantidade de cores que o arco-iris tem:");
        System.out.println("O arco-iris tem: " + arcoIris.size() + " cores!");

        System.out.println("Exiba as cores em ordem alfabética:");
        Set<String> arcoTree = new TreeSet<>(arcoIris); //nova lista do tipo TreeMap para aproveitar a capacidade de organizar em ordem natural.
        System.out.println(arcoTree);

        System.out.println("Exiba as cores na ordem inversa da que foi informada:");

        System.out.println(arcoIris); // Set original
        List<String> arcoList = new ArrayList<>(arcoIris); //Cria lista array
        Collections.reverse(arcoList); //Inverte com o metodo reverse
        System.out.println(arcoList); //printa Array invertido

/*        Iterator<String> iterator = arcoIris.iterator();
        String next = "";
        while (!arcoIris.isEmpty()) {
            iterator = arcoIris.iterator();
            while(iterator.hasNext()) {                 //essa porcaria faz as mesmas coisas, so que sem criar um arrayList.
                next = iterator.next();                 //roda a lista inteira, ate chegar na ultima posiçao, imprime ela, depois apaga
                if (!iterator.hasNext()) {              //repete isso ate que a lista esteja vazia. Processamento é mato
                    System.out.println(next);
                    iterator.remove();
                }
            }
        }*/


        System.out.println("Exiba todas as cores que começam com a letra 'v'");
        for (String cor : arcoIris) {
            if(cor.startsWith("v")) {                   //usa o metodo .startsWith("str"), que retorna true caso a string comece com o valor informado
                System.out.println(cor);
            };
        }
//
        System.out.println("Remova todas as cores que nao começam com a letra 'v'");
        arcoIris.removeIf(cor -> !cor.startsWith("v"));  //metodo .removeIf e !.startsWith
        System.out.println(arcoIris);

        /*Iterator<String> iterator = arcoIris.iterator();  //Outra forma, usando iterator
        while (iterator.hasNext()) {
            if (iterator.next().startsWith("v")) {
                iterator.remove();
            }
        }*/

        System.out.println("Limpe o conjunto");
        arcoIris.clear(); //easy

        System.out.println("Confira se o conjunto está vazio");
        System.out.println(arcoIris); //aqui temos o conjunto vazio

    }
}
