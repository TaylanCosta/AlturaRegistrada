import java.util.Scanner;

public class ProjetoGPT {
    public static void main(String[] args) {
        // Solicitando o nome do usuário
        try ( // Criando o objeto Scanner
                Scanner input = new Scanner(System.in)) {
            // Solicitando o nome do usuário
            System.out.print("Digite seu nome: ");
            String nome = input.nextLine();
            // Solicitando a idade do usuário
            System.out.print("Digite sua idade: ");
            int idade = input.nextInt();
            // Exibindo a mensagem
            System.out.println("Olá, " + nome + "! Você tem " + idade + " anos.");
            // Encerrando o Scanner
        }
    }
}
