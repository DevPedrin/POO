package programa;

public class Aluno {
   String nome;
   double notas[] = new double[2];
   int presencas;


   public Aluno(String nome, double notas[], int presencas){
       this.nome = nome;
       this.notas = notas;
       this.presencas = presencas;
   }




   public double calcularMedia(){
       double media =  (notas[0]+notas[1])/2;
       return media;
   }


   public String aprovado(){
       if(calcularMedia() >= 60 && presencas >=5){
           return "aprovado";
       } else {
           return "reprovado";
       }
   }


   public void exibirDados(){
       System.out.println("nome: "+nome);
       System.out.println("nota1: "+notas[0]);
       System.out.println("nota2: "+notas[1]);
       System.out.println("presenças: "+ presencas);
       System.out.println("Média: "+calcularMedia());
       System.out.println("Situação: "+aprovado());
   }
}