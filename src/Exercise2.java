import java.util.Scanner;
public class Exercise2 {
    /*
    Faça um programa que:
       - Leia a cotação do dólar
       - Leia um valor em dólares
       - Converta esse valor para Real
       - Mostre o resultado
*/

    public static void main(String[]args) {

        //Declarar Variáveis
        double cot;
        double valor;
        double real;

        //Criar Input
        Scanner input = new Scanner(System.in);

        // Ler cotação
        System.out.print("Digite a Cotação atual do dólar: ");
        cot = input.nextDouble();

        // Valor em Dólar
        System.out.print("Digite o valor em dólar: ");
        valor = input.nextDouble();

        // Conversão
        real = valor * cot;


        // Mostrar Resultado
        System.out.printf("Na cotação atual $%.2f dólares equivale à R$%.2f Reais", valor, real);
    }
}
