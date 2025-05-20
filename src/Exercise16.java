import java.util.Scanner;
public class Exercise16 {

    /*
    Escreva um programa que leia dois números e exiba mensagem informando o valor do maior número e o valor do
    menor número. Se os dois números forem iguais, o programa deve exibir mensagem informando este fato.
    */
    public static void main(String[] args) {

        // Iniciando Scanner
        Scanner input = new Scanner(System.in);

        // Declarando Variáveis
        int num1;
        int num2;

        // Recebendo Dados
        System.out.println("Digite o 1° número: ");
        num1 = input.nextInt();
        System.out.println("Digite o 2° número: ");
        num2 = input.nextInt();

        // Verificando Condições
        if(num1 > num2){
            System.out.printf("%d é maior que %d", num1, num2);
        }else if (num1 == num2){
            System.out.printf("%d é igual à %d", num1, num2);
        }else{
            System.out.printf("%d é menor que %d", num1, num2);
        }
    }
}
