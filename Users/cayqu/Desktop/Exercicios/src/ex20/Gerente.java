package ex20;

public class Gerente extends Funcionario {
    private double bonus;
    public Gerente(double salario, double bonus) {
        super(salario); )
        this.bonus = bonus;
    }

    public double calcularSalario() {
        return salario + bonus; 
    }
}
