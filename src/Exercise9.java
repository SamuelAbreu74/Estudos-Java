import java.util.Scanner;
public class Exercise9 {
    /*
    Faça um algoritmo que leia a idade de uma pessoa expressa em anos, meses e dias e escreva a idade dessa
    pessoa expressa apenas em dias. Considerar ano com 365 dias e mês com 30 dias.
    */
    public static void main(String[] args) {

        // Declarando Variáveis
        int ano;
        int mes;
        int dia;

        // iniciando Scanner
        Scanner input = new Scanner(System.in);

        // Solicitando Dados
        System.out.println("Digite a sua idade de acordo com os dados solicitados:");
        System.out.println("Anos:");
        ano = input.nextInt();
        System.out.println("Meses:");
        mes = input.nextInt();
        System.out.println("Dias:");
        dia = input.nextInt();

        // Calculo Idade em Dias
        dia = dia + (ano * 365) + (mes * 30);

        // Apresentando Conversão
        System.out.printf("Parabéns! Você está vivo %d Dias!", dia);


    }
}
