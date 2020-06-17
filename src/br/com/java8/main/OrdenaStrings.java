package br.com.java8.main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.function.Consumer;

public class OrdenaStrings {

    public static void main(String[] args) {

        ArrayList<String> palavras = new ArrayList<>();
        palavras.add("Naruto");
        palavras.add("Attack on Titans");
        palavras.add("Cavaleiros do Zodíaco");

        Collections.sort(palavras); //Ordena a lista
        System.out.println(palavras);

        Comparator<String> comparador = new ComparadorDeStringsPorTamanho();
//        Collections.sort(palavras, comparador);
        palavras.sort(comparador);
        System.out.println(palavras);

        Consumer<String> consumidor = new ConsumidorDeString();
        palavras.forEach(consumidor);
    }
}

class ComparadorDeStringsPorTamanho implements Comparator<String> {

    @Override
    public int compare(String s1, String s2) {
        if (s1.length() < s2.length())
            return  -1;
        if (s1.length() > s2.length())
            return  1;

        return 0;
    }
}

class ConsumidorDeString implements Consumer<String> {

    public void accept(String s) {
        System.out.println(s);

    }
}
