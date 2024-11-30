package ex20;

public class TesteFuncionario {

    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario(3000);
        System.out.println("Salário do funcionário: R$ " + funcionario.calcularSalario());

        Gerente gerente = new Gerente(4000, 1000);
        System.out.println("Salário do gerente com bônus: R$ " + gerente.calcularSalario());
    }
}
