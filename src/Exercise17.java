import java.util.Scanner;
public class Exercise17 {

    /*
    Escreva um programa que leia um número inteiro. Verificar por meio de condição se o valor fornecido está na faixa
    entre 0 (zero) e 9 (nove). Caso o valor fornecido esteja dentro da faixa, apresentar a mensagem “valor válido”.
    Caso contrário, apresentar a mensagem “valor inválido”.
    */

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int num;

        System.out.println("Digite um número inteiro: ");
        num = input.nextInt();

        if (num >= 0 && num <= 9){
            System.out.println("Valor Válido");
        }else{
            System.out.println("Valor Inválido");
        }
    }
}
