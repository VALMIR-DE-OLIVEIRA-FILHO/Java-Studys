import java.util.Scanner;

public class Par {
    


    public static void main(String[] args) {
      Scanner ler = new Scanner(System.in);
      int numero, modulo;
      System.out.printf("Insira um numero");
      numero= ler.nextInt();
      modulo = numero % 2;
      if (modulo == 0) {
        System.out.println("esse número é par");
      } else {
        System.out.println("esse número é impar");
      }
    }
}


