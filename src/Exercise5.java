import java.util.Scanner;
public class Exercise5 {


    /*
    Efetuar o cálculo da quantidade de litros de combustível gasta em uma viagem, utilizando um automóvel que faz
    12 Km por litro. Para obter o cálculo, o usuário deve fornecer o tempo gasto na viagem e a velocidade média.
    Desta forma, será possível obter a distância percorrida com a fórmula DISTANCIA = TEMPO * VELOCIDADE.
    Tendo o valor da distância, basta calcular a quantidade de litros de combustível utilizada na viagem com a
    fórmula: LITROS_USADOS = DISTANCIA / 12. O programa deve apresentar os valores da velocidade média,
    tempo gasto, a distância percorrida e a quantidade de litros utilizada na viagem. Dica: trabalhe com valores reais

    */


    // 12 Km por Litro
    // Tempo Gasto e Velocidade Média.
    // DISTANCIA = TEMPO * VELOCIDADE.
    // LITROS USADOS = DISTANCIA / 12
    // Apresentar Velocidade média, tempo gasto, distância percorrida e quantidade de litros

    public static void main(String[]args){

        // Declarando Variáveis
        float vel;
        float temp;
        float dist;
        float litros;

        // Iniciando o Scanner
        Scanner input = new Scanner(System.in);
        // Recebendo Dados
        System.out.print("Digite o Tempo Gasto em sua viagem em Horas: ");
        temp = input.nextFloat();
        System.out.print("Digite a sua velocidade média em Km/h: ");
        vel = input.nextFloat();
        // Calculando a Distância da Viagem
        dist = (temp * vel);
        // Calculando a Quantidade de Litros Utilizada na Viagem
        litros = (dist / 12);
        // Apresentando Dados
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=");
        System.out.printf("Velocidade Média: %.1fKm/h\n", vel);
        System.out.printf("Tempo Gasto: %.1fHrs\n", temp);
        System.out.printf("Distância Percorrida: %.1fKm\n", dist);
        System.out.printf("Litros Gastos: %.1fL\n", litros);
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=");
    }
}
