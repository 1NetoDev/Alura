import java.util.Scanner;

class PositivoNegativo{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número positivo ou negativo: ");
        int numero = scanner.nextInt();
        if (numero > 0) {
            System.out.println("Número positivo");
        } else {
            System.out.println("Número negativo");
        }
    }
}

class MaiorQue{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro numero inteiro: ");
        int primeiroNumero = scanner.nextInt();

        System.out.println("Digite o segundo numero inteiro: ");
        int segundoNumero = scanner.nextInt();

        if (primeiroNumero == segundoNumero){
            System.out.println("Os números são iguais:" + primeiroNumero + "," +segundoNumero);}
        else if (primeiroNumero > segundoNumero) {
            System.out.println("Os números são diferentes: " + primeiroNumero + " é maior que " + segundoNumero);}
        else if (segundoNumero > primeiroNumero) {
            System.out.println("Os números são diferentes: " + segundoNumero + " é maior que " + primeiroNumero);}
    }
}



class CalculadoraArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int escolha = 0;

        while (escolha != 3) {
            System.out.println("-----Menu Calculadora-----");
            System.out.println("1 - Área do quadrado");
            System.out.println("2 - Área do círculo");
            System.out.println("3 - Sair");
            System.out.print("Escolha uma opção: ");
            escolha = scanner.nextInt();

            if (escolha == 1) {
                System.out.print("Digite o lado do quadrado: ");
                double lado = scanner.nextDouble();
                double areaQuadrado = lado * lado;
                System.out.println("Área do quadrado: " + areaQuadrado);

            } else if (escolha == 2) {
                System.out.print("Digite o raio do círculo: ");
                double raio = scanner.nextDouble();
                double areaCirculo = 3.14 * raio * raio;
                System.out.println("Área do círculo: " + areaCirculo);

            } else if (escolha == 3) {
                System.out.println("Fim do Programa .");

            } else {
                System.out.println("Erro. Tente novamente.");
            }
        }
    }
}

class tabuada{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero = -1;

        while (numero != 0){
            System.out.println("-----Tabuada-----");
            System.out.println("Digite o número da tabuada: ");
            numero = scanner.nextInt();
            System.out.println("A tabuada de: " + numero + "é:");
            System.out.println(numero*1);
            System.out.println(numero*2);
            System.out.println(numero*3);
            System.out.println(numero*4);
            System.out.println(numero*5);
            System.out.println(numero*6);
            System.out.println(numero*7);
            System.out.println(numero*8);
            System.out.println(numero*9);
            System.out.println(numero*10);
        }
    }
}

class parImpar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero = -1;

        while (numero != 0){
        System.out.println("-----Par ou impar-----");
        System.out.println("Digite um número para descobrir se é par ou ímpar: ");
        numero = scanner.nextInt();

        if (numero%2 == 0){
            System.out.println("O número: " + numero + " é par");
        }
        else {
            System.out.println("O número: " + numero + " é impar");
        }
    }
}}

class fatorial{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("-----Fatorial-----");
        System.out.println("" +
                "" +
                "");
        System.out.println("Digite calcular o fatorial: ");
        int numero = scanner.nextInt();

        int fatorial = 1;

        for (int i =1; i <= numero; i++){

            fatorial *= i;
        }
        System.out.println("O fatorial de: " + numero + " é: " + fatorial);
    }
}