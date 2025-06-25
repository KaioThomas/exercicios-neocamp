package aula02;

import java.util.ArrayList;

public class Biblioteca {

    private ArrayList<Livro> livros = new ArrayList<Livro>();


    public void adicionarLivro(Livro livro) {
        livros.add(livro);
    }

    public void listarLivros() {
        livros.forEach(Livro::exibirDetalhes);
    }

    public Livro buscarLivroPorTitulo(String titulo) {
        return livros.stream()
                .filter(livro -> livro.getTitulo().equals(titulo))
                .toList()
                .getFirst();
    }
}
