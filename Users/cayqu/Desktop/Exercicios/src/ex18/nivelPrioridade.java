package ex18;

public enum nivelPrioridade {
    BAIXO(1),
    MEDIO(2),
    ALTO(3),
    URGENTE(4);

    private int codigo;

    // Construtor da enumeração
    private nivelPrioridade(int codigo) {
        this.codigo = codigo;
    }

    // Método para obter o código associado ao nível de prioridade
    public int getCodigo() {
        return codigo;
    }

    // Método para exibir o nome e o código do nível de prioridade
    public void exibirDetalhes() {
        System.out.println("Prioridade: " + this.name() + ", Código: " + this.getCodigo());
    }
}
