package poo.aulas.eduardojava.aula1;

/*
    Atividade 1
 */

import java.util.Scanner;

public class SomaNumeros {
    public static void main(String[] args) {
        int soma = 0;
        Scanner meuScanner = new Scanner(System.in);

        for(int i = 0; i < 4; i++){
            System.out.println("Digite o " + (i+1) + " numero para somar:");
            soma += meuScanner.nextInt();
        }

        System.out.println("o resultado da soma é " + soma);
        meuScanner.close();
    }
}


