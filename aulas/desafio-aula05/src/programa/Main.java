
//https://github.com/DevPedrin
package  programa;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Livro livro1 = new Livro("O Pequeno Príncipe", "Antonie de Saint-Exupéry", "Editora Lafonte", 74.93, 96);
        Livro livro2 = new Livro("Use a cabeça! HTML e CSS", "Elisabeth Robson", "Alta Books", 230, 496);
        Livro livro3 = new Livro("Design Patterns", "Erich Gamma", "Addison-Wesley Professional", 133.94, 416);
        Livro livro4 = new Livro("Clean Code", "Robert C. Martin", "Prentice Hall PTR", 198.05, 431);
        Livro livro5 = new Livro("Use a cabeça! Java", "Bert Bates", "Alta Books", 60, 496);
        Livro livro6 = new Livro("It: A Coisa", "Stephen King", "Suma", 100.00, 1104);
        Livro livro7 = new Livro("O Iluminado", "Stephen King", "Suma", 80.00, 464);
        
        Biblioteca library = new Biblioteca("Minha Biblioteca", new ArrayList<>());

        library.addLivro(livro1);
        library.addLivro(livro2);
        library.addLivro(livro3);
        library.addLivro(livro4);
        library.addLivro(livro5);
        library.addLivro(livro6);
        library.addLivro(livro7);


        /* 
        library.imprimirTodosLivros();
        
        library.removerLivro(livro2); 
        
        library.imprimirTodosLivros();

        
        */

        //library.imprimirLivroMaisBarato();
        
        library.calcularMedia();
        library.contarLivrosAutor("Stephen King");
    }
}