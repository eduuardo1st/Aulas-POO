package poo.aulas.eduardojava.aula1;

import java.util.Scanner;

public class MediaNotas {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        int soma = 0;
        float media;

        System.out.println("Calculadora de média, digite abaixo suas 3 notas:\n");

        for (int i = 1; i <= 3; i++) {
            System.out.println("Digite a nota(" + i +"): ");
            soma += myScanner.nextInt();
        }

        media = (float) soma / 3;

        System.out.println("A média das suas notas é " + media);
    }
}
