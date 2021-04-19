import java.util.Scanner;

public class Principal {
    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Por favor, insira o seu nome: ");
        String nome = scan.nextLine();

        System.out.println("Aplicando Orientação a objetos no Java");
        System.out.println("O meu nome é " + nome);
    }
}
