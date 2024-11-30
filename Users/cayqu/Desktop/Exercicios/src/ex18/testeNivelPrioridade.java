package ex18;

public class testeNivelPrioridade {

    public static void main(String[] args) {
        // Exibindo os detalhes de cada nível de prioridade
        for (nivelPrioridade nivel : nivelPrioridade.values()) {
            nivel.exibirDetalhes();
        }
    }
}
