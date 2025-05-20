import java.util.Scanner;
import java.util.Stack;
public class Exercise3 {

    /*
       Faça um programa para pagamento de comissão de vendedores de peças, levando-se em consideração que sua
        comissão será de 5% do total da venda e que você tem os seguintes dados:
            - Identificação do vendedor
            - Código da peça
            - Preço unitário da peça
            - Quantidade vendida
    */



    public static void main(String[]args){

        Scanner input = new Scanner(System.in);
        Stack<Integer> itens = new Stack<>();

        String vendedor = "";
        int cod_peca;
        double valor_peca;
        int opcao;
        double tot_venda = 0;
        double comissao = 0;


        System.out.println("-=-=-=-=-=- Realize seu Pagamento aqui! -=-=-=-=-=-");
        System.out.println("1- Realizar Pagamento");
        System.out.println("0- Sair");
        System.out.print("Digite sua Escolha: ");
        opcao = input.nextInt();
        input.nextLine(); // Retirar a quebra de linha, para não duplicar a próxima pergunta
        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=--=-=-=-=-=-=-=-=-=-=");

            // Indentificação do vendedor
            System.out.print("Digite o nome do Vendedor: ");
            vendedor = input.nextLine();
        while (opcao == 1){
            if (!vendedor.isEmpty()) {
                // Código da peça
                System.out.print("Digite o código da peça: ");
                cod_peca = input.nextInt();
                itens.push(cod_peca);  //Acrescenta 1 item a pilha

                // Preço unitário da peça
                System.out.print("Digite o valor da peça: R$");
                valor_peca = input.nextDouble();

                // Quantidade vendida
                System.out.println("A quantidade de produtos vendida foi de " + itens + " peças");

                // Calculo Comissão
                tot_venda = tot_venda + valor_peca;
                comissao = (tot_venda / 100) * 5;
                System.out.printf(vendedor + ", O valor total da Comissão atual é: R$%.2f\n", comissao);


                System.out.println("-=-=-=--=-=-=-=-=-");
                System.out.println("1- Continuar");
                System.out.println("0- Encerrar");
                System.out.println("-=-=-=--=-=-=-=-=-");
                opcao = input.nextInt();

                if (opcao == 0){
                    System.out.println("-=-=-=--=-=-=-=-=--=-=-=--=-=-=-=-=--=-=-=--=-=-=-=-=-");
                    System.out.printf("O valor Total da compra ficou de R$%.2f\n",tot_venda);
                    System.out.printf("O valor Total da sua Comissão ficou de R$%.2f\n", comissao);
                    System.out.println("-=-=-=--=-=-=-=-=--=-=-=--=-=-=-=-=--=-=-=--=-=-=-=-=-");
                    System.exit(0);
                }
            }

        }







    }
}
