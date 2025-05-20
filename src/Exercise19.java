import java.util.Scanner;
public class Exercise19 {

    /*
    Escreva um programa que leia três valores para os lados de um triângulo (variáveis A, B e C). Verificar se cada
    lado é menor que a soma dos outros dois lados. Se sim, saber de A==B e se B==C, sendo verdade o triângulo é
    eqüilátero; Se não, verificar de A==B ou se A==C ou se B==C, sendo verdade o triângulo é isósceles; e caso
    contrário, o triângulo será escaleno. Caso os lados fornecidos não caracterizarem um triângulo, avisar a
    ocorrência.
    */



    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        int a;
        int b;
        int c;

        System.out.println("Digite o valor do 1° Lado");
        a = input.nextInt();
        System.out.println("Digite o valor do 2° Lado");
        b = input.nextInt();
        System.out.println("Digite o valor do 3° Lado");
        c = input.nextInt();

        if (a < (b + c) && (b < (a + c)) && (c < (a + b))){
            if (a==b && b==c){
                System.out.println("Seu Triângulo é EQUILÁTERO");
            }else if (a==b){
                System.out.println("Seu Triângulo é ISÓSCELES");
            }else if(a==c){
                System.out.println("Seu Triângulo é ISÓSCELES");
            }else if(b==c){
                System.out.println("Seu Triângulo é ISÓSCELES");
            }else {
                System.out.println("Seu Triângulo é ESCALENO");
            }
        }else{
            System.out.println("Você formou um triângulo Inválido!");
        }
    }
}


