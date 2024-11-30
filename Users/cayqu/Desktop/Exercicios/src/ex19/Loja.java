package ex19;

public class Loja {

    public double calcularPreco(double precoBase, int quantidade) {
        return precoBase * quantidade;
    }

    public double calcularPreco(double precoBase, int quantidade, double descontoPercentual) {
        double precoSemDesconto = precoBase * quantidade;
        double desconto = precoSemDesconto * (descontoPercentual / 100);
        return precoSemDesconto - desconto;
    }
}
