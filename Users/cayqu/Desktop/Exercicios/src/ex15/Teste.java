package ex15;

public class Teste {

    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria(12345, 500.00);

        System.out.println("Informações Iniciais da Conta:");
        conta.exibirDetalhes();
        System.out.println("--------------------------");

        conta.depositar(200.00);
        System.out.println("--------------------------");

        conta.depositar(-50.00);
        System.out.println("--------------------------");

        System.out.println("Saldo Final: R$" + conta.getSaldo());
    }
}
