package ex11;

public class TesteLivro {

    public static void main(String[] args) {
        Livro livro1 = new Livro("Palmeiras", "Abel Ferreira", 1914);
        Livro livro2 = new Livro("Neymar", "Messi", 1011);
        Livro livro3 = new Livro("Biblia", "Deus", 256);

        System.out.println("Detalhes dos Livros:");
        System.out.println("--------------------");
        livro1.exibirDetalhes();
        System.out.println("--------------------");
        livro2.exibirDetalhes();
        System.out.println("--------------------");
        livro3.exibirDetalhes();
    }
}
