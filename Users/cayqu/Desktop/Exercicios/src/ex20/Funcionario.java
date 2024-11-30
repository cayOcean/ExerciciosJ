package ex20;

public class Funcionario {
    protected double salario;

    // Construtor
    public Funcionario(double salario) {
        this.salario = salario;
    }

    // Método para calcular o salário base
    public double calcularSalario() {
        return salario;
    }
}
