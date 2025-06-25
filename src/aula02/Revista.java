package aula02;

public class Revista extends Livro {

    private int edicao;

    public int getEdicao() {
        return edicao;
    }

    public void setEdicao(int edicao) {
        this.edicao = edicao;
    }

    @Override
    public void exibirDetalhes() {
        System.out.println("Titulo: " + getTitulo());
        System.out.println("Autor: " + getAutor());
        System.out.println("Ano de Publicação: " + getAnoPublicacao());
        System.out.println("Edição: " + getEdicao());
        System.out.println("\n");
    }

}
