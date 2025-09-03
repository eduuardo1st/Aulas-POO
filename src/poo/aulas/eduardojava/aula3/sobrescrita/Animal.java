package poo.aulas.eduardojava.aula3.sobrescrita;

public class Animal {
    public void emitirSom(){
        System.out.println("Emitiendo Som");
    }

}

class Cachorro extends Animal{
    @Override
    public void emitirSom(){
        System.out.println("Latindo");
    }
}
