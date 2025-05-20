import java.util.Scanner;
public class Exercise7 {
    /*
    Ler uma temperatura em graus Fahrenheit e apresentá-Ia convertida em graus Celsius. A fórmula de conversão de
    temperatura a ser utilizada é C = (F - 32) * 5 / 9, em que a variável F é a temperatura em graus Fahrenheit e a
    variável C é a temperatura em graus Celsius
    */


    public static void main(String[]args){

        float C;
        float F;

        Scanner input = new Scanner(System.in);


        System.out.print("Digite um valor em °F (Graus Fahrenheit): ");
        F = input.nextFloat();

        C = (F - 32) * 5 / 9;

        System.out.printf("O seu valor convertido para °C (Graus Celcius) é: %.2f°C", C);

    }
}
