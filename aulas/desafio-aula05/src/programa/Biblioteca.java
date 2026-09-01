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
    public Biblioteca() {};

    public Biblioteca(String nome, List<Livro> livros) {
        this.livros = livros;
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
        this.livros = livros;
    }

    public void addLivro(Livro livro) {
        this.livros.add(livro);
    }

    public void removerLivro(Livro livro) {
        this.livros.remove(livro);
    }

    public void imprimirLivroMaisCaro() {
        System.out.print(Collections.max(livros, Comparator.comparingDouble(Livro::getPreco)));  //  mais simples

        // sim eu sei fazer a implementação de percorrer a estrutura de dados e comparar, so to testando coisas uteis do java
        // tbm poderia fazer com contador no for etc...
        /* 
        Livro maisCaro = livros.get(0); 

        for(Livro l : livros) {
            if(l.getPreco() >= maisCaro.getPreco()) {
                maisCaro = l;
            }
        }

        System.out.println(maisCaro);
        */
    }

    // extra, e só o inverso e tals 
    public void imprimirLivroMaisBarato() {
        System.out.println(Collections.min(livros, Comparator.comparing(Livro::getPreco)));
    }

    public double calcularMedia() {
        double sum = 0;

        // o tal do foreach
        for(Livro l : livros) {
            sum += l.getPreco();
        }

        return sum / livros.size();
    }

    public int contarLivrosAutor(String nomeAutor) {
        int qtd = 0;
        
        for(Livro livro : livros) {
            if(livro.getAutor().equals(nomeAutor)) {
                qtd += 1;
            }
        }

        return qtd;
    }  
    
    // extra
    public List<Livro> listaLivrosAutor(String nomeAutor) {
        List<Livro> livrosAutor = new ArrayList<>();

        for(Livro livro : livros) {
            if(livro.getAutor().equals(nomeAutor)) {
                livrosAutor.add(livro);
            }
        }

        return livrosAutor;
    }
}