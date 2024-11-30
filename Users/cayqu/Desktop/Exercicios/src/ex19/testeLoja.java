package ex19;

public class testeLoja {

    public static void main(String[] args) {
        // Criando um objeto da Loja
        Loja loja = new Loja();

        // Testando o método calcularPreco sem desconto
        double precoBase = 100.0;  // Preço base de um produto
        int quantidade = 5;        // Quantidade do produto
        double precoTotal = loja.calcularPreco(precoBase, quantidade);
        System.out.println("Preço sem desconto: R$ " + precoTotal);

        // Testando o método calcularPreco com desconto
        double descontoPercentual = 10.0;  // Desconto de 10%
        double precoComDesconto = loja.calcularPreco(precoBase, quantidade, descontoPercentual);
        System.out.println("Preço com desconto de " + descontoPercentual + "%: R$ " + precoComDesconto);
    }
}
