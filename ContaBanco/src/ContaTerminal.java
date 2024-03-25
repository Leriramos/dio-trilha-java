import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        // Criando um objeto Scanner para receber entradas do terminal

        Scanner scanner = new Scanner(System.in);

        // Solicitando e lendo o número da Agência
        System.out.println("Por gentileza, digite o número a agência: ");
        String agencia = scanner.nextLine();

        System.out.println("Digite o número da conta: ");
        int conta = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Digite o nome do cliente: ");
        String nomeCliente = scanner.nextLine();

        System.out.println("Digite o saldo: ");
        double saldo = scanner.nextDouble();

        // Fechando o scanner após a leitura
        scanner.close();

        // Construindo a mensagem de saudação com as informações inseridas pelo usuário
        String mensagem = "Olá " + nomeCliente + " obrigado por criar uma conta em nosso banco, sua agência é " + agencia
                + ", conta " + conta + "e seu saldo " + saldo + " já está disponível para saque.";

        // Exibindo a mensagem de saudação
        System.out.println(mensagem);
    }
}
