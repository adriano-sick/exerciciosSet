package set.linguagem;

//  Crie uma classe LinguagemFavorita que possua os atributos: nome, anoDeCriacao, e ide
//  Em Seguida, crie um conjunto com 3 linguagens e faça um programa que ordene esse conjunto por:
//  (a). Ordem de inserçao
//  (b). Ordem natural (nome)
//  (c). Ano de criação e nome
//  (d). Nome, ano de criacao e IDE
//  Ao final exiba as linguagens no console uma abaixo da outra

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Exercicio {
    public static void main(String[] args) {
        Set<LinguagemFavorita> lingList = new LinkedHashSet<>();
        lingList.add(new LinguagemFavorita("C#", 2000, "Visual Studio"));
        lingList.add(new LinguagemFavorita("Python", 1991, "Idle"));
        lingList.add(new LinguagemFavorita("Java", 1995, "IntelliJ"));

        System.out.println("===Ordem de insercao:===");
        for (LinguagemFavorita linguagem : lingList){
            System.out.println("Nome: " + linguagem.getNome()
                    + " - Ano de Criacao: " + linguagem.getAnoDeCriacao()
                    + " - IDE: " + linguagem.getIde()) ;
        }

        System.out.println("===Ordem Natural===");
        Set<LinguagemFavorita> lingTree = new TreeSet<>(lingList);
        for (LinguagemFavorita linguagem : lingTree) {
            System.out.println("Nome: " + linguagem.getNome()
                    + " - Ano de Criacao: " + linguagem.getAnoDeCriacao()
                    + " - IDE: " + linguagem.getIde()) ;
        }

        System.out.println("===Ano de criação e nome===");
        Set<LinguagemFavorita> lingTree2 = new TreeSet<>(new ComparatorAno());
        lingTree2.addAll(lingTree);
        for (LinguagemFavorita linguagem : lingTree2) {
            System.out.println("Nome: " + linguagem.getNome()
                    + " - Ano de Criacao: " + linguagem.getAnoDeCriacao()
                    + " - IDE: " + linguagem.getIde()) ;
        }

        System.out.println("===Nome, ano de criacao e IDE===");
        Set<LinguagemFavorita> lingTree3 = new TreeSet<>(new ComparatorNomeAnoIde());
        lingTree3.addAll(lingTree);
        for (LinguagemFavorita linguagem : lingTree3) {
            System.out.println("Nome: " + linguagem.getNome()
                    + " - Ano de Criacao: " + linguagem.getAnoDeCriacao()
                    + " - IDE: " + linguagem.getIde()) ;
        }

        System.out.println("===Linguagens:===");
        for (LinguagemFavorita linguagem : lingList) {
            System.out.println(linguagem.getNome());
        }
    }
}
