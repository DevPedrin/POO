package programa;


public  class ContaBancaria {
    private String titular;
    private double saldo;


    public ContaBancaria(String titular, double saldo) {
        this.titular = titular;
        this.saldo = saldo;
    }

    
    void depositar(double  valor) {
        this.saldo += valor;
    }

    void sacar(double valor) {
        this.saldo -= valor;
    }

    void consultarSaldo() {
        System.out.printf("Titular: %s \n Saldo atual: %.2f", this.titular, this.saldo);
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }


}