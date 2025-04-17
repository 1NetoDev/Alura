import java.util.Scanner;

public class Pessoa {
    String nome;
    int idade;
    double altura;
    double peso;
    String sexo;

    void falar() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite sua mensagem: ");
        String mensagem = scanner.nextLine();
        System.out.println(mensagem);
    }
}
