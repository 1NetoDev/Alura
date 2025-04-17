import java.util.Scanner;

public class Calculadora {
    double numero1;
    double numero2;
    Scanner scanner = new Scanner(System.in);

    void dobraNumero() {
        System.out.println("Digite o primeiro número: ");
        numero1 = scanner.nextDouble();
        System.out.println("Digite o segundo número: ");
        numero2 = scanner.nextDouble();
        System.out.println("O dobro desses números são: " + numero1 * 2 + " | " + numero2 * 2);
    }
}
