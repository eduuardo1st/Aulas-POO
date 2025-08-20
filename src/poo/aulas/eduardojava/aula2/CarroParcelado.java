package poo.aulas.eduardojava.aula2;

// dado o valor do carro, descubra em quantas ele pode ser parcelado
// a parcela só vai até 1000

public class CarroParcelado {
    public static void main(String[] args) {
        int valorDoCarro = 200000;
        int count = 1;
        int parcelas = 0;

        while(count < valorDoCarro) {
            if(valorDoCarro / count >= 1000){
                parcelas = count;
            }
            else break;
            count++;
        }
        System.out.println("O carro de " + valorDoCarro + " pode ser parcelado em até " + parcelas + " de " + valorDoCarro / parcelas);
    }
}
