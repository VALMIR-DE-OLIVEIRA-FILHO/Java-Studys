import java.util.Scanner;


public class Classificação_produto {
    public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);
    int codigo;
    System.out.printf("Informe o código do produto:");
    codigo= ler.nextInt();
    
    if(codigo == 1) {
      System.out.println("este alimento é não perecível");
    } else if (codigo >= 2 && codigo <= 4) {
        System.out.println("este alimento é perecível");
    } else if (codigo == 5 || codigo == 6 ) {
        System.out.println("este produto é de vestuário");
    } 
    else if (codigo >= 7 && codigo <= 12 ) {
        System.out.println("este produto é de limpeza");
    }else{
        System.out.println("produto não encontrado");
    }
   
    }
}
