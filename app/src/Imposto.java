import java.util.Scanner;
public class Imposto{
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
       
        double  salario, imposto ,devolucao, total;
        System.out.printf("Insira a idade");
       salario= ler.nextDouble();
       
        
        if(salario < 1903.98) {
           
            System.out.print("você n precisa pagar imposto");
          
        } else if (salario >= 1903.99 && salario<= 2826.65) {
            imposto = salario * 7.5 /100;
            devolucao = 142.80;
            total= salario - devolucao;
            System.out.println("você deve pagar  R$" + total + " sua devolução foi de  R$" + devolucao);
        } else if (salario>= 2826.65 && salario<= 3751.05 ) {
            imposto = salario * 15 /100;
            devolucao = 354.80;
            total= salario - devolucao;
            System.out.println("você deve pagar  R$" + total + " sua devolução foi de  R$" + devolucao);
        } 
        else if ( salario>3751.06 && salario <= 4664.68 ) {
            imposto= salario * 22.5 /100;
            devolucao = 636.13;
            total= salario - devolucao;
            System.out.println("você deve pagar  R$" + total + " sua devolução foi de  R$" + devolucao);
        }else if (salario >4664.68 ) {
            imposto = salario * 27.5 /100;
            devolucao = 869.36;
            total= salario - devolucao;
            System.out.println("você deve pagar  R$" + total + " sua devolução foi de  R$" + devolucao);
        }}}
