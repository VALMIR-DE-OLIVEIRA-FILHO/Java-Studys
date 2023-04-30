import java.util.Scanner;
public class Pagamento {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        double  valorCompra , totalCompra , mudanca, parcela, valoracrescido;
        int codigo;
        System.out.printf("Insira o valor da compra R$:");
        valorCompra= ler.nextInt();
        System.out.println("Digite 1 para selecionar a forma de pagamento à vista com 8 por cento de desconto");
        System.out.println("Digite 2 para selecionar a forma de pagamento à vista com cartão para obter 4 por cento de desconto");
        System.out.println("Digite 3 para selecionar a forma de pagamento em 2x sem juros");
        System.out.println("Digite 4 para selecionar a forma de pagamento em 4x com preço acrescido em 8 por cento");
        codigo= ler.nextInt();
        
        if(codigo == 1) {
            mudanca = valorCompra * 8 / 100;
            totalCompra = valorCompra - mudanca;
            System.out.print(mudanca);
          System.out.println("o total da sua compra foi de R$" + totalCompra + " com 8 porcento de desconto");
        } else if (codigo==2) {
            mudanca = valorCompra * 4/100;
            totalCompra = valorCompra - mudanca;
            System.out.println("o total da sua compra foi de R$" + totalCompra + " com 4 por cento de desconto");
        } else if (codigo ==3 ) {
            totalCompra = valorCompra ;
            parcela = valorCompra / 2;
            System.out.println("o total da sua compra foi de R$" + totalCompra + " feita em 2x com o valor das parcelas em R$"+ parcela);
        } 
        else if (codigo ==4 ) {
            mudanca = valorCompra* 8/100;
            valoracrescido = valorCompra + mudanca;
            parcela = valoracrescido/ 4;
            System.out.println("o total da sua compra foi de R$" + valorCompra + " com acréscimo de 8 por cento passou para R$" + valoracrescido +  " as parcelas são de R$" + parcela );
        }else{
            System.out.println("Não foi possível concluir essa operação");
        }
       
        }
    }
    

