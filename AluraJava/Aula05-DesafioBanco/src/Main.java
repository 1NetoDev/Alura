import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Dados clientes

        String nome = "João Batista";
        String tipoConta = "Corrente";
        double saldo = 2500.00;
        double transferencia = 0;
        int opcao = 0;

        //Interface Menu
        System.out.println("********************************************************");
        System.out.println("Dados iniciais do Cliente:");
        System.out.println("" +
                "" +
                "");
        System.out.println("Nome:                             " + nome);
        System.out.println("Tipo de Conta:                        " + tipoConta);
        System.out.println("Saldo Atual:                            " + saldo);
        System.out.println("********************************************************");
        System.out.println("" +
                "");

        //Menu Opções
        while (opcao != 4){
            System.out.println("" +
                    "");
            System.out.println("Menu de Opções");

            System.out.println("1- Consultar saldo");
            System.out.println("2- Receber Valor");
            System.out.println("3- Transferir Valor");
            System.out.println("4- Sair");

            System.out.println("Digite a opção Desejada: ");
            opcao = scanner.nextInt();

            System.out.println("***********************");

            if (opcao == 1){
                System.out.println("Seu saldo é: " + saldo);
            }
            else if (opcao == 2){
                System.out.println("Digite o valor a ser recebido: ");
                saldo += scanner.nextDouble();
                System.out.println("Transferência realizada, seu saldo agora é: " + saldo);
            }
            else if (opcao == 3){
                System.out.println("Digite o valor a ser transferido: ");
                transferencia = scanner.nextDouble();
                if (saldo < transferencia){
                    System.out.println("Saldo Insuficiente, seu saldo é: " + saldo);
                }
                else {
                    saldo = saldo-transferencia;
                    System.out.println("Transferência realizada, seu saldo agora é: " + saldo);
                }
            }
            else if (opcao == 4) {
                System.out.println("Programa Encerrado, bom dia!");
                break;
            }
            else {
                System.out.println("Opção inválida");
            }
        }
    }
}