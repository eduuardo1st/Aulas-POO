package poo.aulas.eduardojava.aula4.heranca.main;

import poo.aulas.eduardojava.aula4.heranca.dominio.Funcionario;
import poo.aulas.eduardojava.aula4.heranca.dominio.Gerente;
import poo.aulas.eduardojava.aula4.heranca.dominio.Pessoa;

public class Main {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa("Eduardo", 19, "11199988812");
        Funcionario f1 = new Funcionario("Arthur", 22, "22222132132342", "programador", "12/09/2025", 5000);
        Gerente g1 = new Gerente("Davi", 34, "233432423532454", "Gerente", "04/05/2006", 2000, 12, 2000);

        System.out.println("==== Dados Pessoa ====");
        p1.mostrarDados();
        System.out.println();

        System.out.println("==== Dados Funcionário ====");
        f1.mostrarDados();
        System.out.println("Salário anual: " + f1.calcularSalarioAnual());
        System.out.println();
        System.out.println("^^ Aumento no salário de 20%");
        f1.receberAumento(20);
        System.out.println("==== Dados Funcionário ====");
        f1.mostrarDados();
        System.out.println();

        System.out.println("==== Dados Gerente ====");
        g1.mostrarDados();
        System.out.println();

    }
}
