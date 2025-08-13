package poo.aulas.eduardojava.aula1;

import java.util.Scanner;

public class MediaPonderadaNotas {
    public static void main(String[] args) {
        int soma = 0;
        int[] nota = new int[4];
        Scanner myScanner = new Scanner(System.in);

        System.out.println("Digite 3 notas para tirar a média ponderada:");
        System.out.println("Nota 1 = peso 1\nNota 2 = peso 2\nNota 3 = peso 3\n");

        for (int i = 0; i<3; i++){
            System.out.println("Digite a nota" + (i+1) + ": ");
            nota[i] = myScanner.nextInt();
            nota[i] *= i + 1;
            soma += nota[i];
        }

        float media = (float) soma / 6;

        System.out.println("Sua média é: " + media);
    }
}
