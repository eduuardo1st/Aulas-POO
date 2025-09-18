package poo.aulas.eduardojava.aula4.scanner;
import java.util.Locale;
import java.util.Scanner;

public class EntradaDeDados {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        /*double x;
        x = sc.nextDouble();
        System.out.println("Você digitou: " + x);*/

        char l;
        l = sc.next().charAt(0);
        System.out.println("Char digitada: " + l);

        sc.close();

    }
}
