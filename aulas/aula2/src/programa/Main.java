package programa;

public class Main {
    public static void main(String[] args) {
        ContaBancaria cb = new ContaBancaria("pedro", 0);

        cb.consultarSaldo();
        cb.depositar(100);
       // System.out.println(cb.getSaldo());

    }
}