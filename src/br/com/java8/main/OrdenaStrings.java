package br.com.java8.main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class OrdenaStrings {

    public static void main(String[] args) {

        ArrayList<String> palavras = new ArrayList<>();
        palavras.add("Naruto");
        palavras.add("Attack on Titans");
        palavras.add("Cavaleiros do Zodíaco");

        Collections.sort(palavras); //Ordena a lista
        System.out.println(palavras);

        palavras.sort((s1, s2) -> Integer.compare(s1.length(), s2.length()));

        palavras.forEach(s -> System.out.println(s));
    }
}
