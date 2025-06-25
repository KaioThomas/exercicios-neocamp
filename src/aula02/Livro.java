package aula02;

public class Livro extends Item {

    private String titulo;
    private String autor;
    private int anoPublicacao;

    @Override
    public void exibirDetalhes() {
        System.out.println("Titulo: " + getTitulo());
        System.out.println("Autor: " + getAutor());
        System.out.println("Ano de Publicação: " + getAnoPublicacao());
        System.out.println("\n");
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAnoPublicacao() {
        return anoPublicacao;
    }

    public void setAnoPublicacao(int anoPublicacao) {
        if(anoPublicacao < 0) {
            System.out.println("Ano de publicação inválido");
        } else {
          this.anoPublicacao = anoPublicacao;
        }
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }
}
