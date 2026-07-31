import java.util.Scanner;


class Calculadora {
    void calcular(int n1, int n2, String operacao) {
        // não vou tratrar tantos casos kk 
        switch (operacao) {
            case "s":
                System.out.println(n1+n2);
                break;
            case "m":
                System.out.println(n1*n2);
                break;
            
            case "d":
                System.out.println(n1/n2);
                break;

            case "sub":
                System.out.println(n1-n2);
                break;
        
            default:
                System.out.println("error");
                break;
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Calculadora calc = new Calculadora();

        System.out.println("Digite a operação");
        Scanner sc = new Scanner(System.in);
        String opc = sc.nextLine();
        sc.close();

        calc.calcular(2, 2, opc);
    }
}