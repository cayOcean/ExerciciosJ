package ex12;

public class TestePessoa {

    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa("Cayque", 19);
        Pessoa pessoa2 = new Pessoa("Professor André", 20);
        Pessoa pessoa3 = new Pessoa("Endrick Felipe", 18);

        System.out.println("Informações das Pessoas:");
        System.out.println("-------------------------");
        pessoa1.exibirInformacoes();
        System.out.println("-------------------------");
        pessoa2.exibirInformacoes();
        System.out.println("-------------------------");
        pessoa3.exibirInformacoes();
    }
}
