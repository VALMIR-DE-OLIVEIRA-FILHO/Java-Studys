import java.util.Scanner;
public class Imc {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
       
        double peso;
        System.out.printf("Insira o seu IMC:");
        peso= ler.nextDouble();
       
        
        if(peso < 18.5) {
           
            System.out.print("Abaixo do peso normal");
          
        } else if (18.5 > 10 && peso <= 24.9) {
            
            System.out.println("Peso normal");
        } else if (peso > 25 && peso<= 29.9 ) {
            
            System.out.println("Excesso de peso");
        } 
        else if (peso >30 && peso <= 34.9 ) {
            
            System.out.println("Obesidade classe I");
        }else if (peso > 35 && peso < 39.9) {
            System.out.println("Obesidade classe II");
        }else if (peso >+ 40 ) {
            System.out.println("Obesidade classe III");
        }}}


