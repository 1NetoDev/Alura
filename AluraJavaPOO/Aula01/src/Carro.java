public class Carro {
    String modelo;
    String marca;
    int ano;
    String cores;
    String estado; //Novo Semi-Novo
    double KMs;


    void exibirFicha() {
        System.out.println("Modelo: " + modelo + "\nMarca: " + marca);
        System.out.println("Ano: " + ano + "\nCores disponíveis: " + cores);
        System.out.println("Estado: " + estado);

        if (estado.equals("semiNovo")) {
            System.out.println("Kilometros rodados: " + KMs);
        }

    }
}
