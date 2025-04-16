class mediaNotas{
    public static void main(String[] args) {
        double nota1 = 6.7;
        double nota2 = 7.2;
        double media = (nota1 + nota2) /2;
        System.out.println(media);
    }
}
class Casting{
    public static void main(String[] args) {
        double numeroDouble = 15.7;
        int numeroInteiro = (int) numeroDouble;
        System.out.println("Casting de double para int: " + numeroInteiro);
    }
}

class Palavras{
    public static void main(String[] args) {
        char letra = 'A';
        String palavra = "MARELO";

        String mensagem = "A letra é " + letra + " e a palavra é " + palavra;

        System.out.println(mensagem);
    }
}

class compras{
    public static void main(String[] args){
        double precoProduto = 12.5;
        int quantidade = 10;
        double total = precoProduto*quantidade;
        String mensagem = "O valor da compra deu: " + total;
        System.out.println(mensagem);
    }
}

class dolares{
    public static void main(String[] args){
        double valorEmDolares = 10.0;
        double dolar = 4.94;
        double valorReal = valorEmDolares*dolar;
        System.out.println(valorReal);
    }
}

class original{
    public static void main(String[] args){
        double precoOriginal = 40.0;
        double desconto = 10.0;
        double valorDesconto = (desconto / 100) * precoOriginal;
        double precoFinal = precoOriginal - valorDesconto;
        System.out.println(precoFinal);
    }
}