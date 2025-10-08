package poo.aulas.eduardojava.aula4.strings;

public class SplitTeste {
    public static void main(String[] args) {
        String s = "Eu serei um desenvolvedor";

        String[] vect = s.split(" ");

        System.out.println(vect[0]);
        System.out.println(vect[1]);
        System.out.println(vect[2]);
        System.out.println(vect[3]);
    }
}
