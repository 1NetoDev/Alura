public class Principal {
    public static void main(String[] args) {
        Filme meuFilme = new Filme(); //Esquerda serve como gaveta para guardar o objeto, direita de fato o cria
        meuFilme.nome = "Carros 2";
        meuFilme.anoLancamento = 2010;
        meuFilme.duracaoMinutos = 180;

        meuFilme.exibirFichaTecnica();
        meuFilme.avalia(8);
        meuFilme.avalia(5);
        meuFilme.avalia(10);
        System.out.println(meuFilme.somaAvaliacoes);
        System.out.println(meuFilme.totalAvaliacoes);
        System.out.println(meuFilme.pegaMedia());
    }
}
