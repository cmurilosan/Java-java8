package br.com.java8.main;

import br.com.java8.modelo.Curso;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class TesteCurso {

    public static void main(String[] args) {

        ArrayList<Curso> cursos = new ArrayList<>();
        cursos.add(new Curso("Python", 45));
        cursos.add(new Curso("JavaScript", 150));
        cursos.add(new Curso("Java 8", 113));
        cursos.add(new Curso("C", 55));

        cursos.sort(Comparator.comparingInt(c -> c.getAlunos()));
        cursos.sort(Comparator.comparingInt(Curso::getAlunos));
        cursos.forEach(curso -> System.out.println(curso.getNome()));

        System.out.println("-----------------------------------------");

        Stream<Curso> streamCurso = cursos.stream().filter(curso -> curso.getAlunos() > 100);
//        streamCurso.forEach(curso -> System.out.println(curso.getNome()));
        cursos.stream()
                .filter(curso -> curso.getAlunos() > 100)
                .forEach(curso -> System.out.println(curso.getNome()));

        System.out.println("-----------------------------------------");

        cursos.stream()
                .filter(curso -> curso.getAlunos() > 100)
                .map(curso -> curso.getAlunos())
                .forEach(curso -> System.out.println(curso));
//        map não devolve um Stream<Curso>, e sim um Stream<Integer>

        System.out.println("-----------------------------------------");

        cursos.stream()
                .filter(curso -> curso.getAlunos() < 100)
                .map(Curso::getAlunos)
                .forEach(System.out::println);

        System.out.println("-----------------------------------------");

        int soma = cursos.stream()  //pegamos todos os cursos
                .filter(curso -> curso.getAlunos() > 100)   //filtramos os que tem mais de 100
                .mapToInt(Curso::getAlunos)
                .sum(); //somamos todos os aluno

        System.out.println(soma);

        System.out.println("-----------------------------------------");

        cursos.stream()
                .filter(curso -> curso.getAlunos() > 100)
                .findAny()
                .ifPresent(curso -> System.out.println(curso.getNome()));

        System.out.println("-----------------------------------------");

        List<Curso> resultados = cursos.stream()
                .filter(curso -> curso.getAlunos() < 100)
                .collect(Collectors.toList());

        Map mapa = cursos
                .stream()
                .filter(curso -> curso.getAlunos() > 100)
                .collect(Collectors.toMap(curso -> curso.getNome(), curso -> curso.getAlunos()));
    }
}
