import java.util.Scanner;

public class EntradaDeDados {
    public static void main(String[] args) {
        Scanner meuScanner = new Scanner(System.in); // Cria objeto Scanner
        System.out.println("Entre com seu nome");

        String nome = meuScanner.nextLine();
        System.out.println("Seu nome é: " + nome);
    }
}
