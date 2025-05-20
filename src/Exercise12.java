import java.util.Scanner;
public class Exercise12 {
    /*
    Escreva um programa que leia um número inteiro e exiba o seu módulo.
    O módulo de um número x é:
    x se x é maior ou igual a zero
    x * (-1) se x é menor que zero
    */
    public static void main(String[] args) {

        int num1;
        int mod;

        Scanner input = new Scanner(System.in);


        System.out.print("Digite o Valor Inteiro: ");
        num1 = input.nextInt();

        // Calculando o Módulo de acordo com a Condição
        if (num1 >= 0){
            mod = num1;
            System.out.printf("O valor do módulo de X é (%d). (Ele mesmo) Pois é maior ou igual à 0", mod);
        }else{
            mod = num1 * (-1);
            System.out.printf("O valor do módulo de X é (%d). Pois é menor que 0", mod);
        }

    }
}
