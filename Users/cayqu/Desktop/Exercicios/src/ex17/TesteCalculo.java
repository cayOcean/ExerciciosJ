package ex17;

public class TesteCalculo {

    public static void main(String[] args) {
        Calculadora calc = new Calculadora();

        double num1 = 10.5;
        double num2 = 5.5;

        System.out.println("Soma: " + calc.somar(num1, num2));
        System.out.println("Subtração: " + calc.subtrair(num1, num2));
        System.out.println("Multiplicação: " + calc.multiplicar(num1, num2));
        System.out.println("Divisão: " + calc.dividir(num1, num2));

        System.out.println("Divisão por zero: " + calc.dividir(num1, 0));
    }
}
