package poo.aulas.eduardojava.aula2;

public class Array {
    public static void main(String[] args) {
        int [] idades = new int []{1,2,7,4}; // iniciar array com 4 posições

        for (int i = 0; i<idades.length; i++){ // length pega o tamanho do array
            System.out.println(idades[i]);
        }

        for (int num : idades){
            System.out.println(num);
        }
    }
}
