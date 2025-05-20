import java.util.Scanner;
public class Exercise13 {
    /*
     Escreva um programa que leia 3 números inteiros e imprima na tela os valores em ordem decrescente.
    */


    public static void main(String[] args) {

        // Declarando Variáveis
        int num1;
        int num2;
        int num3;
        int temp;

        // Declarando Variáveis
        Scanner input = new Scanner(System.in);

        // Recebendo Dados
        System.out.print("Digite o Primeiro Valor: ");
        num1 = input.nextInt();
        System.out.print("Digite o Segundo Valor: ");
        num2 = input.nextInt();
        System.out.print("Digite o Terceiro Valor: ");
        num3 = input.nextInt();

        // Verificando as Condições Possíveis


        if (num1 < num3){ // Se o valor de num1 for menor que num3, num1 vai receber o maior valor
            temp = num1;
            num1 = num3;
            num3 = temp;
        } else if (num1 < num2) { // Se o valor de num1 for menor que num2, num1 vai receber o maior valor
            temp = num1;
            num1 = num2;
            num2 = temp;
        }else if (num2 < num3){ // Se o valor de num2 for menor que num3, num2 vai receber o maior valor
            temp = num2;
            num2 = num3;
            num3 = temp;
        }

        // Apresentando Dados
        System.out.println("Valores em Ordem Decrescente:");
        System.out.printf("%d %d %d", num1, num2, num3);
    }
}
