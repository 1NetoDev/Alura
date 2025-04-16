import java.util.Random;
import java.util.Scanner;

class JogoAdivinhacao {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int numeroGerado = new Random().nextInt(100); //Gera um numero aleatório com a biblioteca
        int tentativas = 0;
        int numeroDigitado = 0;

        while (tentativas < 6){
            System.out.print("Digite um número de 0 a 100: ");
            numeroDigitado = leitor.nextInt();
            tentativas++;

            if (numeroDigitado == numeroGerado) {
                System.out.println("Parabéns, você acertou em:" + tentativas + "o numero era: " + numeroGerado);
                break;
            } else if (numeroDigitado < numeroGerado) {
                System.out.println("O número digitado é menor que o gerado");
            } else {
                System.out.println("O número digitado é maior que o gerado");
            }
        }

        if (tentativas == 6 && numeroDigitado != numeroGerado){
            System.out.println("Você excedeu as tentativas, o número era: " + numeroGerado);
        }
    }
}