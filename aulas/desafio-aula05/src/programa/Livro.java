//https://github.com/DevPedrin
package programa;

public class Livro {
    private String titulo, autor;
    private String editora; // extra
    private int qtdPaginas;
    private double preco;

    public Livro() {}
    
    public Livro(String titulo, String autor, String editora, double preco, int qtdPaginas) {
        this.autor = autor;
        this.preco = preco;
        this.editora = editora;
        this.qtdPaginas = qtdPaginas;
        this.titulo = titulo;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getEditora() {
        return editora;
    }

    public String getAutor() {
        return autor;
    }

    public int getQtdPaginas() {
        return qtdPaginas;
    }

    public double getPreco() {
        return preco;
    }


    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }


    public void setQtdPaginas(int qtdPaginas) {
        this.qtdPaginas = qtdPaginas;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    @Override
    public String toString() {
        return "Livro [titulo=" + titulo + ", autor=" + autor + ", editora=" + editora + ", qtdPaginas=" + qtdPaginas
                + ", preco=" + preco + "]";
    }
}