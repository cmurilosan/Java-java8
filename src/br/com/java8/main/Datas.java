package br.com.java8.main;

import java.time.*;
import java.time.format.DateTimeFormatter;

public class Datas {

    public static void main(String[] args) {

        LocalDate hoje = LocalDate.now();
        System.out.println(hoje);

        System.out.println("-----------------------------------------");

        LocalDate olimpiadasJapao = LocalDate.of(2021, Month.JUNE,5);

        int anos = olimpiadasJapao.getYear() - hoje.getYear();
        System.out.println("Falta " + anos + " ano");

        System.out.println("-----------------------------------------");

        Period periodo = Period.between(hoje, olimpiadasJapao);
        System.out.println(periodo.getYears());
        System.out.println(periodo.getMonths());
        System.out.println(periodo.getDays());

        System.out.println("-----------------------------------------");

        System.out.println(hoje.minusYears(1));
        System.out.println(hoje.minusMonths(4));
        System.out.println(hoje.minusDays(2));

        System.out.println("-----------------------------------------");

        System.out.println(hoje.plusYears(1));
        System.out.println(hoje.plusMonths(4));
        System.out.println(hoje.plusDays(2));

        System.out.println("-----------------------------------------");

        olimpiadasJapao.plusDays(4);
        System.out.println(olimpiadasJapao);

        System.out.println("-----------------------------------------");

        LocalDate proximasOlimpiadas = olimpiadasJapao.plusDays(4);
        System.out.println(proximasOlimpiadas);

        System.out.println("-----------------------------------------");

        DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String valorFormatado = proximasOlimpiadas.format(formatador);
        System.out.println(valorFormatado);

        System.out.println("-----------------------------------------");

        DateTimeFormatter formatadorComHoras = DateTimeFormatter.ofPattern("dd/MM/yyy hh:mm:ss");
        LocalDateTime agora = LocalDateTime.now();
        System.out.println(agora.format(formatadorComHoras));

        System.out.println("-----------------------------------------");

        YearMonth anoEMes = YearMonth.of(2020,Month.JUNE);

        LocalTime intervalo = LocalTime.of(12,30);
        System.out.println(intervalo);
    }
}
