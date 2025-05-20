import java.util.Scanner;
public class Exercise14 {
    /*
    Escreva um programa que leia dois números e apresente a diferença do maior para o menor.
    */

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int num1;
        int num2;
        int temp;
        int dif;

        System.out.println("Digite 2 Valores: ");
        num1 = input.nextInt();
        num2 = input.nextInt();

        // Transformando o num1 no maior valor se necessário
        if (num1 < num2){
            temp = num1;
            num1 = num2;
            num2 = temp;
        }

        // Calculando a diferença
        dif = num1 - num2;
        System.out.printf("A Diferença entre %d e %d = %d", num1, num2, dif);


    }
}
