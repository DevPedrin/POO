
//https://github.com/DevPedrin
package  programa;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Lista de livros para "adicionar" na biblioteca 
        List<Livro> livros = new ArrayList<>();

        livros.add(
            new Livro("O Pequeno Príncipe", "Antonie de Saint-Exupéry", "Editora Lafonte", 74.93, 96)
        );

        livros.add(
            new Livro("Use a cabeça! HTML e CSS", "Elisabeth Robson", "Alta Books", 230, 496)
        );

        livros.add(
            new Livro("Design Patterns", "Erich Gamma", "Addison-Wesley Professional", 133.94, 416)
        );

        livros.add(
            new Livro("Clean Code", "Robert C. Martin", "Prentice Hall PTR", 198.05, 431)
        );

        livros.add(
            new Livro("Use a cabeça! Java", "Bert Bates", "Alta Books", 60, 496)
        );

        livros.add(
            new Livro("It: A Coisa", "Stephen King", "Suma", 100.00, 1104)
        );

        livros.add(
            new Livro("O Iluminado", "Stephen King", "Suma", 80.00, 464)
        );



        Biblioteca library = new Biblioteca("lib1", livros);


        System.out.printf("Quantidade de livros do Stephen King: %d", library.contarLivrosAutor("Stephen King"));

        /* 
        //Lista de livros da Biblioteca
        List<Livro> listaLivros = library.getLivros();
        q
        for(Livro livro : listaLivros) {
            System.out.printf("""
                Titulo: %s%n
                Autor: %s%n
                Editora: %s%n
                Preço: %.2f%n
                Quantidade de páginas: %d%n
                ----------------------------

                """,
                livro.getTitulo(),
                livro.getAutor(),
                livro.getEditora(),
                livro.getPreco(),
                livro.getQtdPaginas()
            );
        }
        */

        
    }
        
}