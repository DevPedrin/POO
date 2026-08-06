package programa;

public class Livro {
    private String titulo;
    private String autor;
    private boolean emprestado;


    public Livro(String titulo, String autor, boolean emprestado) {
        this.titulo = titulo;
        this.autor = autor;
        this.emprestado = emprestado;
    }

    String getTitulo() {
        return this.titulo;
    }

    void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    String getAutor() {
        return this.autor;
    }

    void setautor(String autor) {
        this.autor = autor;
    }

    boolean getEmprestado() {
        return this.emprestado;
    }

    void setEmprestado(boolean emprestado) {
        this.emprestado = emprestado;
    }




    public void emprestar() {
        if(emprestado) {
            this.emprestado = false;
            System.out.println("Emprestado");
        }
    }

    public void devolver() {
        if(!emprestado) {
            this.emprestado = true;
            System.out.println("devolvido");
        }
    }
}