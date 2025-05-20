import java.util.Scanner;
public class Exercise4 {

    /*
    Ler quatro valores numéricos inteiros e apresentar o resultado dois a dois da adição e multiplicação entre os
    valores lidos, baseando-se na utilização do conceito de propriedade distributiva. Dica: se forem lidas as variáveis
    A, B, C e D, devem ser somados e multiplicados os valores de A com B, A com C e A com D; depois B com C, B
    com D e por último C com D. Note que para cada operação serão utilizadas seis combinações. Assim sendo,
    devem ser realizadas doze operações de processamento, sendo seis para as adições e seis para as
    multiplicações.

    */


    public static void main(String[]args){

        Scanner input = new Scanner(System.in);

        // Declarando Variáveis
        int a;
        int b;
        int c;
        int d;

        // Recebendo Valores
        System.out.print("Digite o valor de A: ");
        a = input.nextInt();
        System.out.print("Digite o valor de B: ");
        b = input.nextInt();
        System.out.print("Digite o valor de C: ");
        c = input.nextInt();
        System.out.print("Digite o valor de D: ");
        d = input.nextInt();

        //Mostrando Calculos (A)
        System.out.printf("A soma de A + B = %d\t //", a + b);
        System.out.printf(" A multiplicação de A * B = %d\n", a * b);
        System.out.printf("A soma de A + C = %d\t //", a + c);
        System.out.printf(" A multiplicação de A * C = %d\n", a * c);
        System.out.printf("A soma de A + D = %d\t //", a + d);
        System.out.printf(" A multiplicação de A * D = %d\n", a * d);



        // Mostrando Calculos (B)
        System.out.printf("A soma de B + C = %d\t //", b + c);
        System.out.printf(" A multiplicação de B * C = %d\n", b * c);
        System.out.printf("A soma de B + D = %d\t //", b + d);
        System.out.printf(" A multiplicação de B * D = %d\n", b * d);


        // Mostrando Calculos (C)
        System.out.printf("A soma de C + D = %d\t //", c + d);
        System.out.printf(" A multiplicação de C * D = %d\n", c * d);




    }
}
