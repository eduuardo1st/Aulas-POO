package poo.aulas.eduardojava.aula3.SobrecargaMetodos.Teste;

import poo.aulas.eduardojava.aula3.SobrecargaMetodos.Dominio.Series;

public class SerieTeste {
    public static void main(String[] args) {
        Series series = new Series();
        series.init("Cyber punk", "Anime", 12, "Futurista");

        series.imprimir();
    }
}
