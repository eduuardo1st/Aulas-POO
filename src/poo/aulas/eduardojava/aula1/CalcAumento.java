package poo.aulas.eduardojava.aula1;

import java.util.Scanner;

public class CalcAumento {
    public static void main(String[] args) {
        float salario;
        float aumento;
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite seu salário atual: ");
        salario = leitor.nextFloat();

        System.out.println("Digite o tamanho do seu aumento em percentual: ");
        aumento = leitor.nextFloat();

        aumento /= 100;
        aumento = salario * aumento;
        salario = salario + aumento;

        System.out.println("O seu aumento no salário foi de R$ " + aumento);
        System.out.println("E o seu salário após o aumento é de R$ " + salario);
    }
}
