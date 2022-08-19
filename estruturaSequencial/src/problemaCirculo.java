import java.util.Scanner;

public class problemaCirculo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double r, area, quadrado;

        System.out.println("Digite o valor do raio do círculo: ");
        r = sc.nextDouble();

        quadrado = Math.pow(r, 2);
        area = 3.14159 * quadrado;

        System.out.printf("Área do círculo = %.3f", area);
    }
}
