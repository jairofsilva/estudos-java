import java.util.Scanner;

    public class ContaTerminal {
    
        public static void main(String[] args) {
            // Criando um objeto Scanner para entrada de dados via terminal
            Scanner scanner = new Scanner(System.in);
    
            // Declarando as variáveis
            int numeroConta;
            String agencia;
            String nomeCliente;
            double saldo;
    
            // Solicitando as informações ao usuário
            System.out.println("Por favor, digite o número da Conta:");
            numeroConta = scanner.nextInt();
            scanner.nextLine(); // Consumir a quebra de linha
    
            System.out.println("Por favor, digite o número da Agência (ex: 067-8):");
            agencia = scanner.nextLine();
    
            System.out.println("Por favor, digite o seu nome:");
            nomeCliente = scanner.nextLine();
    
            System.out.println("Por favor, digite o saldo inicial:");
            saldo = scanner.nextDouble();
    
            // Exibindo a mensagem formatada com os dados do cliente
            String mensagem = "Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " +
                    agencia + ", conta " + numeroConta + " e seu saldo " + saldo + " já está disponível para saque.";
            System.out.println(mensagem);
    
            // Fechando o scanner para evitar vazamento de recursos
            scanner.close();
        }
    }
    