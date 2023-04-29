import java.util.Scanner;

public class Idade {
    public static void main(String[] args) {
      Scanner ler = new Scanner(System.in);
      int idade;
      System.out.printf("Informe a sua idade:");
      idade= ler.nextInt();

      if (idade >= 18) {
        System.out.println("você é maior de idade");
      } else {
        System.out.println("você é menor de idade");
      }
    }
}
