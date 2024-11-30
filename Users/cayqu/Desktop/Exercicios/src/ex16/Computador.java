package ex16;

public class Computador {
    private Processador processador;
    private Memoria memoria;

    public Computador(Processador processador, Memoria memoria) {
        this.processador = processador;
        this.memoria = memoria;
    }

    public void exibirCaracteristicas() {
        System.out.println("Características do Computador:");
        System.out.println("Processador: " + processador.exibirDetalhes());
        System.out.println("Memória: " + memoria.exibirDetalhes());
    }

    public static void main(String[] args) {
        Processador processador = new Processador("Intel Core i7", 3.5, 8);
        Memoria memoria = new Memoria("DDR4", 16, 3200);
        Computador computador = new Computador(processador, memoria);
        computador.exibirCaracteristicas();
    }
}
