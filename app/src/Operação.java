import java.util.Scanner;

public class Operação {
    public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);

        String operacao;

        double x , y, resultado;

        System.out.println("informe a operação (+ - * /) :");
        operacao = ler.next();
        System.out.println("Informe o valor de x:");
        x = ler.nextDouble();
        System.out.println("Informe o valor de y:");
        y = ler.nextDouble();

        switch (operacao) {
            case "+":
                resultado = x + y;
                break;
            case "-":
                resultado = x - y;
                break;
            case "*":
                resultado = x * y;
                break;
            case "/":
                resultado = x / y;
                break;
            default:
                resultado = 0;
                System.out.println("não foi possível concluir esssa operação");
                break;
        }
        System.out.print(resultado);
    }
}
