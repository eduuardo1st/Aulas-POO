package poo.aulas.eduardojava.aula1;

import java.util.Scanner;

public class SalarioFinal {
    public static void main(String[] args) {
        float salario;
        float aumento;
        Scanner input = new Scanner(System.in);

        System.out.println("Digite seu salário base: ");
        salario = input.nextFloat();

        aumento = salario * ((float) 5 /100);
        salario -= salario * ((float) 7 /100);
        salario += aumento;

        System.out.println("Seu salario final é de R$ " + salario);
    }
}
