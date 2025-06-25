package aula02;

public class Main {

    public static void main(String[] args) {
        Livro harryPotter = new Livro();
        harryPotter.setAutor("J.K Rowling");
        harryPotter.setTitulo("Harry Potter e a Pedra Filosofal");
        harryPotter.setAnoPublicacao(1997);

        Livro horaDaEstrela = new Livro();
        horaDaEstrela.setAutor("Clarice Lispector");
        horaDaEstrela.setTitulo("A hora da estrela");
        horaDaEstrela.setAnoPublicacao(1977);

        Revista revista = new Revista();
        revista.setAutor("Mariana Lopes");
        revista.setTitulo("Mundo Inovação");
        revista.setAnoPublicacao(2024);
        revista.setEdicao(18);

        Biblioteca biblioteca = new Biblioteca();
        biblioteca.adicionarLivro(harryPotter);
        biblioteca.adicionarLivro(horaDaEstrela);
        biblioteca.adicionarLivro(revista);

        biblioteca.listarLivros();

    }
}
