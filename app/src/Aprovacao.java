import java.util.Scanner;


public class Aprovacao {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
    
       
    
            double nota1 , nota2, media;
    
            System.out.println("informe a primeira nota");
             nota1= ler.nextDouble();
            System.out.println("Informe a segunda nota");
            nota2 = ler.nextDouble();
            
            
    
            media = (nota1+nota2)/2;
            
            if (media >=7) {
                System.out.println("APROVADO");
            }else if (media == 10){
                System.out.println("APROVADO COM DISTINÇÃO"); 
            }else if (media >= 3 && media <7){
                System.out.println("EXAME"); 
            }else if (media < 10){
                System.out.println("REPROVADO"); 
            }
            
            
    
            
          
        }
}
