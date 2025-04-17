import java.util.Scanner;

public class Musica {
    Scanner scanner = new Scanner(System.in);
    String titulo;
    String artista;
    int anoLancamento;
    double somaAvaliacoes;
    int totalAvaliacoes;
    int opcao;
    double nota;

    void mostraFichaTecnica() {
        System.out.println("--------- Musíca ---------");
        System.out.println("O titulo é: " + titulo);
        System.out.println("O artista é: " + artista);
        System.out.println("O ano de Lançamento é: " + anoLancamento);
        System.out.println("\n");
    }

    void avalia(double nota) {
        somaAvaliacoes += nota;
        totalAvaliacoes++;
    }

    double avaliacao() {
        System.out.println("Você pode avaliar quantas vezes quiser");
        System.out.println("Desejar avaliar? Digite 1 | Quer pular? Digite 2: ");
        opcao = scanner.nextInt();
        if (opcao == 1) {

            System.out.println("Insira sua avaliação: ");
            nota = scanner.nextDouble();
            somaAvaliacoes += nota;
            totalAvaliacoes++;
            System.out.println("A média atual com: " + totalAvaliacoes + " avaliações é: " + pegaMedia());
            return avaliacao();

        } else if (opcao == 2) {
            System.out.println("Vejo o resultado então: ");
            System.out.println("\n");
            System.out.println("A média atual com: " + totalAvaliacoes + " avaliações é: " + pegaMedia());

        } else {
            System.out.println("Número Digitado Incorreto, tente novamente");
            System.out.println("\n");
            return avaliacao();
        }
        return 0;
    }

    double pegaMedia() {
        return somaAvaliacoes / totalAvaliacoes;
    }


}
