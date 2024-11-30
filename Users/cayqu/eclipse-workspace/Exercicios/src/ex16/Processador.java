package ex16;

public class Processador {
    private String modelo;
    private double velocidadeGHz;
    private int nucleos;

    public Processador(String modelo, double velocidadeGHz, int nucleos) {
        this.modelo = modelo;
        this.velocidadeGHz = velocidadeGHz;
        this.nucleos = nucleos;
    }

    public String exibirDetalhes() {
        return "Modelo: " + modelo + ", Velocidade: " + velocidadeGHz + " GHz, Núcleos: " + nucleos;
    }
}
