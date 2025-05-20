import java.util.Scanner;
public class Exercise8 {
    /*
    Calcular e apresentar o valor do volume de uma lata de óleo, utilizando a fórmula:
        V = 3.14159 * R * R * A
    Onde as variáveis: V, R e A representam respectivamente o volume, o raio e a altura.
    */


    public static void main(String[] args) {

        float V;
        float R;
        float A;

        Scanner input = new Scanner(System.in);

        // Recebendo Dados
        System.out.println("Digite as seguintes medidas da lata: ");
        System.out.println("Raio: ");
        R = input.nextFloat();
        System.out.println("Altura: ");
        A = input.nextFloat();

        // Caculando Volume
        V = (float) (3.14159 * R * R * A);




    }
}
