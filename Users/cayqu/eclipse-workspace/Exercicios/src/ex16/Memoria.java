package ex16;

public class Memoria {
    private String tipo;
    private int capacidadeGB;
    private int frequenciaMHz;

    public Memoria(String tipo, int capacidadeGB, int frequenciaMHz) {
        this.tipo = tipo;
        this.capacidadeGB = capacidadeGB;
        this.frequenciaMHz = frequenciaMHz;
    }

    public String exibirDetalhes() {
        return "Tipo: " + tipo + ", Capacidade: " + capacidadeGB + " GB, Frequência: " + frequenciaMHz + " MHz";
    }
}
