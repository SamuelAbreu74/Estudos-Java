import java.util.Scanner;
public class Exercise1 {
    /*
    Faça um programa para calcular o estoque médio de uma peça, sendo que:
    ESTOQUE MÉDIO = (QUANTIDADE_MÍNIMA + QUANTIDADE_MÁXIMA) / 2.
*/

    public static void main(String[]args){

        int est_medio;
        int min;
        int max;

        Scanner input = new Scanner(System.in);

        System.out.print("Digite seu valor mínimo: ");
        min = input.nextInt();

        System.out.print("Digite seu valor máximo: ");
        max = input.nextInt();

        est_medio = (min + max) / 2;

        System.out.printf("O seu estoque médio deste item é de: %d", est_medio);









    }
}