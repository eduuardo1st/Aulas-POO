package poo.aulas.eduardojava.aula1;

import java.util.Scanner;

public class AumentoSalario {
    public static void main(String[] args) {
        float salario;
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite seu salário atual, e veja qual será o aumento: ");
        salario = leitor.nextFloat();

        salario *= 1.25F;

        System.out.println("Seu salário com o aumento será de R$ " + salario);
    }
}
