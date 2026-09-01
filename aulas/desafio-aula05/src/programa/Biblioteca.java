//https://github.com/DevPedrin
package programa;

import java.util.ArrayList;
//import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


public class Biblioteca {
    private String nome; 
    private List<Livro> livros;
    public Biblioteca() {
        this.livros = new ArrayList<>();
    };

    public Biblioteca(String nome, List<Livro> livros) {
        this.livros = (livros != null) ? livros : new ArrayList<>();
        this.nome = nome;
    } 

    public String getNome() {
        return nome;
    }
    
    public List<Livro> getLivros() {
        return livros;
    }


    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setLivros(List<Livro> livros) {
        if(!livros.isEmpty()) {
            this.livros = livros;
        }
    }

    public void addLivro(Livro livro) {
        this.livros.add(livro);    
    }

    public void removerLivro(Livro livro) {
        if(!livros.isEmpty()) {
            this.livros.remove(livro);
        }
    }

    // extra, so para padronizar e não repetir nos outros metados
    private void imprimirLivro(Livro livro) {
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

    // extra
    public void imprimirTodosLivros()  {
        for(Livro livro : livros) {
            imprimirLivro(livro);
        }
    }

    // extra
    public void imprimirLivrosAutor(String nomeAutor) {
        for(Livro livro : livros) { 
            if(livro.getAutor().equals(nomeAutor)) {
                imprimirLivro(livro);
            }
        }
    }

    public void imprimirLivroMaisCaro() {
        if(!livros.isEmpty()) {
            Livro livroMaisCaro = Collections.max(livros, Comparator.comparingDouble(Livro::getPreco));  //mais simples

            imprimirLivro(livroMaisCaro);

        }

        // sim eu sei fazer a implementação de percorrer a estrutura de dados e comparar, so to testando coisas uteis do java
        // tbm poderia fazer com contador no for etc...
        /* 
        Livro livroMaisCaro = livros.get(0); 

        for(Livro l : livros) {
            if(l.getPreco() >= maisCaro.getPreco()) {
                maisCaro = l;
            }
        }

        System.out.println(maisCaro);
        */
    }

    // extra, mostra o mais barato  
    public void imprimirLivroMaisBarato() {
        if(!livros.isEmpty()) {
            Livro livroMaisBarato = Collections.min(livros, Comparator.comparingDouble(Livro::getPreco));  //mais simples

            imprimirLivro(livroMaisBarato);
        }
    }

    // extra
    public int qtdTotalLivros() {
        return livros.size();
    }

    // extra, retorna o preço total de todos os livros
    public double precoTotalLivros() {
        double sum = 0;
        
        if(livros.isEmpty()) {
            return 0;
        } 

        for(Livro livro : livros) {
            sum += livro.getPreco();
        }

        return sum;
    }

    public double calcularMedia() {
        if(livros.isEmpty()) {
            return 0;
        } 

        return precoTotalLivros() / qtdTotalLivros(); // usa os metados da classe para calcular a media
    }

    public int contarLivrosAutor(String nomeAutor) {
        int qtd = 0;

        for(Livro livro : livros) {
            if(livro.getAutor().equals(nomeAutor)) {
                qtd++;
            }
        }
        
        return qtd;
    }  

    // extra, lista todos os livros filtrando pelo autor
    public List<Livro> listaLivrosAutor(String nomeAutor) {
        // poderia ter um try/catch para ver se existe esse autor
        List<Livro> livrosAutor = new ArrayList<>();

        for(Livro livro : livros) { 
            if(livro.getAutor().equals(nomeAutor)) {
                livrosAutor.add(livro);
            }
        }

        return livrosAutor;
    }

    @Override
    public String toString() {
        return "Biblioteca [nome=" + nome + ", totalLivros=" + qtdTotalLivros() + ", precoTotal=" + precoTotalLivros() + "]";
    }
}