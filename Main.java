class Imc {
    private String nome;
    private double peso;
    private double altura;

    public Imc(String nome, double peso, double altura) {
        this.nome = nome;
        this.peso = peso;
        this.altura = altura;
    }
    
    double calcular() {
        return this.peso / (this.altura * this.altura);
    }

    void showInfos() {
        System.out.printf("nome: %s \n peso: %f \n altura: %f \n IMC: %f", this.nome, this.peso, this.altura, calcular());
    }
}

public class Main {
    public static void main(String[] args) {
        Imc calculo = new Imc("fulano", 65.3, 1.76);

        System.out.println(calculo.calcular());
    }
}