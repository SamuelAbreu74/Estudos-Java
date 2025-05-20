import java.util.Scanner;
public class Exercise11 {
    /*
    Ler dois valores inteiros para as variáveis A e B, efetuar a troca dos valores de modo que a variável A passe a
    possuir o valor da variável B, e a variável B passe a possuir o valor da variável A. Apresentar os valores trocados.
    */
    public static void main(String[] args) {

        // Declarando Variáveis
        int A;
        int B;
        int T; // Variável temporária

        // Iniciando Scanner
        Scanner input = new Scanner(System.in);

        // Recebendo Dados
        System.out.println("Digite o valor de A: ");
        A = input.nextInt();
        System.out.println("Digite o valor de B: ");
        B = input.nextInt();

        // Trocar Valores
        T = A;
        A = B;
        B = T;

        // Apresentando Dados
        System.out.println("Valores Trocados:");
        System.out.printf("A = %d\n", A);
        System.out.printf("B = %d", B);
    }
}
