import java.util.Scanner;
public class Exercise15 {
    /*
    Escreva um programa que leia quatro notas escolares de um aluno e apresentar uma mensagem que o aluno foi
    aprovado se o valor da média escolar for maior ou igual a 7. Se o valor da média for menor que 7, solicitar a nota
    do recuperação, somar com o valor da média e obter a nova média. Se a nova média for maior ou igual a 7,
    apresentar uma mensagem informando que o aluno foi aprovado na recuperação. Se o aluno não foi aprovado,
    apresentar uma mensagem informando esta condição. Apresentar com as mensagens o valor da média do
    aluno.
    */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Declarando Variáveis
        float nota1;
        float nota2;
        float nota3;
        float nota4;
        float med;
        float rec;

        System.out.println("Digite a sua 1° nota:");
        nota1 = input.nextFloat();
        System.out.println("Digite a sua 2° nota:");
        nota2 = input.nextFloat();
        System.out.println("Digite a sua 3° nota:");
        nota3 = input.nextFloat();
        System.out.println("Digite a sua 4° nota:");
        nota4 = input.nextFloat();

        med = (nota1 + nota2 + nota3 + nota4) / 4;

        if (med >= 7){
            System.out.printf("APROVADO com média %.2f", med);
        }else{
            System.out.println("Digite sua Nota de Recuperação:");
            rec = input.nextFloat();

            med = (med + rec) / 2;

            if (med >= 7){
                System.out.printf("APROVADO com média %.2f", med);
            }else{
                System.out.printf("REPROVADO com média %.2f", med);
            }
        }
    }
}
