package br.com.java8.main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.function.Function;

public class OrdenaStrings {

    public static void main(String[] args) {

        ArrayList<String> palavras = new ArrayList<>();
        palavras.add("Naruto");
        palavras.add("Attack on Titans");
        palavras.add("Cavaleiros do Zodíaco");

        palavras.sort((s1, s2) -> {
            if (s1.length() < s2.length())
                return -1;
            if (s1.length() > s2.length())
                return 1;
            return 0;
        });

        palavras.sort((s1, s2) -> Integer.compare(s1.length(), s2.length()));

        palavras.sort(Comparator.comparing(s -> s.length()));
//        "palavras ordene comparando s.length".
        palavras.sort(Comparator.comparing(String::length));
//        Method Reference. Mais enxuto
//        palavras.sort(comparing(String::length));
//        Mais ainda, importando static java.util.Comparator.*;

        Function<String, Integer> funcao1 = s -> s.length();
        Function<String, Integer> funcao2 = String::length;
        Comparator<String> comparador = Comparator.comparing(funcao1);
        palavras.sort(comparador);
//        três linhas para enxergar o que ocorre por trás exatamente


        palavras.forEach(s -> System.out.println(s));
//        forEach, que recebe um Consumer
        palavras.forEach(System.out::println);
    }
}
