import java.util.Scanner;

public class Nota{
    public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);

   

        double nota1 , nota2,nota3, media;

        System.out.println("informe a primeira nota");
         nota1= ler.nextDouble();
        System.out.println("Informe a segunda nota");
        nota2 = ler.nextDouble();
        System.out.println("Informe a terceira nota");
        nota3 = ler.nextDouble();

        media = (nota1+nota2+nota3)/3;
        
        if (media >=7) {
            System.out.println("sua média foi de "  +  media + " portanto você está aprovado");
        }else{
            System.out.println("sua média foi de "  +  media + " portanto você está reprovado"); 
        }

        
      
    }
}