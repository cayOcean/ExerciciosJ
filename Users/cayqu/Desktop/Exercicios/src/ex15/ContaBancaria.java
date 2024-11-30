package ex15;

public class ContaBancaria {
    private double saldo;
    private int numero;

    public ContaBancaria(int numero, double saldoInicial) {
        this.numero = numero;
        this.saldo = saldoInicial;
    }

    public double getSaldo() {
        return saldo;
    }

    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
            System.out.println("Depósito de R$" + valor + " realizado com sucesso!");
        } else {
            System.out.println("Valor de depósito inválido.");
        }
    }

    public void exibirDetalhes() {
        System.out.println("Número da Conta: " + numero);
        System.out.println("Saldo Atual: R$" + saldo);
    }
}
