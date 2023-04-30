import java.util.Scanner;
public class Ingresso {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
       
        int idade;
        System.out.printf("Insira a idade");
       idade= ler.nextInt();
       
        
        if(idade < 10) {
           
            System.out.print("você deve pagar R$ 30.00");
          
        } else if (idade > 10 && idade <= 29) {
            
            System.out.println("você deve pagar R$60.00");
        } else if (idade > 29 && idade<= 45 ) {
            
            System.out.println("você deve pagar R$120.00");
        } 
        else if (idade >45 && idade <= 59 ) {
            
            System.out.println("você deve pagar R$150.00");
        }else if (idade >59) {
            System.out.println("você deve pagar R$300.00");
        }}}
