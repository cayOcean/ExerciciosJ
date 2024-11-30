package ex13;

public class TesteAnimal {
    public static void main(String[] args) {
        Animal cachorro = new Cachorro();
        Animal gato = new Gato();

        System.out.println("Som do Cachorro:");
        cachorro.fazerSom();
        System.out.println("---------------------");
        System.out.println("Som do Gato:");
        gato.fazerSom();
    }
}
