package poo.aulas.eduardojava.aula3.modificadorestatico.teste;

import poo.aulas.eduardojava.aula3.modificadorestatico.dominio.Carro;

public class CarroTeste {
    public static void main(String[] args) {
        Carro c1 = new Carro("BMW", 280);
        Carro c2 = new Carro("Mercedes", 100);
        Carro c3 = new Carro("Porche", 320);

        Carro.setVelocidadeLimite(180);

        c1.imprime();
        c2.imprime();
        c3.imprime();
    }
}
