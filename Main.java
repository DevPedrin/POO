import java.util.Scanner;



class Calculadora {
    int n1, n2;
    int res;

    Calculadora(int n1, int n2) {
        this.n1 = n1;
        this.n2 = n2;
    }

    int calcular() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a operação: 1 = [soma]  2 = [multipicacao] 3 = [divisao] 4 = [subtracao]");
        int operacao = sc.nextInt();
        sc.nextLine();

        if(operacao == 1) {
            this.res =  this.n1 + this.n2;
        } else if(operacao == 2) {
            this.res =  this.n1 * this.n2;
        } else if(operacao == 3) {
            this.res =  this.n1 / this.n2;
        } else if(operacao == 4) {
            this.res =  this.n1 - this.n2;
        } else {
            System.out.println("Operador invalido");
        }
        sc.close();
        return res;
    }
}

public class Main {
    public static void main(String[] args) {
        Calculadora calc = new Calculadora(2,2);

        System.out.println(calc.calcular());
    }
}