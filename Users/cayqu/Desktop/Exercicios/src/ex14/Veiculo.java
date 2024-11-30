package ex14;

public interface Veiculo {
    void mover();
    static void main(String[] args) {
        Veiculo carro = new Carro();
        Veiculo bicicleta = new Bicicleta();
        
        System.out.println("Comportamento do Carro:");
        carro.mover();
        System.out.println("-------------------------");
        System.out.println("Comportamento da Bicicleta:");
        bicicleta.mover();
    }
}
