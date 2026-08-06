package programa;


class Carro {
    private String modelo;
    private int velocidade;

    public  Carro(String modelo, int velocidade) {
        this.modelo = modelo;
        this.velocidade = velocidade;
    }

    public String getModelo() {
        return this.modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    
    public int getVelocidade() {
        return this.velocidade;
    }

    public void setVelocidade(int velocidade) {
        this.velocidade = velocidade;
    }


    public void acelerar() {
        velocidade += 10;
    }

    public void freiar() {
        velocidade -= 10;
    }

    public void mostrarVlocidade() {
        System.out.printf("Modelo: %s Velocidade atual: %d", modelo, velocidade);
    }
}