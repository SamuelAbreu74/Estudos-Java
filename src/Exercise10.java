import java.util.Scanner;
public class Exercise10 {
    /*
    Escrever um programa que leia dois números inteiros e mostre todos os relacionamentos de ordem existentes
    entre eles. Os relacionamentos possíveis são: Igual, Não igual, Maior, Menor, Maior ou igual, Menor ou igual.
    */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int num1;
        int num2;
        boolean igual;
        boolean dif;
        boolean maior;
        boolean menor;
        boolean maior_igual;
        boolean menor_igual;

        System.out.println("Digite 2 números: ");
        num1 = input.nextInt();
        num2 = input.nextInt();

        // Igual
        if (num1 == num2) {
            igual = true;
        }else{
            igual = false;
        }
            // Não Igual
        if (num1 != num2){
            dif = true;
        }else{
            dif = false;
        }
            // Maior
        if (num1 > num2){
            maior = true;
        }else{
            maior = false;
        }
            // Menor
        if (num1 < num2){
            menor = true;
        }else{
            menor = false;
        }
            // Maior ou Igual
        if (num1 >= num2){
            maior_igual = true;
        }else{
            maior_igual = false;
        }
            // Menor ou Igual
        if (num1 <= num2){
            menor_igual = true;
        }else{
            menor_igual = false;
        }
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
        System.out.println("Relações entre os dois números:");
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
        System.out.printf("Igual = %b\n", igual);
        System.out.printf("Diferente = %b\n", dif);
        System.out.printf("Maior = %b\n", maior);
        System.out.printf("Menor = %b\n", menor);
        System.out.printf("Maior ou Igual = %b\n", maior_igual);
        System.out.printf("Menor ou Igual = %b\n", menor_igual);
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");

    }
}
