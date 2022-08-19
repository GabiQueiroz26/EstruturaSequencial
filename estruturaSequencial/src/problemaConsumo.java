import java.util.Scanner;

public class problemaConsumo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int distancia;
        double combustivelGasto, consumoMedio;

        System.out.println("Digite a distância total percorrida (em km): ");
        distancia = sc.nextInt();
        System.out.println("Digite o total de combustível gasto: ");
        combustivelGasto = sc.nextDouble();

        consumoMedio = distancia / combustivelGasto;
        System.out.printf("O Consumio médio é = %.3f ", consumoMedio);
    }
}
