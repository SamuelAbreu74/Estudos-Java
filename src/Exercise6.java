import java.util.Scanner;
public class Exercise6 {

    /*
    Ler uma temperatura em graus Celsius e apresentá-Ia convertida em graus Fahrenheit. A fórmula de conversão de
    temperatura a ser utilizada é F = (9 * C + 160) / 5, em que a variável F representa é a temperatura em graus
    Fahrenheit e a variável C representa é a temperatura em graus Celsius.


    Fórmula: F = (9 * C + 160) / 5
    */

    public static void main(String[]args){

        // Declarando Variáveis
        float C;
        float F;

        // Iniciando Scanner
        Scanner input = new Scanner(System.in);

        // Recebendo Celcius
        System.out.print("Digite sua temperatura em °C (graus Celcius):");
        C = input.nextFloat();

        // Convertendo
        F = (9 * C + 160) / 5;

        // Apresentando Dados
        System.out.printf("A Conversão dessa temperatura para Fahrenheit fica: %.2f°F", F);
    }
}
