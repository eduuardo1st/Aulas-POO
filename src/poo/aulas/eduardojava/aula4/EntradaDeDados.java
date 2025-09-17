package poo.aulas.eduardojava.aula4;

import java.util.Scanner;

public class EntradaDeDados {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int idade = sc.nextInt();
        sc.nextLine();
        String nome =  sc.nextLine();
        String cargo =  sc.nextLine();

        System.out.println("Nome: " + nome);
        System.out.println("Cargo: " + cargo);
        System.out.println("Idade: " + idade);

        sc.close();
    }
}
