public class Filme { //Abstração
    String nome;
    int anoLancamento;
    boolean noPlano;
    double somaAvaliacoes;
    int totalAvaliacoes;
    int duracaoMinutos;

    void exibirFichaTecnica() {
        System.out.println("Nome do Filme: " + nome);
        System.out.println("Ano de Lançamento: " + anoLancamento);
    }

    void avalia(double nota){
        somaAvaliacoes += nota;
        totalAvaliacoes++;
    }

    double pegaMedia(){
        return somaAvaliacoes / totalAvaliacoes;
    }
}
